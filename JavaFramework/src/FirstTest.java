import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {





	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shanice\\Desktop\\ws\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		try
		{
		driver.get("https://am.jpmorgan.com/us/en/asset-management/gim/liq/home");
		System.out.println("1. Successfully launched browser");
		}
		catch (Exception e)
		{
			System.out.println("Step failed " + e);;
		}
		ObjectMap page = new ObjectMap(driver);
		Thread.sleep(5000);

		try
			{
			page.acceptDisclaimer.click();
			System.out.println("2. Successfully accepted disclaimer");
			}
			catch (Exception e)
			{
				System.out.println("Step failed " + e);;
			}
	
		
		
		Thread.sleep(5000);
		

		try
			{
			page.viewAllFunds.click();
			System.out.println("3. Successfull clicked view all funds");
			}
			catch (Exception e)
			{
				System.out.println("Step failed " + e);;
			}
		
		
		
		Thread.sleep(5000);

		try
			{
			page.checkboxA.click();
			System.out.println("4. Successfully filtered by A");
			}
			catch (Exception e)
			{
				System.out.println("Step failed " + e);;
			}
		
		
		
		
		Thread.sleep(2000);
		String table = page.tableEntry.getText();
		//System.out.println(table);
		if (table.contains("- A "))
		{
			System.out.println("5. Verified Filtered correctly by A");
		}
		else
		{
			System.out.println("Incorrectly filtered");
		}
		//	table =table.substring(tempvalue, table.length()-1);
		//System.out.println(table);
		//

		try
			{
			page.txtBox.sendKeys("4812A2843");
			System.out.println("6. Successfully entered text");
			}
			catch (Exception e)
			{
				System.out.println("Step failed " + e);;
			}
		
		Thread.sleep(2000);

		try
			{
			page.btnSearch.click();
			System.out.println(" 7. Successfully searched for record");
			}
			catch (Exception e)
			{
				System.out.println("Step failed " + e);;
			}
		
		Thread.sleep(5000);

		try
			{
			page.fundEntry.click();
			System.out.println("8 .Successfully opening fund");
			}
			catch (Exception e)
			{
				System.out.println("Step failed " + e);;
			}
	
		Thread.sleep(5000);

		try
			{
			page.portfolioTab.click();
			System.out.println("9. Successfully navigated to portfolie");
			}
			catch (Exception e)
			{
				System.out.println("Step failed " + e);;
			}
		


driver.quit();
		
	}

}
