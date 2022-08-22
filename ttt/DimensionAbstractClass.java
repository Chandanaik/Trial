/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dimensionabstractclass;

/**
 *
 * @author Chandana I K
 */
abstract class Shape {
    abstract void area(); //abstrcat method to find area

    void show(){  // non abstrcat method to display a text
        System.out.println("non abstract method of abstract class");
     }

    static int add( int a, int b ) { // static method to add two numbers
       return a+b ;
      }
  }  

class Rectangle extends Shape {
    int length;
    int width;
    public Rectangle( int length, int width ) {
         this.length = length;
         this.width = width;
    }
    
   @Override
   public void area() {  // To calculate Rectangle area
   System.out.println("Area of rectangle is : " +length * width);
    } 


}

class Triangle extends Shape {
    int base,height;
    public Triangle( int base, int height ) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() { // To calculate Triangle area
     System.out.println("Area of a triangle is : "+( base*height )/2);
       }
 }
public class DimensionAbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Shape s = new Rectangle( 10,20 ); // creating instance variable of shape class which will be pointing to rectangle class object
    s.area();

    s = new Triangle( 20,15 ); //instance variable of shape class which will be pointing to rectangle class object
    s.area();

    s.show(); //instance variable of shape class which will be pointing to non abstrcat method

    System.out.println( "Addition is : " +s.add(5,9) ); //instance variable of shape class which will be pointing to a static method
    }
    
}
