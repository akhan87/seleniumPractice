package myFirstSeleniumWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class AutomationAccountParent {

    public WebDriver driver;
    Scanner userInput = new Scanner(System.in);

    public void accountAutomation(String browser, String automation) throws Exception{
        System.out.println("Enter either chrome or firefox: ");
        String userTyped = userInput.nextLine();
        browser = userTyped;

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
            System.out.println("Invalid Browser.");
        }

        driver.manage().deleteAllCookies();
        driver.get(automation);
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
}