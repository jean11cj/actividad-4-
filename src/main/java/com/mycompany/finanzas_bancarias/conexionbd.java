/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finanzas_bancarias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */

public class conexionbd {

    public static Connection conectar() throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=..."; // Reemplaza con tu DB
        String usuario = "user_leonel98";
        String clave = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, clave)) {
            System.out.println("Conexión exitosa");
            System.out.println("prueba 2");
            return conexion;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
    }
}
    

