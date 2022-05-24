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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mozop
 */
public class MotorFichero implements IMotor{
    
    private static File fichero = new File("." + File.separator + "data" + File.separator + "fichero.txt");
    
    private Set<String> palabras = new HashSet<>();
    
    private Set<String> cargarPalabras() throws IOException {
        
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
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return palabras;
    }
    
    public String[] cargarPalabrasParaAleatoria() throws IOException {
        String palabras[] = null;
        if(fichero.exists()){
            try(BufferedReader br = new BufferedReader(new FileReader(fichero))){
                String linea = br.readLine();
                int numeroLineasFichero = Math.toIntExact(br.lines().count());
                palabras = new String[numeroLineasFichero];
                while(linea != null){
                    if(linea.length()==5){
                        int posicion = 0; 
                        palabras[posicion] = linea;
                        posicion ++;
                        linea = br.readLine();
                    }else{
                        linea = br.readLine();
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }// Preguntar si tendria que devolve run throws
        return palabras;
    }

   @Override
    public String palabraAleatoria() throws IOException {
        String palabras[] = cargarPalabrasParaAleatoria();
        java.util.Random aleatorio  = new java.util.Random(palabras.length);
        int randomToInt = aleatorio.nextInt();
        System.out.println(randomToInt);
        return palabras[randomToInt];
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
                } catch (IOException ex) {
                    Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
                }
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
                    añadido = true;
                } catch (IOException ex) {
                    Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return añadido;
    }
    
}
