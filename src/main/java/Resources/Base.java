package Resources;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;

    public WebDriver initialize()
    {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(System.getProperty("user.dir")+"\\src\\Main\\java\\resources\\File.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String url = (String)jsonObject.get("urlname");
            String chromeDriver = (String)jsonObject.get("chromedriver");
            String driverPath = (String)jsonObject.get("driverpath");

            System.setProperty(chromeDriver, driverPath);
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            //opening the URL
            driver.get(url);
            //Maximizing the window
            //driver.manage().window().maximize();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return  driver;
    }
}
