package PageObject;

import Resources.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class objSignUp extends Base {

    public WebDriver driver;

    public objSignUp(WebDriver driver)
    {
        this.driver = driver;
    }

    public  WebElement signupLink()
    {
        return driver.findElement(By.id("signin2"));
    }
    public  WebElement username()
    {
        return driver.findElement(By.id("sign-username"));
    }
    public  WebElement password()
    {
        return driver.findElement(By.id("sign-password"));
    }
    public  WebElement clickSignup()
    {
        return driver.findElement(By.cssSelector("button[Onclick ='register()']"));
    }

}
