package locators;

import myFirstSeleniumWork.AutomationAccountParent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationAccountChild extends AutomationAccountParent {

    public void signUp() throws Exception{

        //clicking on sign in
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
        Thread.sleep(2000);

        //typing email address
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input")).sendKeys("asadul241988@gmail.com");
        Thread.sleep(2000);

        //clicking on creating account
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span")).click();
        Thread.sleep(2000);

        //check mark on Mr. or Mrs.
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div/span/input")).click();
        Thread.sleep(2000);

        //first name
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")).sendKeys("Ashadullah");
        Thread.sleep(2000);

        //last name
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input")).sendKeys("Khan");
        Thread.sleep(2000);

        //password
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input")).sendKeys("Selenium2022@");
        Thread.sleep(2000);

        //address
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[4]/input")).sendKeys("2401 Hero Alom Ln");
        Thread.sleep(2000);

        //city
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input")).sendKeys("Garland");
        Thread.sleep(2000);

        //selecting state from drop down
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select")).sendKeys("tt");
        Thread.sleep(2000);

        //zipcode
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[8]/input")).sendKeys("75044");
        Thread.sleep(2000);

        //country
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[9]/div/select")).sendKeys("United States");
        Thread.sleep(2000);

        //additional
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[10]/textarea")).sendKeys("N/A");
        Thread.sleep(2000);

        //phone number
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[13]/input")).sendKeys("2145165884");
        Thread.sleep(2000);

        //clicking register
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span")).click();
        Thread.sleep(2000);

    }



    public static void main(String[] args) throws Exception{
        AutomationAccountChild obj = new AutomationAccountChild();
        obj.accountAutomation("chrome","https://automationpractice.com");
        obj.signUp();
    }
}