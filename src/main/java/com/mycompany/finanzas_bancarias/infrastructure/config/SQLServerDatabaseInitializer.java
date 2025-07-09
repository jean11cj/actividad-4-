/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finanzas_bancarias.infrastructure.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.lang.model.SourceVersion;


public class SQLServerDatabaseInitializer {

    public static void initialize() {
        try (Connection conn = PersistenceManager.getConnection()) {
            Statement stmt = conn.createStatement();

            String sql = 
                "IF NOT EXISTS ( " +
                "   SELECT * FROM sysobjects WHERE name='clients' AND xtype='U' " +
                ") " +
                "BEGIN " +
                "   CREATE TABLE clients ( " +
                "       id VARCHAR(50) PRIMARY KEY, " +
                "       nombre NVARCHAR(100) NOT NULL, " +
                "       direccion NVARCHAR(200), " +
                "       tipo NVARCHAR(50) NOT NULL " +
                "   ); " +
                "END";

            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException("Error al inicializar la base de datos", e);
        }
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

 
    }

   
  


    

    

