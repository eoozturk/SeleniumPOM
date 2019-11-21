package Pom;

import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void logTest(){

        TestElemens login=new TestElemens(wdriver);
        login.clickBtn();
        login.userName("deneme@gmail.com");
        login.passWord("123456");
        login.login();
    }
}
