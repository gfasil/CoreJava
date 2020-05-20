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
public class PersonStack {
    private Person[] stack;
    private int top;
    private int size;
    public PersonStack(){
    top=-1; // we incerement the value by one when we add elements so the first element will be added top=0
    size=10;
    stack=new Person[10];
    
    }
     public PersonStack(int size){
    top=-1; // we incerement the value by one when we add elements so the first element will be added top=0
    this.size=size;
    stack=new Person[this.size];
    
    }
     public boolean push(Person item){
     
         if(!isFull())
     {
         top+=1;
     stack[top]=item;
     return true;
     }
     else{
         
        return false; 
     }
     
     }
     public boolean isFull(){
         return(top==stack.length-1);
         
     }
     public Person pop(){
         if(!isEmpty()){
     return(stack[top--]);
     }
         else return null;    
     }
       public boolean isEmpty(){
           
         return(top==-1);
         
     }
     
}
