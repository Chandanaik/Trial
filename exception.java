/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userexception;

import java.util.Scanner;

/**
 *
 * @author Chandana I K
 */
class UserDefinedException extends Exception {

   UserDefinedException( String s ){
      super(s);
   }
}

public class UserException {

    /**
     * @param args the command line arguments
     */
   static void internalMarks( int internal_marks ) throws UserDefinedException {  // if internal marks greater than 40 throws an exception otherwise displays marks.
       if( internal_marks > 40 ){
          throw new UserDefinedException( "Internal marks Exceeded" );
      }
      else {
            System.out.println( "Internal Marks is :" +internal_marks );
        }
    }

  static void externalMarks( int external_marks ) throws UserDefinedException{ // if external marks greater than 60 throws an exception otherwise displays marks.
       if( external_marks > 60 ){
          throw new UserDefinedException( "The External Marks is exceed" );
      }else{
            System.out.println( "Internal Marks is :" +external_marks );
        }
 }


    public static void main(String[] args) throws UserDefinedException {
        // TODO code application logic here
     Scanner sc = new Scanner( System.in );
     System.out.println( "Enter internal marks: " );
     int internal_marks = sc.nextInt();

     System.out.println( "Enter external marks: " );
     int external_marks = sc.nextInt(); 

     try{ //to handle internal marks
       internalMarks( internal_marks );
      } catch( Exception e ){
       System.out.println(e);
      }    
    
    try{ // to handle external marks
     externalMarks( external_marks );
    } catch( Exception e ){
       System.out.println(e);
      }    
   }
}
