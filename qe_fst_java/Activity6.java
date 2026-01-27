package qe.java;

public class Activity6   {
 public static void main(String[] args) throws InterruptedException {
    Plane plane=new Plane(10);
    plane.onboard("Ram");
    plane.onboard("Prashanth");
    System.out.println("Take off time:"+plane.takeoff());
    System.out.println("Passengers on board"+plane.getPassengers());
    Thread.sleep(5000);
    plane.land();
    System.out.println("Landing time:"+plane.getLasTimeLanded());
    System.out.println("Passengers after landing"+plane.getPassengers());
 }
}
