package MyTest;

import MainObject.MainPage;
import MainObject.Registration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {
     WebDriver driver;


    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() throws Exception {
        MainPage mainPage = new MainPage(driver);
        Registration registration = new Registration(driver);

        driver.manage().window().maximize();
        driver.get("http://www.sharelane.com/cgi-bin/main.py");

        mainPage.clickSignUp();
        registration.sendKeysZipCode();
        registration.clickConfirmBtn();
        registration.sendKeysFirstName();
        registration.sendKeysEmail();
        registration.sendKeysRegPsw();
        registration.sendKeysConRegPsw();
        registration.clickRegisterBtn();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}