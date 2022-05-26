/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.aaron.wordle.motores;

import java.io.File;
import java.nio.file.Paths;
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
public class MotorBaseDatos implements IMotor {
    private static File f = new File(Paths.get(".") + File.separator + "data" + File.separator + "dbwordle.db");
    private static final String URL = "jdbc:sqlite:" + f.toString();
    
    private String idioma;

    public MotorBaseDatos(String idioma) {
        this.idioma = idioma;
    }
    @Override
    public String palabraAleatoria() throws SQLException{
        int numeroPalabras = 0;
        try(Connection conn = DriverManager.getConnection(URL);
                PreparedStatement consulta = conn.prepareStatement("SELECT COUNT(palabra) AS TOTAL from palabras WHERE lang = ?")){
                    consulta.setString(1,idioma);
                    try(var rs = consulta.executeQuery()){
                     numeroPalabras = rs.getInt("TOTAL");
                    }
        }
                    int aleatorio = new java.util.Random().nextInt(numeroPalabras);
                    try(Connection conne = DriverManager.getConnection(URL);
                    PreparedStatement consultaAle = conne.prepareStatement("SELECT palabra from palabras WHERE lang = ? limit ?,1")){
                        consultaAle.setString(1,idioma);
                        consultaAle.setInt(2,aleatorio);
                        try(var rsAle = consultaAle.executeQuery()){
                            rsAle.next();
                            return rsAle.getString("palabra");
                        }
                    }
    }

    @Override
    public boolean existePalabra(String palabra) throws SQLException {
        try(Connection conne = DriverManager.getConnection(URL);
                    PreparedStatement consultaAle = conne.prepareStatement("SELECT palabra from palabras WHERE lang = ? AND palabra = ?")){
                        consultaAle.setString(1,idioma);
                        consultaAle.setString(2,palabra);
                        try(var rsAle = consultaAle.executeQuery()){
                            return rsAle.next();
                        }
        }
    }

    @Override
    public boolean borrarPalabra(String palabra) throws SQLException {
        boolean borrada = false;
        if(existePalabra(palabra)){
            try(Connection conn = DriverManager.getConnection(URL);
                    PreparedStatement ps = conn.prepareStatement("DELETE FROM palabras WHERE lang = ? AND palabra = ?")){
                    ps.setString(1, idioma);
                    ps.setString(2, palabra);
                    int borradas = ps.executeUpdate();
                    if(borradas > 0){
                        borrada = true;
                    }else{
                        
                    }
                   
            }
        }
        else{
            borrada =  false;
        }
        return borrada;
    }

    @Override
    public boolean añadirPalabra(String palabra) throws SQLException {
        boolean insertada = false;
            if(!existePalabra(palabra)){
                try(Connection conn = DriverManager.getConnection(URL);
                        PreparedStatement ps = conn.prepareStatement("INSERT INTO palabras(palabra,lang) VALUES(?,?)")){
                        ps.setString(1, palabra);
                        ps.setString(2, idioma);
                        int insertadas = ps.executeUpdate();
                        if(insertadas > 0){
                            insertada = true;
                        }else{
                            
                        }
                }
            }
            else{
                insertada =  false;
            }
            return insertada;
    }

    @Override
    public boolean recargarDatos() throws Exception {
        return true;
    }
    
    
}
