package MainObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickShoppingCart() {
        shoppingCart.click();
    }

    public void sendKeysSearchField() {
        searchField.sendKeys("War and Peace");
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public void sendKeysEmail(String getRegEmail) {
        email.sendKeys(getRegEmail);
    }

    public void sendKeysPassword() {
        password.sendKeys("1111");
    }

    public void clickLogin() {
        login.click();
    }

    public void clickSignUp() {
        signUp.click();
    }

    public void clickTestPortal(){
        testPortal.click();
    }



    @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/a[2]")
    private WebElement testPortal;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
    private WebElement shoppingCart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[1]")
    private WebElement searchField;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[2]")
    private WebElement searchBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
    private WebElement email;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
    private WebElement password;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
    private WebElement login;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    private WebElement signUp;


}