/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.aaron.wordle.motores;

/**
 *
 * @author mozop
 */
public class MotorTest implements IMotor{

    @Override
    public String palabraAleatoria() throws Exception {
        String aleatoria = "CICLO";
        return aleatoria;
    }

    @Override
    public boolean existePalabra(String palabra) throws Exception {
        return true;
    }

    @Override
    public boolean borrarPalabra(String palabra) throws Exception {
        return true;
    }

    @Override
    public boolean añadirPalabra(String palabra) throws Exception {
        return true;
    }
    
}
