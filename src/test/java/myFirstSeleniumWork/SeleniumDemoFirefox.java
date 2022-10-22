package myFirstSeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDemoFirefox {

    WebDriver driver;

    public void browser() throws Exception{

        //fire fox driver
        System.setProperty("webdriver.gecko.driver","\\Users\\akhan\\IdeaProjects\\Batch 4\\geckodriver.exe");

        driver = new FirefoxDriver();

        driver.manage().deleteAllCookies();
        Thread.sleep(3000);

        driver.navigate().to("https://cricinfo.com");
        /* The difference between navigate and get is when I do have couple of url to
        be navigating back and forth then I will use navigate().to()
         */
        Thread.sleep(2000);

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



        driver.navigate().to("https://w3schools.com");
        Thread.sleep(2000);


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

    public static void main(String[] args) throws Exception {
        SeleniumDemoFirefox obj = new SeleniumDemoFirefox();
        obj.browser();
    }
}
