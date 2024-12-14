package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(name = "q")  // Locator for Google search box
    private WebElement searchBox;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize elements
    }

    public void search(String query) {
    	
        searchBox.sendKeys(query);  // Use the initialized WebElement
        searchBox.submit();
    }
}