/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.aaron.wordle.gestionWordle;

import java.awt.Color;
import org.daw1.aaron.wordle.motores.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.JLabel;
import org.daw1.aaron.wordle.gui.MainGUI;

/**
 *
 * @author mozop
 */
public class GestionWordle {
    
    private static final java.awt.Color rojo = new java.awt.Color(255 ,0, 51);
    private static final java.awt.Color amarillo = new java.awt.Color(255 ,255, 51);
    private static final java.awt.Color verde = new java.awt.Color(0, 102, 0);
    private static final java.awt.Color negro = new java.awt.Color(255,255,255);
    
    private IMotor motor;
    private String palabraAleatoria;
    private String letraBien = "";
    private String letraMal = "";
    private String letraExiste = "";
    private Set<Character> palabraAle = new TreeSet<>();

    public GestionWordle(IMotor motor) throws Exception {
        this.motor = motor;
        this.palabraAleatoria = motor.palabraAleatoria();
    }
    
    private Set<Character> palabraAleatoriaCaracteres(){
        for (int i = 0; i < palabraAleatoria.length(); i++) {
            char c = palabraAleatoria.charAt(i);
            palabraAle.add(c);
        }
        return palabraAle;
    }
    
       public java.awt.Color[] coloresLetras(String input){
        java.awt.Color[] arrayColores = new java.awt.Color[5];
        this.letraBien="";
        this.letraExiste="";
        this.letraMal="";
        if(palabraAleatoria.equals(input)){
            for (int i = 0; i < arrayColores.length; i++) {
                arrayColores[i] = verde;
                Character cara = input.charAt(i);
                this.letraBien += Character.toString(cara);
            }
               
        }else{
            palabraAleatoriaCaracteres();
            for(int i = 0; i < input.length(); i++) {
                char caracAle = palabraAleatoria.charAt(i);
                char caracInput = input.charAt(i);
                if(caracInput == caracAle){
                    this.letraBien += Character.toString(caracInput);
                    arrayColores[i] = verde;
                }else if(caracInput != caracAle && palabraAle.contains(caracInput)){
                    this.letraExiste += Character.toString(caracInput);
                    arrayColores[i] = amarillo;
                }else {
                    this.letraMal += Character.toString(caracInput);
                    arrayColores[i] = rojo;
                }
                
            }
        }
        this.palabraAle.clear();
        return arrayColores;
    }

    public String getPalabraAleatoria() {
        return palabraAleatoria;
    }

    public String getLetraBien() {
        return letraBien;
    }

    public String getLetraMal() {
        return letraMal;
    }

    public String getLetraExiste() {
        return letraExiste;
    }

    public Set<Character> getPalabraAle() {
        return palabraAle;
    }
    
    public boolean anhadirPalabra(String palabra) throws Exception{
        return motor.añadirPalabra(palabra);        
    }
    
    public boolean borrarPalabra(String palabra) throws Exception{
        return motor.borrarPalabra(palabra);
    }    
    public boolean exitePalabra(String palabra) throws Exception{
        return motor.existePalabra(palabra);
    }
    public boolean recargarDatos() throws Exception{
       return motor.recargarDatos();
    }
    
   
}
