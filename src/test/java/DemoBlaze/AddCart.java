package DemoBlaze;

import Resources.Base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddCart extends Base {

    @BeforeTest
    public void initializeDriver()
    {
        initialize();
    }
/*
    @Test
    public void addingIntoCart()
    {
        PageObject.ObjLogin.loginLink().click();
        PageObject.ObjLogin.username().sendKeys("sharan");
        PageObject.ObjLogin.password().sendKeys("123");
        PageObject.ObjLogin.clickLogin().click();
        String t3 = PageObject.ObjLogin.welcomeUser().getText();
        System.out.println(t3);
        Assert.assertEquals(t3, "Welcome sharan");
    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
    }*/
}
