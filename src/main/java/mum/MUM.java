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
import static java.lang.Math.sqrt;
import java.math.*;
public class MUM 
{

    /**
     * @param args the command line arguments
     */
   
    
 static   int isOddHeavey(int[] a)
    {
    int count=0;
    
    for (int i=0;i<a.length;i++)
    {
        
        if(a[i]%2!=0)
        {
          count=1; 
            for(int j=0;j<a.length;j++)
            {
                if(a[j]%2==0 && a[i]<a[j])
                {
                    
                    return 0;
                   
                }
                
                  
            }
             
       
        }
    
    }
    if(count==0) return 0;
    return 1;
 }
 
private static int isAllPossibilities1(int[] a) {
int x=0;
    if(a.length==0) return 0;
for(int i=0;i<a.length;i++){ //outer loop which holds the value of the index and checks this with all the elements on the array
     x=0;// x should always be reseted to zero
    if(a[i]>=a.length) return 0; //if the array element is out of bounds then the function stops
        for(int j=0;j<a.length;j++){ //to iterate through the elements and chek if the array index i is equal to one of the values
                if(a[j]==i) //if we found matching value bn i and a[i] we break out of this loop and go to the next i
                {
                 x=1; //make the flag onemx is now 1
                break;//get out of inner loop
               }
               
        //       return 0;// the loop comes here if it cant find i in the array  and makes x back to 0 
        }
       if (x==0)return 0; // the fun stops when x=0 cuz 0 means the value i missing
}
    
    
return 1;// the fun returns 1 if we found all the elements
}
public static int isAllposs(int[]a){
	int count=0;
	if(a.length==0) return 0;
        for(int i=0;i<a.length;i++){
		count=0;
		for(int j=0;j<a.length;j++){
			if(a[i]==j){
				count++;
			}
			
		}
		if(count==0){
			return 0;
		}
	}
	return 1;
}
static int isBalanced(int[ ] a){

for(int i=0;i<a.length;i++){
if(i%2==0){
       if ( a[i]%2!=0){
       return 0;}}
       else
       {
       if(a[i]%2==0){
       return 0;
       }
       }
}
return 1;
}
static int isBalance(int[ ] a){

for(int i=0;i<a.length;i++){
if(i%2==0 &&a[i]%2!=0){
             return 0;}
else if(i%2!=0 && a[i]%2==0 ){
       return 0;
       }
       
}
return 1;
}
static int isCentered(int[ ] a){
if(a.length%2==0) return 0;
int x=a.length/2;

int mid=a[x];
for(int i=0;i<a.length;i++){
if(i!=x && a[i]<=mid)
{
return 0;
}
}

return 1;
}
static int isCumulative(int[ ] a){
if(a.length==1) return 0;
   for(int i=1;i<a.length;i++){
  int   sum=0;
    for(int j=i-1;j>=0;j--){
        sum+=a[j]; 
      
    } // System.out.println(i +" "+ sum + "a[i]" + a[i] );
    if (sum!=a[i]){
        return 0;
    }

}
return 1;
}
static int isCumulativeAnother(int[ ] a){
if(a.length==1) return 0;
    int sum=0;
for(int i=0;i<a.length;i++){
     sum+=a[i];
}

    for(int j=a.length-1;j>=1;j--){
        
        sum-=a[j]; 
        if(sum!=a[j]) return 0;
      
    }  
   return 1;
}
static int nUpCount(int[] a, int n)
    {
    
		int nUpCount = 0;
		int partialSum = 0;
		int previousPartialSum = 0;
		for(int i=0; i<a.length; i++){
			previousPartialSum=partialSum;
			partialSum += a[i];
			if(previousPartialSum<=n && partialSum > n){
				nUpCount++;
			}
		}
		return nUpCount;
    }
static int isperfectsqure(int n)
{
    int x=(int) sqrt(n)+1;
    


return x*x;
}

static int madHav(int[] a ){
if(a.length<2) return 10;
int count=0;
int sum=a[0];

int count1=1;
int k=1;
 for (int i=1;i<a.length;i++){

 if((i*(i+1))==a.length*2) {
     
     count++;
     break;}
 
 }
 if(count==0) return 110;
 else{ 
     while(k<=a.length-count1){
 //   k=count1+k;
  if( k<=a.length-count1){
    
     int  insum=0;
        System.out.println("initial k"+k);
   
      for (int i=0;i<=count1;i++)
      {
     
        insum+=a[k];
        k++;
      }
      System.out.println("initial sum"+" "+insum+" "+ "sum"+" "+sum);
       System.out.println("initial k"+k);
   
      if(sum!=insum) return 0;
      sum=insum;
      count1++;
  }
 
 }
 
 
 
 }
   return 1;}
   static int inertial(int[] a){
   int max=a[0];
   
   for(int i=1;i<a.length;i++){
   if(a[i]>max) 
   {
       max=a[i];
   }
   
   }
   if(max%2!=0) 
       return 0;
   int odd=0; 
   System.out.println(max);
   for(int j=0;j<a.length;j++){
      
   if(a[j]%2!=0)
        
   {    odd=1;
       System.out.println("here"+a[j]);
       for(int k=0;k<a.length;k++){
           if(a[k]%2==0 && a[k]!=max && a[j]<a[k]){
           return 0;
           }
       }
   
   }
   
   }
   if(odd==0) return 0;
   return 1;}
   static int countSquarePairs(int[] a){ // counts the number of pair value which give a perfect square when they are added
   if(a.length<2) return 0;
   int count=0;
   for(int i=0;i<a.length;i++){
       
       if(a[i]>0){
   for(int j=0;j<a.length;j++){
       int sum=0;
      if(i!=j && a[i]<a[j]){
          int x=0;
           sum=a[i]+a[j];
          x=isperfectqure(sum);
          if(x==1) count++;
    }
   
   }}
   }
   
   return count;}
  static int isperfectqure(int i){ // checles if a number is perfect square
  double sq = Math.sqrt(i); 
  if(sq-Math.floor(sq)==0) return 1;
  return 0;}
  static int gauss(int []a){
  if(a[a.length-1]!=1) return 0;
  for(int i=0; i<a.length-1;i++){
      int nextval=0;
      if(a[i]%2==0){
      nextval=a[i]/2;
      
      }
      else{
       nextval=(a[i]*3)+1;
      }
      if(a[i+1]!=nextval) return 0;
  
  }
  
  return 1;
  }
  static int stantonMeasure(int[ ] a){
  int count=0;
  int count1=0;
  
  for(int i=0;i<a.length;i++){
        if(a[i]==1) count1++;
  }
   for(int j=0;j<a.length;j++){
        if(a[j]==count1) count++;
  }
  return count;
  }
  static int isPascal (int n){
      int sum=0;
  for(int i=1;i<=n/2;i++){
  
  sum+=i;
  if (sum==n) return 1;
  
  
  }
  return 0;
  }
   
