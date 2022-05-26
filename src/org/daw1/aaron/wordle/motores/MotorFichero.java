/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.aaron.wordle.motores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mozop
 */
public class MotorFichero implements IMotor{
    
    private static File fichero = new File("." + File.separator + "data" + File.separator + "fichero.txt");
    
    private Set<String> palabras = new TreeSet<>();
    
    private Set<String> cargarPalabras() throws IOException {
        palabras.clear();
        if(fichero.exists()){
            try(BufferedReader br = new BufferedReader(new FileReader(fichero))){
                String linea = br.readLine();
                while(linea != null){
                    if(linea.length() == 5){
                       palabras.add(linea);
                       linea = br.readLine();
                    }else{
                        linea = br.readLine();
                    }
                }
            }
        }
        return palabras;
    }
    
    public int contarLineas() throws IOException{
        int lineas = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(fichero))){
            String linea = br.readLine();
            while(linea != null){
                lineas++;
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lineas;
    }
    
    public String[] cargarPalabrasParaAleatoria() throws IOException {
        String arraypalabras[];
        int posicion = 0;
        
        if(fichero.exists()){
            try(BufferedReader br = new BufferedReader(new FileReader(fichero))){
                int numeroLineasFichero = contarLineas();
                arraypalabras = new String[numeroLineasFichero];
                String linea = br.readLine();
                while(linea != null){
                    if(linea.length()==5){
                        arraypalabras[posicion] = linea;
                        posicion ++;
                        linea = br.readLine();
                    }else{
                        linea = br.readLine();
                    }
                }
                return arraypalabras;
        }
         }else{
            throw new FileNotFoundException("El fichero no existía en la ruta: " +  fichero.getAbsolutePath() +" ahora ya a sido creado,añadale palabras para empezar a jugar");
            }
        
    }

   @Override
    public String palabraAleatoria() throws IOException {
        String[] array = this.cargarPalabrasParaAleatoria();
        int rd = new java.util.Random().nextInt(array.length);
        return array[rd];
    }

    @Override
    public boolean existePalabra(String palabra) throws IOException {
        this.cargarPalabras();
        return palabras.contains(palabra);
        
    }

    @Override
    public boolean borrarPalabra(String palabra) throws IOException  {
        boolean borrado = false;
        this.cargarPalabras();
        if(!existePalabra(palabra)){
            borrado = false;
        }
        else{
            palabras.remove(palabra);
            Iterator<String> it =  palabras.iterator();
            if(fichero.exists() && fichero.canWrite()){
                try(Writer wr = new BufferedWriter(new FileWriter(fichero.getAbsoluteFile(),false))){
                    while(it.hasNext()){
                        String pal = it.next();
                        wr.write(pal + "\n");
                    }
                    borrado = true;
                }
            }else{
                throw new IOException("Error al borrar la palabra");
            }
        }
        return borrado;
    }

    @Override
    public boolean añadirPalabra(String palabra) throws IOException  {
        this.cargarPalabras();
        boolean anadido = false;
        if(existePalabra(palabra)){
            anadido = false;
        }
        else{
            if(fichero.exists() && fichero.canWrite()){
                try(Writer wr = new BufferedWriter(new FileWriter(fichero.getAbsoluteFile(),true))){
                        wr.write(palabra + "\n");
                    anadido = true;
                }
            }else{
                throw new IOException("Error al añadir la palabra");
            }
        }
        return anadido;
    }

    @Override
    public boolean recargarDatos() throws Exception {
        this.cargarPalabras();
        return true;
    }
    
}
