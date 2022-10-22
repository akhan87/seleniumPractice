package locators;

import myFirstSeleniumWork.RelativeXpathParent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RelativeXpathChild extends RelativeXpathParent {

    public void creatingAccXpath() throws Exception{

        //click on sign in
        WebElement signIn = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
        signIn.click();
        Thread.sleep(3000);

        //insert email address
        WebElement insertEmail = driver.findElement(By.xpath("//input[@name='email_create']"));
        insertEmail.sendKeys("heroalom2031@gmail.com");
        Thread.sleep(2000);

        //clicking on Create an account
        WebElement clickCreate = driver.findElement(By.xpath("//button[@name='SubmitCreate']/span"));
        clickCreate.click();
        Thread.sleep(2000);

        //click on gender
        WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        gender.click();
        Thread.sleep(2000);

        //enter first name
        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstName.sendKeys("Hero");
        Thread.sleep(2000);

        //enter last name
        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastName.sendKeys("Alom");
        Thread.sleep(2000);

        //choosing password
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Selenium2022@");
        Thread.sleep(2000);

        //address
        WebElement address = driver.findElement(By.xpath("//input[@class='form-control' and @id='address1']"));
        address.sendKeys("2022 Heroalom Ln");
        Thread.sleep(2000);

        //city
        WebElement city = driver.findElement(By.xpath("//input[@type='text' and @id='city']"));
        city.sendKeys("Garland");
        Thread.sleep(2000);

        //state
        WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
        state.sendKeys("tt");
        Thread.sleep(2000);

        //zipcode
        WebElement zipcode = driver.findElement(By.xpath("//input[@id='postcode']"));
        zipcode.sendKeys("75044");
        Thread.sleep(2000);

        //country
        WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
        country.sendKeys("United States");
        Thread.sleep(2000);

        //additional info
        WebElement additionalInfo = driver.findElement(By.xpath("//textarea[@name='other']"));
        additionalInfo.sendKeys("N/A");
        Thread.sleep(2000);

        //phone number
        WebElement phoneNum = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
        phoneNum.sendKeys("2145165884");
        Thread.sleep(2000);

        //click on Register
        WebElement clickRegister = driver.findElement(By.xpath("//button[@name='submitAccount']/span"));
        clickRegister.click();

    }

   // public void validation(){
      //  WebElement clickName = driver.findElement(By.xpath("//span[text()='Hero Alom']"));
       // clickName.click();
  //  }

    public static void main(String[] args) throws Exception{
        RelativeXpathChild obj = new RelativeXpathChild();
        obj.automationWeb("browser", "https://automationpractice.com");
        obj.creatingAccXpath();
    }
}
