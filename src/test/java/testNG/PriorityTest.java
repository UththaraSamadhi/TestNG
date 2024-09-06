package testNG;

import org.testng.annotations.Test;

public class PriorityTest {

//    @Test(priority = 0)
//    public void testLogin(){
//        System.out.println("login");
//    }
    @Test(priority = 1)
    public void testCreate(){
        System.out.println("create");


    }
     @Test(priority = 2,enabled = false)
    public void testEdit(){
        System.out.println("Edit");
    }
    @Test(priority = 4)
    public void testDelete(){
        System.out.println("delete");
    }
    @Test(priority = 3)
    public void testLogout(){
        System.out.println("logout");
    }


}
