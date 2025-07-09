
package com.mycompany.finanzas_bancarias.infrastructure.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PersistenceManager {
    private static final String DB_URL = "jdbc:sqlite:taskmanager.db";
    private static final String USUARIO = "user_leonel98";
    private static final String CLAVE = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
    }
}
