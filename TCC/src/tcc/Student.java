/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;

import SQLITE.SQLiteconnection;
import com.almworks.sqlite4java.SQLiteConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jerlyson
 */
public class Student extends People {
 
    private int course;
    private String clas;
    private int grades;

  
   
    
        
    
    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
    
    
   
    
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    
    public void seeGrades(){
        //null
    }
    
    public void seeMissings(){
        //null
    }
   
    public void submitToDB(Student stu){
        SQLiteconnection cnn = new SQLiteconnection();
        
        cnn.Conectar();

        String sqlInsert = " INSERT INTO student ("
                            + "a_login,"
                            + "a_senha,"
                            + "a_nome,"
                            + "a_sobrenome,"
                            + "a_idade,"
                            + "a_curso,"
                            + "a_turma,"
                            + "a_notas) VALUES(?,?,?,?,?,?,?,?);";


        PreparedStatement preparedStatement =  cnn.criarPreparedStatement(sqlInsert); 


        try{
             
             preparedStatement.setString(1, stu.getLogin());
             preparedStatement.setString(2, stu.getPassw());
             preparedStatement.setString(3, stu.getName());
             preparedStatement.setString(4, stu.getLastname());
             preparedStatement.setInt(5, stu.getAge());
             preparedStatement.setInt(6, stu.getCourse());
             preparedStatement.setString(7, stu.getClas());
             preparedStatement.setInt(8, stu.getGrades());


             boolean resultado = preparedStatement.execute();
             
             
             
             if(resultado == false){

                 System.out.println("IZI PEACE");
             }else{
                 System.out.println("Deu pica");
             }

         }catch(SQLException e){
             System.out.println("Fedeu");  

         }finally{
             if(preparedStatement != null){
                 try {
                     preparedStatement.close();
                 } catch (SQLException ex) {
                     System.out.println("Erro fechamento");
                 }
             }
             cnn.Desconnectar();
         }
}

    
}
