package qe.java;

import java.util.HashMap;

public class Activity11_Map {
public static void main(String[] args) {
    HashMap<Integer,String> colors=new HashMap<>();
    colors.put(1,"black");
    colors.put(2,"blue");
    colors.put(3,"green");
    colors.put(4,"red");
    colors.put(5,"yellow");
    colors.remove(3);
    System.out.println("Does map contains green color:"+colors.containsValue("green"));
    System.out.println("Map size:"+colors.size());

}
}
