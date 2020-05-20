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
public class IntStack {
    private int[] stack;
    private int top;
    private int size;
    public IntStack(){
    top=-1; // we incerement the value by one when we add elements so the first element will be added top=0
    size=10;
    stack=new int[10];
    
    }
     public IntStack(int size){
    top=-1; // we incerement the value by one when we add elements so the first element will be added top=0
    this.size=size;
    stack=new int[this.size];
    
    }
     public boolean push(int item){
     
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
     public int pop(){
         if(!isEmpty()){
     return(stack[top--]);
     }
         else return 0;    
     }
       public boolean isEmpty(){
           
         return(top==-1);
         
     }
     
}
