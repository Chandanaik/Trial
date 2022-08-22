/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandlingpractice1;

/**
 *
 * @author Chandana I K
 */
public class ExceptionHandlingPractice1 {

    /**
     * @param args the command line arguments
     */
static  void p1() throws Exception{
      try{
      System.out.println("P1 method");
      throw new Exception("new exception");
      }
     finally{
      System.out.println("Finally of p1");
    }
     
}

 static void p2(){
  try{
   System.out.println("P2 method");
   return;
 }
 finally{
  System.out.println("Finally of p2");
 }
}

 static void p3(){
  try{
 System.out.println("P3 method");
}
finally{
System.out.println("p3 finally");
}
}
    public static void main(String[] args) {
        // TODO code application logic here
     try{
     p1();
}catch(Exception e){
   System.out.println(e);
}
    

p2();
p3();
 }   
}
