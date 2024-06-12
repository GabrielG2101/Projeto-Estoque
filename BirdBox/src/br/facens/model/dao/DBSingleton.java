
package br.facens.model.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class DBSingleton {
    private Connection conexao;
    private static DBSingleton instancia = null;
    
   private DBSingleton()throws SQLException{
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/BirdBox?user=root&password=");//mudar porta sempre
    }
    
    public static DBSingleton getInstancia()throws SQLException{
        if(instancia == null)
            instancia = new DBSingleton();
            return instancia;
        
    }
    public Connection getConexao(){
        return conexao;
    }
    public void close()throws SQLException{
        conexao.close();
    }
}