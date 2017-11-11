/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLITE;

import java.sql.*;

/**
 *
 * @author Jerlyson
 */
public class Main {
    
    public boolean exist(String table, String tag, String text){
        
        SQLiteconnection cnn = new SQLiteconnection(); 
        
        
        ResultSet resultset = null;
        Statement statement = null;
        
        
        cnn.Conectar();
        
        String query = "SELECT * FROM "+ table +";" ;
        
        statement = cnn.criarStatement();
        
        try{
            resultset = statement.executeQuery(query);
            
            while(resultset.next()){
                
                String test = resultset.getString(tag);
                
                if(test.equals(text)){
                    return true;
                }               
                    
            }
                
            
        }catch(SQLException e){
            System.out.println(e);
        }finally{
            try{
                resultset.close();
                statement.close();
                cnn.Desconnectar();
                
            }catch(SQLException ex){
                System.out.println("Erro no fechamento");
            }
        }
        
        
        return false;
    }
}