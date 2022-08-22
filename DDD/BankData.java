/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankdata;

/**
 *
 * @author Chandana I K
 */
abstract class Intrest {
    abstract String bankName(); //abstrcat method to display bank name
    abstract double rateOfIntrest(double rate);  // abstrcat method to display rateof intrest
}

class Sbi extends Intrest {
    @Override
    String bankName(){
       return "SBI";
     }

   @Override
   double rateOfIntrest( double rate ){
      return rate;
   }
}


class Hdfc extends Intrest{
@Override
    String bankName(){
        return "HDFC";
    }
   @Override
   double rateOfIntrest( double rate ){
      return rate;
    }
}

class Axis extends Intrest {
@Override
    String bankName(){
        return "AXIS";
    }
   @Override
   double rateOfIntrest( double rate){
      return rate;
     }
}

public class BankData {

    /**
     * @param args the command line arguments
     */
    static void display(Intrest intrest, double rate){  // static method to display bank name and rate of intrest by taking object as a parameter
      System.out.println("Bank Name is :" +intrest.bankName());
      System.out.println("Rate of Intrest is :" +intrest.rateOfIntrest(rate));
    }

    public static void main(String[] args) {
        // TODO code application logic here
      Intrest intrest; // Intrest class reference variable

      intrest = new Sbi();
      display(intrest,4.5);
 
      intrest = new Hdfc();
      display(intrest,7.3);

      intrest = new Axis();
      display(intrest,9.1);
    
    }
    
}
