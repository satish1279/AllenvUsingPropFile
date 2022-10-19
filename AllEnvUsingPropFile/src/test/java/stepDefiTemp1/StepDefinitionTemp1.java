package stepDefiTemp1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagesTemp1.ElementsTemp1;
import util.TakeSS;

public class StepDefinitionTemp1 {


	static WebDriver driver =null;

	ElementsTemp1 pages;
	TakeSS screenshots;
	FileInputStream fis;
	FileOutputStream fos;	

	String PropertiesFilepath ="src/test/resources/config.properties";

	Properties prop= new Properties();

	private static final Logger logger = LogManager.getLogger(StepDefinitionTemp1.class);



	@BeforeStep
	public void beforeStepHook() throws IOException, InterruptedException {
		Thread.sleep(500);
	}

	@AfterStep
	public void afterStepHook() throws IOException, InterruptedException {

		screenshots = new TakeSS(driver);
		screenshots.takeScreenshot();
		Thread.sleep(4000);
	}




	@Given ("^User is on Login page$")
	public void loginPage() throws IOException, InterruptedException {

		
		
		//				WebDriverManager.firefoxdriver().setup();
		//				driver= new FirefoxDriver();
				

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		fis= new FileInputStream(PropertiesFilepath);
		prop.load(fis);	

		driver.navigate().to(prop.getProperty("url"));
		fis.close();


		logger.info(" Browser Started for URL- " + prop.getProperty("url"));
		logger.info("This is login page");

	}


	@When ("^User is logged in after entering the correct credentials$")
	public void enterUsername() throws InterruptedException {

		pages =  new ElementsTemp1(driver);



		pages.entrUsernam();
		pages.entrPassword();
		pages.clikButon();	

		Thread.sleep(3000);
		logger.info("This is Homepage page");

	}



	//	=========	Recognize Page  ========
	
	@And ("^Clicks on Recognize link$")
	public void recogLink() throws InterruptedException, IOException {




		System.out.println("test");

		pages.clickRecognize();
		screenshots.takeScreenshot();
		logger.info("This is Recognize page");

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)");

	}



	/*
	//	=========	Skill Insight Page  ========
	
	@When ("^Clicks on Skill Insight link$")
	public void skillinsightLink() throws InterruptedException {

		System.out.println("test");




			pages.clickSkillInsight();
		logger.info("This is Wellness page");

		logger.info("This is Feedback page");
	}

	 */ 



	//	=========	 Wellness  Page  ========
	
	@And ("^Clicks on Wellness link$")
	public void WellnessLink() throws InterruptedException {
		System.out.println("test");
		pages.clickWellness();
		logger.info("This is Wellness page");

	}



	//=========	 Survey  Page  ========
	@When ("^Clicks on Survey link$")
	public void SurveyLink() throws InterruptedException {
		System.out.println("test");
		pages.clickSurvey();
		logger.info("This is Survey page");
	}



	//	=========	 My Summary  Page  ========
	@And ("^Clicks on My Summary link$")
	public void MySummaryLink() throws InterruptedException, IOException {
		System.out.println("test");

		pages.clickMySummary();
		screenshots.takeScreenshot();
		logger.info("This is My Summary page");

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,790)");
	}



	//	=========	 Redeem Page  ========
	@When ("^Clicks on Redeem link$")
	public void RedeemLink() throws InterruptedException, IOException  {
		System.out.println("test");
		pages.clickRedeem();
		Thread.sleep(3000);
		logger.info("This is Redeem page");
	}


	//	=========	 Dashboard & Reports Page  ========
	@And ("^Clicks on Dashboard link$")
	public void DashboardLink() throws InterruptedException, IOException {
		System.out.println("test");


		pages.clickDashboard();	
		Thread.sleep(2000);

		screenshots.takeScreenshot();
			logger.info("This is Dashboard page");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,740)");
		screenshots.takeScreenshot();
		Thread.sleep(1000);


		js.executeScript("window.scrollBy(0,630)");
		screenshots.takeScreenshot();
		Thread.sleep(1000);


		js.executeScript("window.scrollBy(0,550)");
		screenshots.takeScreenshot();
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,500)");
		screenshots.takeScreenshot();
		Thread.sleep(1000);		 
	}


	@When ("^Clicks on Reports tab$")
	public void ReportTab() throws InterruptedException {
		pages.clickHome();
		Thread.sleep(2000);
		System.out.println("test");

		pages.clickDashboard();
		Thread.sleep(3000);
		pages.clickReports();
		logger.info("This is Reports page");
	}

	@And ("^Clicks on Budget Head Report option from Select Report dropdown$")
	public void clickBudgetHeadReport() throws InterruptedException {
		System.out.println("test");

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickBudgetHeadReport();
		Thread.sleep(1000);
		logger.info("This is Budget Head Report page");

	}


	@When ("^Clicks on Recognitions Report option from Select Report dropdown$")
	public void clickRecognitionsReport() throws InterruptedException {
		System.out.println("test");

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickRecognitionsReport();
		Thread.sleep(5000);
		logger.info("This is Recognitions Report page");

	}

	@And ("^Clicks on Redemption Report option from Select Report dropdown$")
	public void clickRedemptionReport() throws InterruptedException {
		System.out.println("test");

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickRedemptionReport();
		Thread.sleep(3000);
		logger.info("This is Redemption Report page");
	}

	@When ("^Clicks on User Login Report option from Select Report dropdown$")
	public void clickUserLoginReport() throws InterruptedException {

		System.out.println("test");

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickUserLoginReport();

		logger.info("This is User Login Report page");

	}


	@And ("^Clicks on Data Visualization tab$")
	public void dataVisualizationTab() throws InterruptedException {

		System.out.println("test");

		pages.clickVisualization();
		logger.info("This is Data Visualization page");

	}

