package qe.java;
interface BicycleParts {

     int tyres=4;
    int maxSpeed=20;
}
interface BiCycleOperations {
   public void applyBrake(int decrement);
   public void speed(int increment);

}
class Bicycle implements BicycleParts,BiCycleOperations {
    int gears;
    int currentSpeed;
    
        public void applyBrake(int decrement)
        {
             currentSpeed-=decrement;
        }
        public void speed(int increment)
        {
            currentSpeed+=increment;
        }
        public String bicycleDesc()
        {
            return("No of gears are"+tyres+"\n Speed of bicycle is "+ maxSpeed);
        }
    }
class MountainBike extends Bicycle {

    MountainBike(int gears,int currentSpeed)
    {
        this.gears=gears;
        this.currentSpeed=currentSpeed;
    }
}
class Activity7_Inheritance {
    public static void main(String[] args) {
        MountainBike mb=new MountainBike(3,50);
        mb.speed(20);
        mb.applyBrake(15);
        System.out.println(mb.currentSpeed);
        
    }
}

