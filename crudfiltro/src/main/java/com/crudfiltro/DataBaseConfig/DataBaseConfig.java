package com.crudfiltro.DataBaseConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseConfig {

    private static String URL;
    private static String USER;
    private static String PASSWORD;
    public static Connection DBconnection;
    public static String msjConnection;
    public static boolean verifyConnection;

    private static InputStream configProperties;

    private static DataBaseConfig connection = new DataBaseConfig();

    private DataBaseConfig () {

        verifyConnection = false;
        
        try {
            configProperties = new FileInputStream("./agencia/src/main/java/com/crudfiltro/Resources/Config.properties");
            Properties properties = new Properties();
            properties.load(configProperties);
            URL = properties.getProperty("mydb.URL");
            USER = properties.getProperty("mydb.USER");
            PASSWORD = properties.getProperty("mydb.PASSWORD");
        } catch (IOException io) {
            io.printStackTrace();
        }

        try {
            DBconnection = DriverManager.getConnection(URL, USER, PASSWORD);
            verifyConnection = true;/*  */

            msjConnection = "\n:: :: :: :: :: :: :: :: :: :: :: ::\n:: Conectado a la Base de Datos  ::\n:: :: :: :: :: :: :: :: :: :: :: ::\n";
        
        } catch (SQLException msj) {
            msjConnection = "\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::\n:: ERROR AL CONECTAR! Cambie los parámetros  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::\n";

        }
        
        
        
        
    }

    public static DataBaseConfig getConnection() {

        return connection;
    }
    

    


}