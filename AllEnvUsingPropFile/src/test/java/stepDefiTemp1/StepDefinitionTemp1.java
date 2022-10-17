package stepDefiTemp1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
		//	screenshots.takeScreenshot();
		Thread.sleep(1000);
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

		
		logger.info(" Browser Started for URL- " +prop.getProperty("url"));
		logger.info("This is login page");
		
	}


	@When ("^User is logged in after entering the correct credentials$")
	public void enterUsername() throws InterruptedException {

		pages =  new ElementsTemp1(driver);

		pages.entrUsernam();
		pages.entrPassword();
		//pages.clikButon();	

		Thread.sleep(3000);
		logger.info("This is Homepage page");

	}


	//	=========	Recognize Page  ========
	
	@And ("^Clicks on Recognize$")
	public void recogLink() throws InterruptedException, IOException {

		System.out.println("test");

		pages.clickRecognize();

		/*
			screenshots.takeScreenshot();
			logger.info("This is Recognize page");

			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,550)");

		 */

	}

	@Then ("^User is on homepage$")
	public void homepage() throws InterruptedException {
		Thread.sleep(1000);

	}



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
		prop.setProperty("url", "http://beyondus-demo.beyond360apps.com/");
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
		prop.setProperty("url", "https://goinfinity.beyond360tech.com/");
		prop.store(fos, "url updated");
		fos.close();

		logger.info("url set as Ind Production Environment in properties file");

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
		prop.setProperty("url", "https://goinfinity.beyond360hub.com/");
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
		prop.setProperty("url", "https://goinfinity.beyond360apps.com/");
		prop.store(fos, "url updated");
		fos.close();
		
		logger.info("url set as Staging Environment in properties file");

		driver.close();
		logger.info("Browser Closed");
	}

}







