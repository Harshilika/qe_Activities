package qe.java;

import java.util.*;

public class Activity4_InsertionSort {
      public static void Insertion(int arr[],int n)
      {
         for(int i=1;i<n;i++)
    {
        int key=arr[i];
        int j=i-1;
            while(j>=0 && 
                arr[j]>key)
            {
                
                arr[j+1]=arr[j];
                j--;
            }
            
        arr[j+1]=key;
    }
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    Insertion(arr,n);
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }
    sc.close();
   
  }
}

