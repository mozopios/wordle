/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.daw1.aaron.wordle.motores;

/**
 *
 * @author mozop
 */
public interface IMotor {
    public String palabraAleatoria();
    public boolean existePalabra(String palabra);
    public boolean borrarPalabra(String palabra);
    public boolean añadirPalabra(String palabra);
    
}
