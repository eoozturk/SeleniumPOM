package Pom;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    WebDriver wdriver = new FirefoxDriver();

    @Before
    public void startPage(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\emreozanozturk\\IdeaProjects\\POMDeneme\\geckodriver.exe");
        String url ="https://www.n11.com/";
        wdriver.get(url);
    }
    @After
    public void quitPage() throws InterruptedException {
        Thread.sleep(3000);
        wdriver.close();
    }
}
