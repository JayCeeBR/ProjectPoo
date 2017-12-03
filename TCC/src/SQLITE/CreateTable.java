/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLITE;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


/**
 *
 * @author Jerlyson123
 */
public class CreateTable {
    
    private final SQLiteconnection cnn;
    
    public CreateTable(SQLiteconnection pcnn){
        this.cnn = pcnn;
        
    }

    public CreateTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void createTablea(String ida){
        
        String sql = "CREATE TABLE '"+ ida
                + "' ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "materia VARCHAR(50),"
                + "nota1 INTEGER,"
                + "nota2 INTEGER,"
                + "nota3 INTEGER,"
                + "nota4 INTEGER,"
                + "faltas INTEGER);";
        
        boolean conectou = false;
        
        try{
            conectou = this.cnn.Conectar();
            Statement stmt = this.cnn.criarStatement();
            
            stmt.execute(sql);
            
        }catch(SQLException e){
            System.out.println("Erro criação");
        }finally{
            if(conectou){
                this.cnn.Desconnectar();
            }
        }
        
    }
    
    
    
    public List<String> quant = new ArrayList<>();
    
    public boolean lenTable(String table){
        SQLiteconnection cnn = new SQLiteconnection(); 
        
        
        ResultSet resultset = null;
        Statement statement = null;
        
        
        cnn.Conectar();
        
        String query = "SELECT * FROM "+ table + ";";
        
        statement = cnn.criarStatement();
        
        try{
            resultset = statement.executeQuery(query);
            
            while(resultset.next()){
                
                String test = resultset.getString("a_nome");
                quant.add(test);
                               
                    
            }
                
            
        }catch(SQLException e){
            System.out.println(e);
        }finally{
            try {
                resultset.close();
                statement.close();
                cnn.Desconnectar();
            } catch (SQLException ex) {
                System.out.println("Erro Exist");
            }
           
        }
        
        return false;
    }
    
}
