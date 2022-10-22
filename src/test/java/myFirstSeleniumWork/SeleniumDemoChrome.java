package myFirstSeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoChrome {
    WebDriver driver;

    public void browsersLuanching( String url1, String url2) throws Exception{
        //System.setProperty("webdriver.chrome.driver","\\Users\\akhan\\IdeaProjects\\Batch 4\\chromedriver.exe");
        // use parameter and switch browser
        driver = new ChromeDriver();

        Thread.sleep(3000);
        driver.get(url1);

        Thread.sleep(3000);
        driver.navigate().to(url2);

        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Customer")).click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        // use implicitly wait and page load timout...
       // driver.close();



        // what is maven
        // what are the selenium locators
    }

    public static void main(String[] args) throws Exception{
        SeleniumDemoChrome obj = new SeleniumDemoChrome();
        obj.browsersLuanching("https://macys.com", "https://amazon.com");
    }
}
