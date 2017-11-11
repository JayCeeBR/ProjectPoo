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
public abstract class People {
    
    private String login;
    private String passw;
    
    private String name;
    private String lastname;
    
    private int age;
    protected boolean admacess;
    
    //login
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    //password
    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    //name
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
    
    public String getCompletename(){
        return this.name + " " + this.lastname; 
    }
    
    
    //AGE
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
}
