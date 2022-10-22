package myFirstSeleniumWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class CreatingGmailAccountParent {

    public WebDriver driver;
    Scanner userInput = new Scanner(System.in);

    public void signUp(String browser, String google) throws Exception {

        System.out.println("Enter either chrome or firefox: ");
        String userTyped = userInput.nextLine();
        browser = userTyped;

        //chrome driver
        System.setProperty("webdriver.chrome.driver","\\Users\\akhan\\IdeaProjects\\Batch 4\\chromedriver.exe");
        //firefox driver
        System.setProperty("webdriver.gecko.driver","\\Users\\akhan\\IdeaProjects\\Batch 4\\geckodriver.exe");

        if (userTyped.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }

        else if (userTyped.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }

        else {
            System.out.println("Invalid Webdriver.");
        }

        driver.manage().deleteAllCookies();
        Thread.sleep(3000);
        driver.navigate().to(google);
        Thread.sleep(2000);

        //maximizing the window
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //implicit wait time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // this will wait 30 seconds before throwing any exception wherever this class is extended.

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Thread.sleep(3000);

    }

}
