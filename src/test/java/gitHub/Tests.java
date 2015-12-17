package gitHub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by User on 17/12/2015.
 */
public class Tests extends Utils{
    WebDriver driver = new FirefoxDriver();

    @Before
    public void beforeTest(){

        driver.get("http://www.bbc.co.uk");
        driver.manage().window().maximize();
    }

    @After
    public void afterTest(){
        driver.quit();
    }

    @Test

    public void test(){

        githubTest();
    }




}
