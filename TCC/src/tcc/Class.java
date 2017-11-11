/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;

import java.util.*;

/**
 *
 * @author Jerlyson
 */
public class Class {
    private String classcode;
    private Course course;
    private List students = new ArrayList();
    
    public void showStudentsAndGrades(Student student){
        //null
    }
    
    public void registerStudent(Student student){
        students.add(student);
    }
    
    public String Showall(){
        return "BAtata";
    }
    
}