  static char[ ] f(char[ ] a, int start, int len){
   
   char []b=new char[len];
   if(len+start>a.length ^ start<0 ^ len<0 )return null;
    int i=start;
   for(int j=0;j<len;j++){
  
   b[j]=a[i];
    System.out.println("i"+" "+i);
   i++;
   
    System.out.println("i"+" "+i);
   
   System.out.println("j"+" "+j);
   
   }
   return b;
   }
  static int abs(int []a,int []b){
  
  int sum=0;
  for(int i=0;i<a.length;i++){
      int diff=0;
      diff=a[i]-b[i];
     sum+=diff;
     System.out.println("error"+sum);
  }
  return sum;
  }
  static int isSorted(int[ ] a){
  
  for(int i=1;i<a.length-1;i++){
  if(a[0]<a[1]){
      if(a[i]>a[i+1]) return 0;
  
  }
  else  if(a[0]>a[1]){
      if(a[i]<a[i+1]) return 0;
  
  }
  
  
  }
  return 1;
  }
   static int secondMax(int[ ] a){
   int max1=0;
  // int max2=0;
   for(int i=0;i<a.length;i++){
   if(a[i]>max1) max1=a[i];
   
   } int j=0;
    while(j<a.length){
   if ( a[j]>max1) return a[j];
   j++;
   }
    
   
   return -1;
   }
   static int isNormal(int n){
   
   int i=2;
   while(i<n){
   if(n%i==0 && i%2!=0)
   return 0;
   i++;
   }
   return 1;
   }
  