/*
	//=========	 Admin Console Page  ========

	@When ("^Clicks on Admin Console link$")
	public void adminConsole() throws InterruptedException, IOException {
		System.out.println("test");


		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clickAdminConsole();
		Thread.sleep(15000);



		// ==============  switch to next tab ===========================


		String currentTab = driver.getWindowHandle();

		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(currentTab);

		driver.switchTo().window(newTab.get(0));
		Thread.sleep(2000);

		screenshots.takeScreenshot();
		logger.info("This is Admin Console page");

		driver.close();

		driver.switchTo().window(currentTab);
		Thread.sleep(500);

		pages.clickUserprofile();

	}

*/

	//=========	 Logout cum Login Page STAGING ========

	@Given ("^user opened all the pages and now on its last step wrt Staging$")
	public void stagingLastpg() throws InterruptedException {

		Thread.sleep(1000);

	}
	@When ("^Clicks on LogOut wrt Staging$")
	public void stagingLogoutLink() throws InterruptedException {

		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clicklogOut();
		Thread.sleep(2000);

		pages.clickOkBtn();
		Thread.sleep(2000);

		logger.info("This is LogOut page");
	}


	@Then ("^User is navigated to login page wrt Staging$")
	public void stagingLoginPage()  throws InterruptedException, IOException {

		System.out.println("this is login page");
		Thread.sleep(2000);

		fos= new FileOutputStream(PropertiesFilepath);
		prop.setProperty("url", "https://goinfinity.beyond360tech.com");
		prop.store(fos, "url updated");
		fos.close();

		logger.info("url set as Goi Ind Production Environment in properties file");

		driver.close();
		logger.info("Browser Closed");
	}





	//=========	 Logout cum Login Page  IND-Production========

	@Given ("^user opened all the pages and now on its last step wrt Ind-Production$")
	public void indProdlastpg() throws InterruptedException {

		Thread.sleep(1000);

	}

	@When ("^Clicks on LogOut wrt Ind-Production$")
	public void indProdLogoutLink() throws InterruptedException {

		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clicklogOut();
		Thread.sleep(3000);

		pages.clickOkBtn();
		Thread.sleep(2000);

		logger.info("This is LogOut page");
	}


	@Then ("^User is navigated to login page wrt Ind-Production$")
	public void indProdLoginPage()  throws InterruptedException, IOException {

		System.out.println("this is login page");
		Thread.sleep(1000);

		fos= new FileOutputStream(PropertiesFilepath);
		prop.setProperty("url", "https://goinfinity.beyond360hub.com");
		prop.store(fos, "url updated");
		fos.close();

		logger.info("url set as HUB Environment in properties file");

		driver.close();
		logger.info("Browser Closed");
	}



	//=========	 Logout cum Login Page  US-Production========

	@Given ("^user opened all the pages and now on its last step wrt US-Production$")
	public void USProdlastpg() throws InterruptedException {

		Thread.sleep(1000);

	}
	@When ("^Clicks on LogOut wrt US-Production$")
	public void USProdLogoutLink() throws InterruptedException {

		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clicklogOut();
		Thread.sleep(3000);

		pages.clickOkBtn();
		Thread.sleep(2000);

		logger.info("This is LogOut page");
	}


	@Then ("^User is navigated to login page wrt US-Production$")
	public void USProdLoginPage()  throws InterruptedException, IOException {

		System.out.println("this is login page");
		Thread.sleep(1000);

		fos= new FileOutputStream(PropertiesFilepath);
		prop.setProperty("url", "https://beyondus-demo.beyond360apps.com");
		prop.store(fos, "url updated");
		fos.close();

		logger.info("url set as Beyond USdemo Environment in properties file");

		driver.close();
		logger.info("Browser Closed");
	}


	//=========	 Logout cum Login Page  Beyond USdemo========

	@Given ("^user opened all the pages and now on its last step wrt USdemo$")
	public void USdemolastpg() throws InterruptedException {

		Thread.sleep(1000);

	}

	@When ("^Clicks on LogOut wrt USdemo$")
	public void USdemoLogoutLink() throws InterruptedException {

		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clicklogOut();
		Thread.sleep(3000);

		pages.clickOkBtn();
		Thread.sleep(2000);

		logger.info("This is LogOut page");
	}


	@Then ("^User is navigated to login page wrt USdemo$")
	public void USdemoLoginPage()  throws InterruptedException, IOException {

		System.out.println("this is login page");
		Thread.sleep(1000);

		fos= new FileOutputStream(PropertiesFilepath);
		prop.setProperty("url", "https://goinfinity.beyond360apps.com");
		prop.store(fos, "url updated");
		fos.close();

		logger.info("url set as Goi Staging Environment in properties file");

		driver.close();
		logger.info("Browser Closed");
	}



}







