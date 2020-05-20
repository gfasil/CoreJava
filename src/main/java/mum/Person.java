/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

/**
 *
 * @author ASUS
 */
public class Person {
 
    private String name;
    private int rollno;
    
    public Person(String sname, int srollno ){
    
    name=sname;
    rollno=srollno;
    }
    public String toString(){
    
    return "name" +name +" "+"rollno" +rollno;
    }
}
