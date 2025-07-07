/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finanzas_bancarias;

/**
 *
 * @a//leonel alvarez
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Finanzas_bancarias {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=..."; // Reemplaza con tu DB
        String usuario = "user_leonel98";
        String clave = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, clave)) {
            System.out.println("Conexión exitosa");
            System.out.println("prueba");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
