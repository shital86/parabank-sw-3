package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utilities;

public class RegisterTest extends Utilities {
    String baseUrl="https://parabank.parasoft.com/parabank/index.htm";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyThatSigningUpPageDisplay(){

        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));
        verifyText("Signing up is easy!",By.xpath("//h1[contains(text(),'Signing up is easy!')]"),"Signing up is easy!");
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){

        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));

        sendTextToElement(By.xpath("//input[@id='customer.firstName']"),"Kim");
        sendTextToElement(By.xpath("//input[@id='customer.lastName']"),"Marsh");
        sendTextToElement(By.xpath("//input[@id='customer.address.street']"),"3 Avenue");
        sendTextToElement(By.xpath("//input[@id='customer.address.city']"),"lima");
        sendTextToElement(By.xpath("//input[@id='customer.address.state']"),"Maharastra");
        sendTextToElement(By.xpath("//input[@id='customer.address.zipCode']"),"123456");
        sendTextToElement(By.xpath("//input[@id='customer.phoneNumber']"),"0012237378338");
        sendTextToElement(By.xpath("//input[@id='customer.ssn']"),"87875645");
        sendTextToElement(By.xpath("//input[@id='customer.username']"),"Kim");
        sendTextToElement(By.xpath("//input[@id='customer.password']"),"Happy1234");
        sendTextToElement(By.xpath("//input[@id='repeatedPassword']"),"Happy1234");
        clickOnElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
        verifyText("Your account was created successfully. You are now logged in.",By.xpath("//div[@id='mainPanel']/div[3]/div[2]/p"),"Your account was created successfully. You are now logged in.");

    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
