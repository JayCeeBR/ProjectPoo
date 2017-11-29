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

    public Student(String login, String passw, String name, String lastname, int age, int course, String clas, int grades) {
        super(login, passw, name, lastname, age);
     
        this.course = course;
        this.clas = clas;
        this.grades = grades;
    }

   
    
        
    
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
    public void creatTable(){
        
    }
    
    
    public void submitToDB(Student stu){
         
        
        
        SQLiteconnection cnn = new SQLiteconnection();
        
        cnn.Conectar();
        
        String sqlInsert = "INSERT INTO student ("
                + "a_login"
                + "a_senha"
                + "a_nome"
                + "a_sobrenome"
                + "a_idade"
                + "a_curso"
                + "a_turma"
                + "a_notas) VALUES(?,?,?,?,?,?,?,?);";
        
        
       PreparedStatement preparedstatement =  cnn.criarPreparedStatement(sqlInsert); 
        
        try{
            
            
            preparedstatement.setString(1, stu.getLogin());
            preparedstatement.setString(2, stu.getPassw());
            preparedstatement.setString(3, stu.getName());
            preparedstatement.setString(4, stu.getLastname());
            preparedstatement.setInt(5, stu.getAge());
            preparedstatement.setInt(6, stu.getCourse());
            preparedstatement.setString(7, stu.getClas());
            preparedstatement.setInt(8, stu.getGrades());
            
            
            int resultado = preparedstatement.executeUpdate();
            
            if(resultado == 1){
                System.out.println("IZI PEACE");
            }else{
                System.out.println("Deu pica");
            }
            
        }catch(SQLException e){
            System.out.println("Fedeu");  
        
        }finally{
            if(preparedstatement != null){
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    System.out.println("Erro fechamento");
                }
            }
            cnn.Desconnectar();
        }
        
        
    }
    
}
