package qe.java;
import java.util.*;
abstract class Book
{
    String title;
    public  abstract void setTitle(String title);
    public String getTitle()
    {
        return title;
    }
}
class MyBook extends Book{
     public void setTitle(String s)
     {
        title=s;
     }
}
public class Activity5_Abstraction {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the title");
    String title=sc.nextLine();
    MyBook newNovel=new MyBook();
    newNovel.setTitle(title);
    System.out.println("The title is:"+newNovel.getTitle());
    sc.close();
}
    

}
