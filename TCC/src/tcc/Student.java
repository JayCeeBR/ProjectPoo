/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;

/**
 *
 * @author Jerlyson
 */
public class Student extends People {
    private String course;

    
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    public void seeGrades(){
        //null
    }
    
    public void seeMissings(){
        //null
    }
}
