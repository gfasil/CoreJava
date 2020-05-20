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
public class NewClass {
   int array[]={113,12,111,10,8};
   
   
   public  int[] bubbleSort(int a[]){// sorts in ascending order; to change to descending just make > to <
   
   for(int i= a.length-1;i>0;i--){// this i will get the sorted value from the first executions of j
       for(int j=0;j<i;j++){
       
       if(a[j]>a[j+1]){
       
       swap(a,j,j+1);
       }
       }
   }
       
       return a;
   }
   public   int  binarySearch(int a[],int x){// searches for a value by starting from the middle
      int start=0;
      int end=a.length-1;
      
      while(start<=end){
      int mid=(start+end)/2; 
      if(a[mid]<x) start=mid+1;
      
            else if(a[mid]>x) end=mid-1;
            else {
            start=end+1;
            return mid;}
      }
      return -1;
      
   }
   public  void swap(int b[],int indexone,int indextwo){
       
       int temp=b[indexone];
       b[indexone]=b[indextwo];
       b[indextwo]=temp;
   }
   public  void print(int b[]){
   for(int i=0;i<b.length;i++){ 
   System.out.print(" "+b[i]+" ");
   }
   }
   
  public static void main(String args[]){
     NewClass c=new NewClass();
      
     c.print(c.bubbleSort(c.array));
      
     int x= c.binarySearch(c.array, 11);
      
  if(x==-1){
  System.out.print( "value not found");
   
  }
  else  System.out.print( "value"+c.array[x]+"found at"+ x);
  
  }
  
 
}
