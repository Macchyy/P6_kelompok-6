package p6;

public class job9{ 
 job9(){ 
 System.out.println("Constructor of Parent"); 

 } 
}
package p6;

class job9b extends job9{ 
 job9b(){ 
 System.out.println("Constructor of Child"); 
 } 
 public static void main(String args[]){ 
 
 new job9b(); 
 } 
}

class job9c extends job9{ 
 job9c(){ 
 System.out.println("Constructor of Child A"); 
 } 
 public static void main(String args[]){ 
 
 new job9c(); 
 } 
}
package p6;

class job9d extends job9{ 
 job9d(){ 
 System.out.println("Constructor of Child B"); 
 } 
 public static void main(String args[]){ 
 
 new job9d(); 
 } 
}
