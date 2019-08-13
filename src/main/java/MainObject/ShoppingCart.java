package MainObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

    private WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickBook() {
        book.click();
    }

    public void clickAddToCart(){
        addToCart.click();
    }

    public void clickProceedToCheackOut(){
        proceedToCheckOut.click();
    }



    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td")
    private WebElement book;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr/td[2]/p[2]/a/img")
    private WebElement addToCart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[5]/td/form/input[1]")
    private WebElement proceedToCheckOut;


}
