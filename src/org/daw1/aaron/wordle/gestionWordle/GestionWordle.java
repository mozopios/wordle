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

    
    /**
     * 
     */
    private Map<Character,Integer> mapCaracteresAleatoria = new TreeMap<>();
    
    /**
     * Almacena los caracteres y la posicion de ellos de la palabra actual insertada por el usuario
     */
    private Map<Character,Integer> mapCaracteresInputUsuario = new TreeMap<>();
    
    /**
     * Almacena los caracteres y la posicion de ellos de las palabras insertadas por el usuario
     */
    private Map<Character,Integer> mapTodosLosCaracteresInputUsuario = new TreeMap<>();
    
    private Set<Character> letrasBien = new TreeSet<>();
    private Set<Character> letrasMal = new TreeSet<>();
    private Set<Character> letrasExiste = new TreeSet<>();

    public GestionWordle(IMotor motor) throws Exception {
        this.motor = motor;
        this.palabraAleatoria = motor.palabraAleatoria();
    }
    /**
     * Almacena los caracteres y la posicion de ellos de la palabra aleatoria
     * @param aleatoria
     * @return mapCaracteresAleatoria
     */
    public Map<Character,Integer> almacenarCaracteresAleatoria(){
        for (int i = 0; i < this.palabraAleatoria.length(); i++) {
            char caracter = this.palabraAleatoria.charAt(i);
            this.mapCaracteresAleatoria.put(caracter, i);    
        }
        return this.mapCaracteresAleatoria;
    }
    
    /**
     * Almacena los caracteres y la posicion de ellos de las palabras insertadas por el usuario
     * @param aleatoria
     * @return mapTodosLosCaracteresInputUsuario
     */
    public Map<Character,Integer> almacenarTodosLosCaracteresPalbrasInputUsuario(String inputs){
        for (int i = 0; i < inputs.length(); i++) {
            char caracter = inputs.charAt(i);
            this.mapTodosLosCaracteresInputUsuario.put(caracter, i);    
        }
        return this.mapTodosLosCaracteresInputUsuario;
    }
    
    public void letrasBien(char bien){
        if(!this.letrasBien.contains(bien)){
            this.letrasBien.add(bien);
        }
    }
    
    public void letrasMal(char mal){
        if(!this.letrasBien.contains(mal) && !this.letrasMal.contains(mal)){
            this.letrasMal.add(mal);
        }
    }
    
    public java.awt.Color[] coloresLetras(String input){
        java.awt.Color[] arrayColores = new java.awt.Color[5];
        if(this.palabraAleatoria.equals(input)){
                for (int i = 0; i < arrayColores.length; i++) {
                arrayColores[i] = verde;
            }
                return arrayColores;
        }else{
            for (int i = 0; i < arrayColores.length; i++) {
                char caracter = input.charAt(i); // seguir con esto y buscar caracter en el map de aleatoria
                if(this.mapCaracteresAleatoria.containsKey(caracter) && this.mapCaracteresAleatoria.get(caracter).intValue() == i){
                    arrayColores[i] = verde;
                    this.letrasBien.add(caracter);
                }else if(this.mapCaracteresAleatoria.containsKey(caracter) && this.mapCaracteresAleatoria.get(caracter).intValue()!= i){
                    arrayColores[i] = amarillo;
                }else if(this.mapCaracteresAleatoria.containsKey(caracter) && this.mapCaracteresAleatoria.get(caracter).intValue()!= i && this.mapTodosLosCaracteresInputUsuario.containsKey(caracter)){
                    arrayColores[i] = negro;
                }else{
                    arrayColores[i] = rojo;
                    this.letrasMal.add(caracter);
                }

            }
        }
        return arrayColores;
    }
    
    public char[] palabraInput( String input){
        char[] caracteres = null;
        for (int i = 0; i < input.length(); i++) {
            caracteres[i] = input.charAt(i);
        }
        return caracteres;
    }

    public String getPalabraAleatoria() {
        return palabraAleatoria;
    }
    
    
    
}
