import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchTests extends BaseTest{

public searchpage searchpage;
public WebDriver driver;

@Test(priority = 0)
    public void searchFun()
    {
        searchpage=new searchpage(driver);
        searchpage.searchfun();

    }

    @Test(priority =1 )
    public void getFirstResult()
    {
        searchpage=new searchpage(driver);
        String actualResult=searchpage.getfirstSearchResult();


        Assert.assertEquals(actualResult,"chefaa");

    }
}