    static int loopSum(int []a,int n){
  
  int sum=0;
  int count=1;
  int i=0;
      while(count<=n){
          if(i==a.length) {i=0;}
     sum+=a[i];
   
     count++;
     i++;
  }
  return sum;
  }
     static int isLayered(int[ ] a){
  if(a.length<=1) return 0;
  
  int flag=0;
for(int j=0;j<a.length-1;j++){
     flag=0;
      if( a[j]>a[j+1]) return 0;
    for(int k=0;k<a.length;k++){
     if( a[j]==a[k]){ 
         
         flag++;
     }
    }
    if(flag<2) return 0;

     }
  return 1;
  }
     // A DUAL ARRAY
       static int countdual(int[ ] a){ 
  if(a.length%2!=0) return 0; // if the number of values is odd then atleast one element wont be dual
  
  int count=0; // holds the number of occurance of a value
for(int j=0;j<a.length;j++){
     count=0; // count will always start with zero when we start counting new element
      
    for(int k=0;k<a.length;k++){
     if(a[j]==a[k]){ 
         
         count++;
     }
    }
    
   if(count!=2) return 0; // checks if the element occurs exactly twice before going to the next element 
     }
  return 1;
  }
       // checks if an array is infinte loop
   static  int isInfinite(int[ ] a){
     boolean flag=true;
     int i=0;
     while(flag==true){
     
     System.out.println("first i"+i);
     if(a[i]==-1) return -1;
     if(a[i]<0 || a[i]>=a.length) return 1;
     for(int j=0;j<a.length;j++){ if(i!=j && a[i]==a[j]) return 0;}
     i=a[i]; 
      System.out.println("after cheking i"+i);
     }
    return 0; }
   // checks if sum of two conscuative elements is equal to all the pairs
    static  int isDual(int[ ] a){
     
     if(a.length==0) return 1;
     if(a.length%2!=0) return 0;
     int sum=a[0]+a[1];
     for(int i=0;i<a.length-1;i=i+2){ 
       int sum1=a[i]+a[i+1];  
       
       if(sum1!=sum) return 0;
       sum=sum1;
     }
    return 1; }
    static int factorTwoCount(int n){
    if(n%2!=0) return 0;
    int count=1;    
    
    int x=n/2;
        while(x%2==0){
    
            x/=2;
        count++;
        
    }
    return count;
    }
    static int isDaphne (int[ ] a){
    int countint=0;
    int countlast=0;
   // int countodd=0;
    int i=0,j=a.length-1;
    while(a[i]%2==0)
    {
     if(i==a.length-1) return 0;
    countint++;
    i++;
    
    }
    while(a[j]%2==0)
    {
     if(j==0) return 0;
    countlast++;
    j--;
    
    }
   // countodd++;
   // if(countodd==0) return 0;
    if(countint!=countlast) return 0;
    
    return 1;}
    
    
    	public static int isDaph(int[] a) { // checkes an array has only odd or even elements
		int evencount = 0;
		int oddcount=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evencount++;
			}
			else{
				oddcount++;
			}
		}
		if(oddcount==0&& evencount>0 || oddcount>0&&evencount==0){
			return 1;
		}
		return 0;
	}
        static int goodSpread (int[ ] a){
   //     if(a.length%2!=0) return 0; // if the number of values is odd then atleast one element wont be dual
  
  int count=0; // holds the number of occurance of a value
for(int j=0;j<a.length;j++){
     count=0; // count will always start with zero when we start counting new element
      
    for(int k=0;k<a.length;k++){
     if(a[j]==a[k]){ 
         
         count++;
     }
    }
    
   if(count>3) return 0; // checks if the element occurs exactly twice before going to the next element 
     }
  return 1;
        }
        static int isMeera (int[ ] a){
        for (int i=0;i<a.length;i++){
        
        if(a[i]>=i) return 0;
        }
        
        return 1;}
        static int isBean(int[ ] a){
    int count=0; // holds the number of occurance of a value
for(int j=0;j<a.length;j++){
     count=0; // count will always start with zero when we start counting new element
     int k=0;
    while(count==0 && k<a.length){
     if(a[j]==a[k]+1 || a[j]==a[k]-1 ){ 
         
         count++; continue;
     }
     else { k++;}
    }
    
   if(count<1) return 0; // checks if the element occurs exactly twice before going to the next element 
     }
    
    return 1;
    }
      static  int isGuthrie (int n){
        int firstnum=1;
        for(int i=1;i<=n;i++){
            if(firstnum>n) return 0;
        if(firstnum==n) return 1;
        firstnum=firstnum+i;
          System.out.println(firstnum+" ");
        
        }
        return 0;}
        static  int is(int []n){
          int flag=0;   
        for(int i=0;i<n.length;i++)
        {
        int j=0;
        flag=0;
        while(j<n.length){
        if(i==n[j])
        {
            flag=1;
            break;}
        j++;
        }
        if(flag==0) return 0;
         
        }
        
        return flag;}
      
       static int isFilter(int[ ] a){

for(int j=0;j<a.length;j++){
    
     if(a[j]==7){ 
         
      for(int k=0;k<a.length;k++){ 
          if(a[k]==13) return 0;
      }
     }
     if(a[j]==9)
     { int count=0;    
      for(int k=0;k<a.length;k++){ 
          if(a[k]==11){ 
              count++; 
          System.out.println(count); 
          break;}
      }
       System.out.println(count);
     if(count==0) return 0;
     }
     
    }
    
    
    
    return 1;
    }
       static  int isFibo(int n){
        int firstnum=0;
        int nextnum=1;
        int sum=0;
        while(sum<=n){
            
          
        if(sum==n) return 1;
        sum=firstnum+nextnum;
        firstnum=nextnum;
        nextnum=sum;
           System.out.println(sum+" ");
        
        }
        return 0;}
       public static int ishallow(int[]a){
	int pre0count=0;
	int post0count=0;
	int zerocount=0;
	
	for(int i=0;i<a.length;i++){
		if(a[i]!=0){
			if(zerocount==0){
				pre0count++;
			}
			else{
				post0count++;}
		}
		else if(a[i]==0){
			if(post0count==0){
				zerocount++;
			}
			else{
				return 0;
			}
		}
	}
	if(zerocount<3||post0count!=pre0count){
		return 0;
	}
	return 1;
}
       public static int isHollow(int[] a) {

		int i, j, k, len = a.length;

		int NumCnt1 = 0, NumCnt2 = 0, ZeroCnt = 0;

		for (i = 0; i < len; i++) {
			if (a[i] > 0) {

				NumCnt1++;
			} else
				break;

		}

		for (j = i; j < len; j++) {
			if (a[j] == 0) {

				ZeroCnt++;
			} else
				break;
		}

		if (ZeroCnt < 3) {
			return 0;
		}

		for (k = j; k < len; k++) {
			if (a[k] > 0) {

				NumCnt2++;
			} else
				break;
		}

		if (NumCnt1 == NumCnt2)
			return 1;

		return 0;
	}


       public static int ishallowing(int[]a){
	int pre0count=0;
	int post0count=0;
	int zerocount=0;
	
	for(int i=0;i<a.length;i++){
		     System.out.println("j is"+i+zerocount);
                  
            if(zerocount>0 && a[i]!=0){
                    for(int j=i+1;j<a.length;j++){
                    
                    if(a[j]==0){
                           System.out.println("j is"+j+zerocount);
                        return 10;}
                    }
                    break;}
            if(a[i]==0)    zerocount++;
			
	}
        for(int i=0;i<a.length;i++){
		if(a[i]==0){
                     break;
                    }
                   
                pre0count++;
			
	}
           for(int i=a.length-1;i>=0;i--){
		if(a[i]==0){
                     break;
                    }
                   
                post0count++;
			
	}
	if(zerocount<3||post0count!=pre0count){
		return 0;
	}
	return 1;
}
    static   int isConsectiveFactored(int n){
       if(n<=2) return 0;
       for(int i=2;i<n/2;i++){
       
       if(n%i==0 && n%(i+1)==0) return 1;
       }
       
       
       return 0;}
    static int xx(int n){
     int x=n/10;
     return x;
    
    }
    public static void main(String[] args) {
        // TODO code application logic here ^ s
    IntStack s=new IntStack();
    PersonStack p1=new PersonStack();
    Person p=new Person("fasil",123);
    Person p2=new Person("girma",345);
        if(s.isFull()){
        System.out.println("error");
        }
        else{
        s.push(2);
        s.push(4);
        s.push(22);
        s.push(42);
        
        }
         if(p1.isFull()){
        System.out.println("error");
        }
        else{
        p1.push(p);
        p1.push(p2);
       
        
        }
         System.out.println(s.pop());
         System.out.println(s.pop());
         System.out.println(p1.pop());
         System.out.println(p1.pop().toString());
        int[] b={0,0,0,0,0,0};
     System.out.println("next perfect squre"+isperfectsqure(18));
     // System.out.println(nUpCount(new int[]{6, 3, 1, -6, 1, -3, -1, 2}, 5));
 //   System.out.println(isOddHeavey(new int[]{0,2,2}));
     System.out.println("is balance"+isBalance(new int[]{4,1,2}));
         System.out.println("is balanced"+isBalanced(new int[]{4,1,2}));
 
    System.out.println("is cum"+isCumulative(new int[]{0}));
    // System.out.println(inertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println(countSquarePairs(new int[]{11}));
        System.out.println(gauss(new int[]{ 8, 4, 1}));
        System.out.println("mdhav"+madHav(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isPascal(21));
  //    System.out.println("absolute"+abs(new int[]{2, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4},new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, -3}));
     //  System.out.println(f(new char[]{},1,0));
        System.out.println("sorted?"+isSorted(new int[]{}));
        System.out.println("second max?"+secondMax(new int[]{1,2,3,5}));
        System.out.println("oddheavey?"+isOddHeavey(new int[]{9,2,11,3,2,11}));
        System.out.println("is normal?"+isNormal(15));
        System.out.println("loopsum?"+loopSum(new int[]{1, 4, 5, 6} ,4));
        System.out.println("Layered??"+isLayered(new int[]{}));
    //    System.out.println("inf??"+isInfinite(new int[]{0}));
        System.out.println("is dual??"+isDual(new int[]{1,2}));
        System.out.println("is dual count??"+countdual(new int[]{1, 2,2, 1, 3, 3}));
        System.out.println("factor"+factorTwoCount(32));
        System.out.println("is daphne count??"+goodSpread(new int[]{0}));
        System.out.println("is daphne count??"+isDaphne(new int[]{2, 2,1,2, 2}));
         System.out.println("is daphne count??"+isMeera(new int[]{2, 2,1,2, 2})); 
          System.out.println("is bean ??"+isBean(new int[]{3,4,5,7})); 
          System.out.println("is Guthrie ??"+isGuthrie(40));
           System.out.println("is pos ??"+isHollow(new int[]{2,3,3,0,0,0,0,0,0,1,2,3}));
            System.out.println("is fibo ??"+isFibo(12));
        System.out.println("is isConsectiveFactored ??"+isConsectiveFactored(110));
         System.out.println("is isConsectiveFactored ??"+xx(9));
    }
    
    }
            




