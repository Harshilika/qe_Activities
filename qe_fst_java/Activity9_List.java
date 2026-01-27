package qe.java;

import java.util.ArrayList;

public class Activity9_List {
public static void main(String[] args) {
    ArrayList<String> myList=new ArrayList<>();
    myList.add("Google");
    myList.add("Microsoft");
    myList.add("Amazon");
    myList.add("IBM");
    myList.add("Nvidia");
    for(String names:myList)
    {
        System.out.println(names);
    }
    System.out.println("Third Name:"+myList.get(2));
    if(myList.contains("Nvidia"))
    {
        System.out.println("Nvidia exists in given list");
    }
    else{
        System.out.println("Nvidia does not exists in given list");
    }
    System.out.println(myList.size());
    myList.remove("Amazon");
    System.out.println(myList.size());
}
}
