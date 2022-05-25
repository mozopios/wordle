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
    public String palabraAleatoria() throws Exception;
    public boolean existePalabra(String palabra) throws Exception;
    public boolean borrarPalabra(String palabra) throws Exception;
    public boolean añadirPalabra(String palabra) throws Exception;
    public boolean recargarDatos()throws Exception;
    
}
