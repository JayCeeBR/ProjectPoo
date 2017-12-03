/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;
import SQLITE.SQLiteconnection;
import com.almworks.sqlite4java.SQLiteConnection;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author Jerlyson
 */
public class Teacher extends People {

    private String teachingarea;//human sciences, exact sciens etc.
    private String matter;//English, philosophy etc.
    private int salary;

    
  
     
        
 
    
    public void Teacher(){
        this.admacess = true;
    }
    
    
    public void InsertGrades(Student student, int grade){
        //null
    }
    
    public void InsertMissings(Student student, int missings){
        //null
    }
    
    public void ShowClass(){
        
    }
    
    
    
    
    //Salary
    public int getSalary(){
        return this.salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
   
    
    
    
    //TEACHINGAREA
    public String getTeachingarea() {
        return teachingarea;
    }

    public void setTeachingarea(String teachingarea) {
        this.teachingarea = teachingarea;
    }
    //Matter
    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    
   
    public void submitToDB(Teacher tea){
        
        SQLiteconnection cnn = new SQLiteconnection();
        
        cnn.Conectar();
        
        String sqlInsert = "INSERT INTO teacher ("
                + "p_login,"
                + "p_senha,"
                + "p_nome,"
                + "p_sobrenome,"
                + "p_idade,"
                + "p_area,"
                + "p_materia,"
                + "p_salario) VALUES(?,?,?,?,?,?,?,?)";
        
        PreparedStatement preparedStatement = cnn.criarPreparedStatement(sqlInsert);
        
        try{
            
            preparedStatement.setString(1, tea.getLogin());
            preparedStatement.setString(2, tea.getPassw());
            preparedStatement.setString(3, tea.getName());
            preparedStatement.setString(4, tea.getLastname());
            preparedStatement.setInt(5, tea.getAge());
            preparedStatement.setString(6, tea.getTeachingarea());
            preparedStatement.setString(7, tea.getMatter());
            preparedStatement.setInt(8, tea.getSalary());
            
            
            int resultado = preparedStatement.executeUpdate();
            
            if(resultado == 1){
                System.out.println("IZI PEACE");
            }
            
        }catch(SQLException e){
            System.out.println("Fedeu");  
        }
    }
    
}
