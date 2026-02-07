package demos;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class Activity1 {
    
private static ArrayList<String> list;

    @BeforeAll
    public static  void setUp()
    {
        list=new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }
    @Test
    public void insertTest()
    {
        assertEquals(2,list.size(),"Wrong Size");
        list.add("gamma");
        assertEquals(3,list.size(),"Wrong Size");
        
        assertEquals("alpha", list.get(0),"Wrong Element");
        assertEquals("beta",  list.get(1),"Wrong Element");
        assertEquals("gamma", list.get(2),"Wrong Element");

    }
    @Test
    public void replaceTest()
    {
        assertEquals(2,list.size(),"Wrong Size");
        list.add("gamma");
        assertEquals(3,list.size(),"Wrong Size");
        list.set(1,"omega");
        assertEquals("alpha", list.get(0),"Wrong Element");
        assertEquals("omega",  list.get(1),"Wrong Element");
        assertEquals("gamma", list.get(2),"Wrong Element");

    }
}
