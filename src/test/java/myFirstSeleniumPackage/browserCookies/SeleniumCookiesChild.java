package myFirstSeleniumPackage.browserCookies;

import myFirstSeleniumWork.SeleniumCookiesParent;

public class SeleniumCookiesChild extends SeleniumCookiesParent {

    public void findingCookies(){
        int numCookies = driver.manage().getCookies().size();
        //print out number of cookies
        System.out.println(numCookies);

        //info of the cookies
        System.out.println(driver.manage().getCookies());

        driver.manage().deleteAllCookies();
        int numCookiesAfterDelete = driver.manage().getCookies().size();
        //print out number of cookies
        System.out.println(numCookiesAfterDelete);

        //info of the cookies
        System.out.println(driver.manage().getCookies());

    }

    public static void main(String[] args) throws Exception{
        SeleniumCookiesChild obj = new SeleniumCookiesChild();
        obj.browsers("chrome", "https://walmart.com");
        obj.findingCookies();
    }
}
