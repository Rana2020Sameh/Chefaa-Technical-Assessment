import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchpage {
public WebDriver driver;
public String resultTitle;
    public searchpage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement searchbar = driver.findElement(By.xpath("//textarea[@title='Search']"));
List<WebElement> searchResults=driver.findElements(By.xpath("//div[@id='Alh6id']"));
    public void searchfun()
    {
        searchbar.sendKeys("chefaa");

    }
    public String getfirstSearchResult()
    {
        searchResults.get(0).click();
        resultTitle=searchResults.get(0).getText();
        return resultTitle;
    }

}
