package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DynamicXpath1 {

    WebDriver driver;

    public void dyXpath(String browser, String url) throws Exception{

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

        //clicking on players
        WebElement live = driver.findElement(By.xpath("//a[text()='Live']"));
        live.click();
        Thread.sleep(2000);

        //clicking on results
        WebElement results = driver.findElement(By.xpath("//a[@href='#tab2default']"));
        results.click();
        Thread.sleep(2000);

        //clicking on schedule
        WebElement schedule = driver.findElement(By.xpath("//a[@href='#tab3default' and @data-toggle='tab']"));
        schedule.click();
        Thread.sleep(2000);

        //clicking on complete list
        WebElement list = driver.findElement(By.xpath("//div[@class='tab-content']/div[3]/div[7]/a"));
        list.click();
        Thread.sleep(2000);

        //clicking on logo
        WebElement logo = driver.findElement(By.xpath("//img[@src='https://cricclubs.com/documentsRep/logos/bcd56281-4511-4e4d-b4b4-b1b481217a42.jpg']"));
        logo.click();

    }

    public static void main(String[] args) throws Exception {
        DynamicXpath1 obj = new DynamicXpath1();
        obj.dyXpath("chrome","https://cricclubs.com/NTCA");
    }
}

