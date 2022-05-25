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
    
    public String[] cargarPalabrasParaAleatoria() throws IOException {
        String arraypalabras[] = null;
        int posicion = 0;
        if(fichero.exists()){
            try(BufferedReader br = new BufferedReader(new FileReader(fichero))){
                int numeroLineasFichero = Math.toIntExact(br.lines().count());
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
                br.close();
                return arraypalabras;
        }
         }else{
            throw new FileNotFoundException("El fichero no existía en la ruta: " +  fichero.getAbsolutePath() +" ahora ya a sido creado,añadale palabras para empezar a jugar");
            }
        
    }

   @Override
    public String palabraAleatoria() throws IOException {
        String arrayPalabras[] = cargarPalabrasParaAleatoria();
        java.util.Random aleatorio  = new java.util.Random();
        int randomToInt = aleatorio.nextInt(arrayPalabras.length);
        return arrayPalabras[randomToInt];
    }

    @Override
    public boolean existePalabra(String palabra) {
        return palabras.contains(palabra);
        
    }

    @Override
    public boolean borrarPalabra(String palabra) throws IOException  {
        
        boolean borrado = false;
        if(!existePalabra(palabra)){
            borrado = false;
        }
        else{
            palabras.remove(palabra);
            Iterator<String> it =  palabras.iterator();
            if(fichero.exists() && fichero.canWrite()){
                try(Writer wr = new BufferedWriter(new FileWriter(fichero))){
                    while(it.hasNext()){
                        String palabras = it.next();
                        wr.write(palabra + "\n");
                    }
                    borrado = true;
                    wr.close();
                }
            }else{
                throw new IOException("Error al borrar la palabra");
            }
        }
        return borrado;
    }

    @Override
    public boolean añadirPalabra(String palabra) throws IOException  {
        boolean añadido = false;
        if(existePalabra(palabra)){
            añadido = false;
        }
        else{
            palabras.add(palabra);
            Iterator<String> it =  palabras.iterator();
            if(fichero.exists() && fichero.canWrite()){
                try(Writer wr = new BufferedWriter(new FileWriter(fichero.getAbsoluteFile(),true))){
                    while(it.hasNext()){
                        String palabras = it.next();
                        wr.write(palabra + "\n");
                    }
                    this.palabras.clear();
                    añadido = true;
                }
            }else{
                throw new IOException("Error al añadir la palabra");
            }
        }
        return añadido;
    }

    @Override
    public boolean recargarDatos() throws Exception {
        if(this.cargarPalabras().size() > 0){
            this.cargarPalabras().clear();
            this.cargarPalabrasParaAleatoria();
            cargarPalabras();
            this.palabraAleatoria();
            return true;
        }
        else if(this.cargarPalabras().size() ==0){
            cargarPalabras();
            this.palabraAleatoria();
            return true;
        }
        else{
            return false;
        }
    }
    
}
