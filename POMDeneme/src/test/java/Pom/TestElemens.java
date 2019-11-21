package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestElemens {

    WebDriver driver;

    By btnClick= new By.ByClassName("btnSignIn");
    By username=new By.ById("email");
    By passwrd=new By.ById("password");
    By log=new By.ById("loginButton");

    public TestElemens(WebDriver wdriver){
        this.driver=wdriver;
    }
    public void clickBtn(){
        driver.findElement(btnClick).click();
    }
    public void userName(String user){
        driver.findElement(username).sendKeys(user);
    }
    public void passWord(String pss){
        driver.findElement(passwrd).sendKeys(pss);
    }
    public void login(){
        driver.findElement(log).click();
    }
}
