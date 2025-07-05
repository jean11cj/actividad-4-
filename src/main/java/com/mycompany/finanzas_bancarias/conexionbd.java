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
        String url = "jdbc:sqlserver://localhost:1433;databaseName=mi_base_datos";
        String usuario = "user_leonel98"; // usa tus datos reales
        String clave = "1234";

        return DriverManager.getConnection(url, usuario, clave);
    }
}
    

