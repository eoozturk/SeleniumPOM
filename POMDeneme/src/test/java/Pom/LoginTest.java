package Pom;

import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void logTest(){

        TestElemens login=new TestElemens(wdriver);
        login.clickBtn();
        login.userName("Your Mail Adress");
        login.passWord("Your Password");
        login.login();
    }
}
