package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.security.spec.ECField;
import java.util.concurrent.TimeUnit;

public class DynamicXpath2 {

    WebDriver  driver;

    public void dynamic(String browser, String url) throws Exception{
        //chrome driver
        System.setProperty("webdriver.chrome.driver","\\Users\\akhan\\IdeaProjects\\Batch 4\\chromedriver.exe");
        //firefox driver
        System.setProperty("webdriver.gecko.driver","\\Users\\akhan\\IdeaProjects\\Batch 4\\geckodriver.exe");

        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }

        else if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }

        else {
            System.out.println("Invalid Driver.");
        }

        //deleting cookies
        driver.manage().deleteAllCookies();

        //going to the website
        driver.get(url);
        Thread.sleep(3000);

        //maximizing the website
        driver.manage().window().maximize();

        //implicit wait time
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //pageload wait time
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        Thread.sleep(2000);

        //validating and clicking on sign in
        WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        String mySignIn = signIn.getText();

        if (mySignIn.equalsIgnoreCase("Sign in")){
            System.out.println("Xpath is correct");
            signIn.click();
        }

        else {
            System.out.println("Wrong Xpath");
        }
    }

    public static void main(String[] args) throws Exception {
        DynamicXpath2 obj = new DynamicXpath2();
        obj.dynamic("chrome", "https://google.com");
    }
}
