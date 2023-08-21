package Abstraction;

public abstract class Shape {
    abstract double calculateArea();

   public void displayArea()
    {
        System.out.println("Area :"+calculateArea());
    }

}
