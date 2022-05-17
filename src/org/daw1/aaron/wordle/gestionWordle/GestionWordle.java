/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.aaron.wordle.gestionWordle;

import org.daw1.aaron.wordle.motores.*;
import java.util.HashMap;
import java.util.Map;

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
    public Map<Character,Integer> almacenarCaracteresInputUsuario(String aleatoria){
        for (int i = 0; i < aleatoria.length(); i++) {
            char caracter = aleatoria.charAt(i);
            this.mapCaracteresInputUsuario.put(caracter, i);    
        }
        return this.mapCaracteresInputUsuario;
    }
    
    /**
     * Almacena los caracteres y la posicion de ellos de las palabras insertadas por el usuario
     * @param aleatoria
     * @return mapTodosLosCaracteresInputUsuario
     */
    public Map<Character,Integer> almacenarTodosLosCaracteresPalbrasInputUsuario(String aleatoria){
        for (int i = 0; i < aleatoria.length(); i++) {
            char caracter = aleatoria.charAt(i);
            this.mapTodosLosCaracteresInputUsuario.put(caracter, i);    
        }
        return this.mapTodosLosCaracteresInputUsuario;
    }
    
}
