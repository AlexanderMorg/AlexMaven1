package MyTest;

import MainObject.AutoLogin;
import MainObject.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoLoginTest {
    WebDriver driver;



    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() throws Exception {
        MainPage mainPage = new MainPage(driver);
        AutoLogin autoLogin = new AutoLogin(driver);

        driver.manage().window().maximize();
        driver.get("http://www.sharelane.com/cgi-bin/main.py");

        mainPage.clickTestPortal();
        autoLogin.clickAccountCreator();
        autoLogin.clickCreateNewUser();
        autoLogin.clickAutoLogin();
    }

   @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
