package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjLogin  {

    private  WebDriver driver;

    public ObjLogin(WebDriver driver)
    {
       this.driver = driver;
    }
    public  WebElement loginLink()
    {
        return driver.findElement(By.id("login2"));
    }
    public  WebElement username()
    {
        return driver.findElement(By.id("loginusername"));
    }
    public  WebElement password()
    {
        return driver.findElement(By.id("loginpassword"));
    }
    public  WebElement clickLogin()
    {
        return driver.findElement(By.cssSelector("button[onclick='logIn()']"));
    }
    public  WebElement welcomeUser()
    {
        return driver.findElement(By.id("nameofuser"));
    }

}
