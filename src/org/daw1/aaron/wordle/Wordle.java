/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.daw1.aaron.wordle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import org.daw1.aaron.wordle.gestionWordle.GestionWordle;
import org.daw1.aaron.wordle.gui.MainGUI;
import org.daw1.aaron.wordle.motores.MotorBaseDatos;
import org.daw1.aaron.wordle.motores.MotorFichero;
import org.daw1.aaron.wordle.motores.MotorTest;

/**
 *
 * @author mozop
 */
public class Wordle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException, Exception {
        MainGUI.main(args);
    }
    
}
