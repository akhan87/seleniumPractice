package myFirstSeleniumWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumCookiesParent {

    public WebDriver driver;

    public void browsers(String browser, String url1) throws Exception{
        //chrome driver
        System.setProperty("webdriver.chrome.driver","\\Users\\akhan\\IdeaProjects\\Batch 4\\chromedriver.exe");
        //firefox driver
        System.setProperty("webdriver.gecko.driver","\\Users\\akhan\\IdeaProjects\\Batch 4\\geckodriver.exe");

        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }

        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }

        else {
            System.out.println("Invalid driver.");
        }

        Thread.sleep(3000);

        driver.get(url1);

        //maximize the browser
        driver.manage().window().maximize();

        //take title
        String title = driver.getTitle();
        System.out.println("Page time"+title);

        //take current url
        String url = driver.getCurrentUrl();
        System.out.println(url);

        //implicit wait time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // this will wait 30 seconds before throwing any exception wherever this class is extended.

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Thread.sleep(3000);

       // driver.navigate().refresh();

    }
}
