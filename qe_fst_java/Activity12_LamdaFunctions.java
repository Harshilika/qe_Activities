package qe.java;
interface Addable
{
     public int add(int a,int b);
}
public class Activity12_LamdaFunctions {
    public static void main(String[] args) {
       Addable ad1=(a,b)->(a+b);
        Addable ad2=(int a,int b)->
        {
            return (a+b);
        };
        System.out.println(ad1.add(234,64));
        System.out.println(ad2.add(8475,3473));
    }

}
