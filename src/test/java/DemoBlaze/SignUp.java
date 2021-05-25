package DemoBlaze;


import PageObject.objSignUp;
import Resources.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SignUp extends Base {

    @BeforeTest
    public void initializeDriver()
    {
        initialize();
    }

    @Test
    public void signUpExisting()
    {
        objSignUp os = new objSignUp (driver) ;
        os.signupLink().click();
        os.username().sendKeys("sharan");
        os.password().sendKeys("123");
        os.clickSignup().click();
      //  String t1 = driver.switchTo().alert().getText();
       // Assert.assertEquals(t1,"This user already exist.");
      //  driver.switchTo().alert().accept();
    }
    /*
    @Test
    public void signUpNew()
    {
        PageObject.objSignUp.signupLink().click();
        PageObject.objSignUp.username().sendKeys("Random1234");
        PageObject.objSignUp.password().sendKeys("123");
        PageObject.objSignUp.clickSignup().click();
        String t2 = driver.switchTo().alert().getText();
        Assert.assertEquals(t2,"Sign up successful.");
        driver.switchTo().alert().accept();
    }*/
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

}
