/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.aaron.wordle.motores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author mozop
 */
public class MotorBaseDatosES implements IMotor {
    private static final String URL = "jdbc.sqlite:data/dbwordle.db";

    @Override
    public String palabraAleatoria(){
        String palabraAleatoria = "";
        try(Connection conn = DriverManager.getConnection(URL);
                Statement consulta = conn.createStatement();
                var rs = consulta.executeQuery("SELECT COUNT(palabra) from palabras WHERE lang = \"es\"")){
                    long numeroPalabras = rs.getLong("COUNT(palabras");
                    java.util.Random aleatorio = new java.util.Random(numeroPalabras);
                    try(Connection conne = DriverManager.getConnection(URL);
                    PreparedStatement consultaAle = conne.prepareStatement("SELECT palabra from palabras WHERE lang = \"es\" limit ?")){
                        consultaAle.setLong(1, Math.toIntExact(aleatorio));
                        try(var rsAle = consultaAle.executeQuery()){
                            palabraAleatoria = rsAle.getNString("palabra");
                        }
                    }
         
        } catch (SQLException ex) {
            Logger.getLogger(MotorBaseDatosES.class.getName()).log(Level.SEVERE, null, ex);
        }
        return palabraAleatoria;
    }

    @Override
    public boolean existePalabra(String palabra) {
        boolean existe = false;
        try(Connection conne = DriverManager.getConnection(URL);
                    PreparedStatement consultaAle = conne.prepareStatement("SELECT palabra from palabras WHERE lang = \"ga\" AND palabra = \"?\"")){
                        consultaAle.setString(1,palabra);
                        try(var rsAle = consultaAle.executeQuery()){
                            String palabraABuscar = rsAle.getString("palabra");
                            if(palabraABuscar.isBlank()){
                                existe = false;
                            }
                            else{
                                existe = true;
                            }
                        }
                    } catch (SQLException ex) {
        Logger.getLogger(MotorBaseDatosGA.class.getName()).log(Level.SEVERE, null, ex);
    }
        return existe;
    }

    @Override
    public boolean borrarPalabra(String palabra) {
        boolean borrada = false;
        if(existePalabra(palabra)){
            try(Connection conn = DriverManager.getConnection(URL);
                    PreparedStatement ps = conn.prepareStatement("DELETE FROM palabras WHERE palabra = \"?\"")){
                    ps.setString(1, palabra);
                    int borradas = ps.executeUpdate();
                    if(borradas > 0){
                        borrada = true;
                    }
            } catch (SQLException ex) {
                Logger.getLogger(MotorBaseDatosGA.class.getName()).log(Level.SEVERE, null, ex);
                borrada = false;
            }
        }
        else{
            borrada =  false;
        }
        return borrada;
    }

    @Override
    public boolean añadirPalabra(String palabra) {
        boolean insertada = false;
        if(!existePalabra(palabra)){
            try(Connection conn = DriverManager.getConnection(URL);
                    PreparedStatement ps = conn.prepareStatement("INSERT INTO palabras(palabra,lang) VALUES(\"?\",\"es\")")){
                    ps.setString(1, palabra);
                    int insertadas = ps.executeUpdate();
                    if(insertadas > 0){
                        insertada = true;
                    }
            } catch (SQLException ex) {
                Logger.getLogger(MotorBaseDatosGA.class.getName()).log(Level.SEVERE, null, ex);
                insertada = false;
            }
        }
        else{
            insertada =  false;
        }
        return insertada;
    }
    
    
}
