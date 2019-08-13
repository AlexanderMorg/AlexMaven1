package MainObject;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class Registration {

    private WebDriver driver;

    public Registration (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void sendKeysZipCode() {
        zipCode.sendKeys("55555");
    }

    public void clickConfirmBtn() {
        confirmBtn.click();
    }

    public void sendKeysFirstName() {
        firstName.sendKeys("Alex");
    }

    public void sendKeysEmail() {
        email.sendKeys("alex@mail.ru");
    }

    public void sendKeysRegPsw() {
        regPsw.sendKeys("55555");
    }

    public void sendKeysConRegPsw() {
        conRegPsw.sendKeys("55555");
    }

    public void clickRegisterBtn() {
        registerBtn.click();
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement zipCode;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement confirmBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    private WebElement firstName;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement email;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    private WebElement regPsw;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    private WebElement conRegPsw;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
     private WebElement registerBtn;


}
