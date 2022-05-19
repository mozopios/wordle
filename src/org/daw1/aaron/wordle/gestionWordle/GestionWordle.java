/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.aaron.wordle.gestionWordle;

import org.daw1.aaron.wordle.motores.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mozop
 */
public class GestionWordle {
    
    
    /**
     * 
     */
    private Map<Character,Integer> mapCaracteresAleatoria = new HashMap<>();
    
    /**
     * Almacena los caracteres y la posicion de ellos de la palabra actual insertada por el usuario
     */
    private Map<Character,Integer> mapCaracteresInputUsuario = new HashMap<>();
    
    /**
     * Almacena los caracteres y la posicion de ellos de las palabras insertadas por el usuario
     */
    private Map<Character,Integer> mapTodosLosCaracteresInputUsuario = new HashMap<>();
    
    private Set<Character> letrasBien = new TreeSet<>();
    private Set<Character> letrasMal = new TreeSet<>();
    private Set<Character> letrasExiste = new TreeSet<>();
    /**
     * Almacena los caracteres y la posicion de ellos de la palabra aleatoria
     * @param aleatoria
     * @return mapCaracteresAleatoria
     */
    public Map<Character,Integer> almacenarCaracteresAleatoria(String aleatoria){
        for (int i = 0; i < aleatoria.length(); i++) {
            char caracter = aleatoria.charAt(i);
            this.mapCaracteresAleatoria.put(caracter, i);    
        }
        return this.mapCaracteresAleatoria;
    }
    
    /**
     * Almacena los caracteres y la posicion de ellos de la palabra actual insertada por el usuario
     * @param aleatoria
     * @return mapCaracteresInputUsuario
     */
    public Map<Character,Integer> almacenarCaracteresInputUsuario(String input){
        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);
            this.mapCaracteresInputUsuario.put(caracter, i);    
        }
        return this.mapCaracteresInputUsuario;
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
    
    public void letrasExiste(char existe){
        if(!this.letrasExiste.contains(existe)){
            this.letrasExiste.add(existe);
        }
    }
    
    public java.awt.Color coloresLetras(String input,MotorFichero motor){
        java.awt.Color rojo = new java.awt.Color(255 ,0, 51);
        java.awt.Color amarillo = new java.awt.Color(255 ,255, 51);
        java.awt.Color verde = new java.awt.Color(0, 102, 0);
        java.awt.Color negro = new java.awt.Color(255,255,255);
        
        String aleatoria = motor.palabraAleatoria();
        
        this.almacenarCaracteresAleatoria(aleatoria);
        this.almacenarCaracteresInputUsuario(input);
        this.almacenarTodosLosCaracteresPalbrasInputUsuario(input);
        
        java.awt.Color color = null;
        
        Iterator <Map.Entry<Character,Integer>> entriItInput = this.mapCaracteresInputUsuario.entrySet().iterator();
        
        if(input.equals(aleatoria)){
            
            return color = verde;
            
        }else{
            while(entriItInput.hasNext()){
                char caracter = entriItInput.next().getKey();
                int posicion = entriItInput.next().getValue();
                if(this.mapCaracteresAleatoria.containsKey(caracter) && this.mapCaracteresAleatoria.get(caracter).equals(posicion)){
                    this.letrasBien(caracter);
                    return color = verde;
                }else if(this.mapCaracteresAleatoria.containsKey(caracter) && !this.mapCaracteresAleatoria.get(caracter).equals(posicion) && !this.mapTodosLosCaracteresInputUsuario.containsKey(caracter)){
                    this.letrasExiste(caracter);
                    return color = amarillo;
                
                }else if(this.mapCaracteresAleatoria.containsKey(caracter) && !this.mapCaracteresAleatoria.get(caracter).equals(posicion) && !this.mapTodosLosCaracteresInputUsuario.containsKey(caracter)){
                    this.letrasExiste(caracter);
                    return color = negro;
                }else{
                    this.letrasMal(caracter);
                    return color = rojo;
                }
            }
        }
        this.mapCaracteresAleatoria.clear();
        this.mapCaracteresInputUsuario.clear();
        // como cambiar para que printe la letra en el color adeacuado y como hacer para printar los SET
        return color;
    }
    
}
