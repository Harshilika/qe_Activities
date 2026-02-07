package demos;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTester{
    @Test
    @Order(3)
    public void test0(){
        assertTrue(true);
    }
    @Test
    @Order(2)
    public void test1(){
        assertTrue(true);
    }
    @Test
    @Order(1)
    public void test2(){
        assertTrue(true);
    }
     @Test
     @Order(0)
    public void test3(){
        assertTrue(true);
    }
     @Test
    public void test4(){
        assertTrue(true);
    }
     @Test
    public void test5(){
        assertTrue(true);
    }


}