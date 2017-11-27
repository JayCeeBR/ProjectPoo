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
    private String login;
    private String passw;
    private String name;
    private String lastname;
    private int age;
    private int course;
    private int clas;
    private int grades;

    public Student(String login, String passw, String name, String lastname, int age, int course, int clas, int grades) {
        super(login, passw, name, lastname, age);
        this.login = login;
        this.passw = passw;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.course = course;
        this.clas = clas;
        this.grades = grades;
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    
    
    public void submitToDB(){
         
        
        
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
        PreparedStatement preparedstatement = null;
        preparedstatement = cnn.criarPreparedStatement(sqlInsert);
        
        try{
           
            preparedstatement.setString(1, this.getLogin());
            preparedstatement.setString(2, this.getPassw());
            preparedstatement.setString(3, this.getName());
            preparedstatement.setString(4, this.getLastname());
            preparedstatement.setInt(5, this.getAge());
            preparedstatement.setInt(6, this.getCourse());
            preparedstatement.setInt(7, this.getClas());
            preparedstatement.setInt(8, this.getGrades());
            
            
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
