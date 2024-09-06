package testNG;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 0)
    public void TestLogin(){
        System.out.println("Login");
    }
    @Test(priority = 1)
    public void TestCreate(){
        System.out.println("Create");

    }
    @Test(priority = 3)
    public void TestDelete(){
        System.out.println("Delete");
    }
    @Test(priority = 2)
    public void TestLogout(){
        System.out.println("Logout");
    }


}
