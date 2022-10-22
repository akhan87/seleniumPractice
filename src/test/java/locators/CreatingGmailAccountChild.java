package locators;

import myFirstSeleniumWork.CreatingGmailAccountParent;
import org.openqa.selenium.By;

public class CreatingGmailAccountChild extends CreatingGmailAccountParent {

public void gmailAccount() throws Exception{

        //clicking on Sign In
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/a")).click();
        Thread.sleep(2000);

        //clicking on create an account
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/button/span")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li/span[2]")).click();
        Thread.sleep(2000);

        //entering first name
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/div/div/div/div/div/input")).sendKeys("John");
        Thread.sleep(2000);

        //entering last name
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/div[2]/div/div/div/div/input")).sendKeys("Doe");
        Thread.sleep(2000);

        //choosing mail address
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/div[2]/div/div/div/div/div/input")).sendKeys("seleniumbatch2022");
        Thread.sleep(2000);

        //creating password
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/div[3]/div/div/div/div/div/div/div/div/input")).sendKeys("Selniumbatch4@");
        Thread.sleep(2000);

        //confirming password
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/div[3]/div/div/div/div[2]/div/div/div/div/input")).sendKeys("Selniumbatch4@");
        Thread.sleep(2000);

        //showing password
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/div[3]/div[3]/div/div/div/div/div/div/input")).click();
        Thread.sleep(2000);

        //clicking on next button
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button")).click();
        Thread.sleep(3000);

        driver.close();

    }

    public static void main(String[] args) throws Exception{
        CreatingGmailAccountChild obj = new CreatingGmailAccountChild();
        obj.signUp("chrome","https://google.com");
        obj.gmailAccount();
    }
}
