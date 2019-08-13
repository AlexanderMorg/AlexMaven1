package MainObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoLogin {

    private WebDriver driver;

    public AutoLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAccountCreator() {
        accountCreator.click();
    }

    public void clickCreateNewUser() {
        createNewUser.click();
    }

    public void clickAutoLogin() {
        autoLogin.click();
    }



    @FindBy(xpath = "/html/body/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/a")
    private WebElement accountCreator;

    @FindBy(xpath = "/html/body/center/table/tbody/tr/td/center/form/p/input")
    private WebElement createNewUser;

    @FindBy(xpath = "/html/body/center/table/tbody/tr/td/center/form/input[3]")
    private WebElement autoLogin;
}
