import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ObjectMap {

	public ObjectMap(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[@id=\"ng-app\"]/body/div[5]/div/div/div/div/div[2]/div[4]/div[2]/div")
	public WebElement acceptDisclaimer;

	@FindBy(xpath="//*[@id=\"Buildingstrongerliquiditystrategies\"]/div[1]/div[3]/div/div/div/div[4]/a[2]")
	public WebElement viewAllFunds;
	
	@FindBy(id="f-A")
	public WebElement checkboxA;

	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div[1]/div[2]/div[1]/div/input")
	public WebElement txtBox;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div[1]/div[2]/div[1]/div/a")
	public WebElement btnSearch;

	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]")
	public WebElement fundEntry;
	
	@FindBy(id="PortfolioLi")
	public WebElement portfolioTab;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span")
	public WebElement tableEntry;
}
