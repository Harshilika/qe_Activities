
package qe.java;

import java.util.ArrayList;
import java.util.*;
public class Activity13_RandomClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        Random indexGen=new Random();
        int n=scan.nextInt();
        int val=0;

        while(val<n && scan.hasNextInt())
        {
            list.add(scan.nextInt());
            val++;
        }
        Integer nums[]=list.toArray(new Integer[0]);
        int index=indexGen.nextInt(list.size());
        System.out.println("Random integer:"+index);
        System.out.println(list.get(index));
        System.out.println(nums[index]);
        scan.close();
    }
}
