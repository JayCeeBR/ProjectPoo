/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;
import com.almworks.sqlite4java.SQLiteConnection;
import java.io.File;
import java.util.*;

/**
 *
 * @author Jerlyson
 */
public class Teacher extends People {

    private String teachingarea;//human sciences, exact sciens etc.
    private String matter;//English, philosophy etc.
    private int salary;
    private List clss = new ArrayList();
    

   

    
    
    
    
    
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

    
    @Override
    void submitToDB(){
        
    }
    
}
