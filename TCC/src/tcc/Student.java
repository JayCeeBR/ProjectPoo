/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;

import SQLITE.SQLiteconnection;
import com.almworks.sqlite4java.SQLiteConnection;
import java.sql.*;

/**
 *
 * @author Jerlyson
 */
public class Student extends People {
    private int course;
    private int clas;
    private int grades;

    
    public Student(int course, int clas, int grades, String login, String passw, String name, String lastname, int age) {
        super(login, passw, name, lastname, age);
        this.course = course;
        this.clas = clas;
        this.grades = grades;
    }

    
    
    
    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
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
    
    
    @Override
    void submitToDB(){
        
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
                + "a_notas) VALUES(?,?,?,?,?,?,?,?)";
        
        PreparedStatement preparedStatement = cnn.criarPreparedStatement(sqlInsert);
        
        try{
            
            preparedStatement.setString(1, this.getLogin());
            preparedStatement.setString(2, this.getPassw());
            preparedStatement.setString(3, this.getName());
            preparedStatement.setString(4, this.getLastname());
            preparedStatement.setInt(5, this.getAge());
            preparedStatement.setInt(6, this.getCourse());
            preparedStatement.setInt(7, this.getClas());
            preparedStatement.setInt(8, this.getGrades());
            
            
            int resultado = preparedStatement.executeUpdate();
            
            if(resultado == 1){
                System.out.println("IZI PEACE");
            }
            
        }catch(SQLException e){
            System.out.println("Fedeu");  
        }
        
        
    }
    
}
