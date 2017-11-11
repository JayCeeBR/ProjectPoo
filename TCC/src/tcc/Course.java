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
public class Course {
    private String name;
    private String coordinating;
    private int workload;
    private List teachers = new ArrayList();
    
    public void insertTeacher(Teacher teacher){
        //null
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoordinating() {
        return coordinating;
    }

    public void setCoordinating(String coordinating) {
        this.coordinating = coordinating;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
    

}
