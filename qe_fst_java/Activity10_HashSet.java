package qe.java;

import java.util.HashSet;

public class Activity10_HashSet {
public static void main(String[] args) {
    HashSet<Integer> hs=new HashSet<>();
    for(int i=1;i<=6;i++)
    {
        hs.add(i);
    }
    System.out.println(hs.size());
    System.out.println(hs.remove(5));
    System.out.println(hs.remove(7));
    if(hs.contains(3))
    {
        System.out.println("Present in the hashset");
    }
    else{
        System.out.println("Noy present");
    }
    System.out.println("updated set:"+hs);
}
}
