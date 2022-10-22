package myFirstSeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumW3Practice {

    WebDriver driver;

    public void switchBrowser(String browser, String url1, String url2) throws Exception{
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

        driver.manage().deleteAllCookies();
        Thread.sleep(3000);

        driver.navigate().to(url1);

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
        // this will wait 30 seconds before throwing any exception wherever this is extended.

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Thread.sleep(3000);

        driver.navigate().to(url2);
        Thread.sleep(3000);

        //using locators
        driver.findElement(By.id("search2")).sendKeys("Selenium");
        //driver.findElement(By.id("learntocode_searchicon")).click();
        Thread.sleep(3000);

        //returning back
        driver.navigate().back();
        Thread.sleep(2000);

        //finding and clicking textlink
        driver.findElement(By.linkText("Teams")).click();
        Thread.sleep(2000);

        driver.navigate().refresh();
        driver.close();

    }

    public static void main(String[] args) throws Exception{
        SeleniumW3Practice obj = new SeleniumW3Practice();
        obj.switchBrowser("chrome", "https://cricinfo.com", "https://w3schools.com");
    }
}
