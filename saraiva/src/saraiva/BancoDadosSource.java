/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saraiva;
  import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.sql.DataSource;
/**

/**
 *
 * @author 11104974
 */
public class BancoDadosSource {
    
    public static String DB_CONN_STRING = "jdbc:derby://localhost:1527/saraiva";
    public static String DB_NAME = "saraiva";
    public static String USER_NAME = "";
    public static String PASSWORD = "";
    private static DataSource dataSource;
    
    public static Connection conectarBd() throws Exception {
        return DriverManager.getConnection(DB_CONN_STRING, USER_NAME, PASSWORD);
    }
}

    
    
    
  
