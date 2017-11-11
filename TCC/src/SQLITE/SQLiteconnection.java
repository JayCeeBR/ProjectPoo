/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLITE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jerlyson
 */
public class SQLiteconnection {
    private Connection conexao;
    
    public boolean Conectar(){
    try{
        String url = "jdbc:sqlite:/home/jerlyson/Desktop/TCC/sqlite/AS.db";   
        this.conexao = DriverManager.getConnection(url);
        System.out.println("Conectou");
        
    }catch(SQLException e){
        System.out.println(e.getMessage());
        return false;
    }  
        
     return true;
    }
    
    public boolean Desconnectar(){
        try{
            if(this.conexao.isClosed() == false){
                this.conexao.close();
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
        
        return true;
    }
    
    
    
    public Statement criarStatement(){
        try{
            return this.conexao.createStatement();
        }catch(SQLException e){
            return null;
        }
    }
    
    public PreparedStatement criarPreparedStatement(String sql){
        try{
            return this.conexao.prepareStatement(sql);
        }catch(SQLException e){
            return null;
        }
    }
    
    public Connection getConexao(){
        return this.conexao;
    }
    
}
