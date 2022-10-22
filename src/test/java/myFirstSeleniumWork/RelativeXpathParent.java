package myFirstSeleniumWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class RelativeXpathParent {

    public WebDriver driver;

    Scanner userInput = new Scanner(System.in);

    public void automationWeb(String browser, String autoUrl) throws Exception{

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
            System.out.println("Invalid Web Browser.");
        }

        driver.manage().deleteAllCookies();

        //going to the website
        driver.get(autoUrl);
        Thread.sleep(3000);

        //maximizing window
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //implicit wait time
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //pageload wait time
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }


}
