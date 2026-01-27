package qe.java;

public class Car {
     int make;
     String color;
     String transmission;
     int tyres;
     int doors;
public Car()
     {
        this.tyres=4;
        this.doors=4;
        /*this.transmission=transmission;
        this.color=color;
        this.make=make;*/
     }
     public void displayCharacteristics()
     {
        System.out.println("Car Make:"+make);
        System.out.println("No of tyres:"+tyres);
        System.out.println("No of doors:"+doors);
        System.out.println("Car Color:"+color);
        System.out.println("Car transmission:"+transmission);
     }
     void accelerate()
     {
        System.out.println("Car is moving");
     }
     void brake()
     {
        System.out.println("Car is stopped");
     }
}

