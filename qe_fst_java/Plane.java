package qe.java;
import java.time.LocalDateTime;
import java.util.*;
public class Plane {
  private  int maxPassengers;
  private LocalDateTime lastTimeLanded;
  int passengerCount;
  private ArrayList<String> passengerList;
  public Plane(int maxPassengers)
  {
    this.maxPassengers=maxPassengers;
    this.passengerList=new ArrayList<>();
  }
  public void onboard(String name)
  {
    if(passengerCount<maxPassengers)
    {
        passengerList.add(name);
        passengerCount++;
    }
    else{
        System.out.println("Passengers are full");
    }
  }
  public LocalDateTime takeoff()
  {
    return LocalDateTime.now();
  }
  public void land()
  {
    lastTimeLanded=LocalDateTime.now();
    passengerList.clear();
  }
  public LocalDateTime getLasTimeLanded()
  {
    return lastTimeLanded;
  }
  public ArrayList<String> getPassengers()
  {
    return passengerList;
  }
 
}
