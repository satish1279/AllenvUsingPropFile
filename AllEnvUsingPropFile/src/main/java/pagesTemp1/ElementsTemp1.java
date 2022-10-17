package pagesTemp1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsTemp1 {



	WebDriver driver;


	//============== Login ============//

	@FindBy(css="input[name='username']")
	WebElement txt_usrname;

	@FindBy(css="input[name='password']")
	WebElement txt_password;

	@FindBy(css="#cred_sign_in_button")
	WebElement btn_login;



	//============== Log Out ============//

	@FindBy(xpath="//a[@class='user-profile dropdown-toggle ng-isolate-scope']//img[@class='ng-scope']")
	WebElement image_userProfile;

	@FindBy(css="a[title='Logout']")
	WebElement btn_logOut;

	@FindBy(css="button[class='btn_filled btn_filled_primary']")
	WebElement btn_OK;



	//============== Admin Console Link ============//

	@FindBy(css="a[class='ng-binding ng-scope ng-isolate-scope']")
	WebElement link_adminConsole;




	//============== All Pages ============//

	@FindBy(css="a[class='cursorPointer'][href='Recognize/Recognize']")
	WebElement link_recognize;

	@FindBy(css="a[class='cursorPointer'][href='Feedback/Index']")
	WebElement link_skillInsight;

	@FindBy(css="a[class='cursorPointer'][href='Wellness/index']")
	WebElement link_wellness;

	@FindBy(css="a[class='cursorPointer'][href='Survey/Index']")
	WebElement link_survey;

	@FindBy(css="a[class='cursorPointer'][href='managejob/index']")
	WebElement link_jobReferral;

	@FindBy(css="a[class='cursorPointer'][href='Home/viewProfile']")
	WebElement link_mySummary;




	@FindBy(css="a[class='cursorPointer'][href='Redeem/RedeemPlus']")
	WebElement link_redeem;

	@FindBy(css="a[class='btn_link btn_link_primary']")
	WebElement OrderHistoryLink;





	//============== Reports ============//

	@FindBy(xpath="//a[@class='cursorPointer'][@href='Dashboard/Dashboard']//span[@class='ng-binding'][contains(text(),'Dashboard')]")
	WebElement link_dashboard; 



	@FindBy(xpath="//ul[@class='horizontal_block_tab_menu clearfix']/li[3]/a[1]")
	WebElement tab_reports;

	@FindBy(xpath="//*[@class='sort-by res-sort clearfix dash_sort _visu']/li[2]")
	WebElement dropdown_selectReports;

	@FindBy(xpath="//*[@class='k-list-scroller']/ul[1]/li[3]/span[1]/h2[1]")
	WebElement report_BudgetHeadReport;

	@FindBy(xpath="//*[@class='k-list-scroller']/ul[1]/li[12]/span[1]/h2[1]")
	WebElement report_RecognitionsReport;

	@FindBy(xpath="//*[@class='k-list-scroller']/ul[1]/li[14]/span[1]/h2[1]")
	WebElement report_RedemptionReport;

	@FindBy(xpath="//*[@class='k-list-scroller']/ul[1]/li[20]/span[1]/h2[1]")
	WebElement report_UserLoginReport;


	@FindBy(xpath="//ul[@class='horizontal_block_tab_menu clearfix']/li[2]/a[1]")
	WebElement tab_DataVisualization;

	
	@FindBy(css="span[class='sm site_title']")
	WebElement logo;
	

	//============== Constructor ============//


	public ElementsTemp1(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver,this);

	}






	//============== Login ============//

	public void entrUsernam() {
		txt_usrname.sendKeys("satish.jaiswal@beyond360.com");
	}

	public void entrPassword() {

		txt_password.sendKeys("pass@12345");
	}

	public void clikButon() {
		btn_login.click();
	}



	//============== Log Out ============//

	public void clickUserprofile() {	
		image_userProfile.click();		
	}

	public void clicklogOut() {	
		btn_logOut.click();		
	}	

	public void clickOkBtn() {	
		btn_OK.click();		
	}



	//============== All Pages ============//

	public void clickRecognize() {	
		link_recognize.click();
	}

	public void clickSkillInsight() {	
		link_skillInsight.click();
	}

	public void clickWellness() {	
		link_wellness.click();
	}

	public void clickSurvey() {	
		link_survey.click();
	}

	public void clickJob() {	
		link_jobReferral.click();
	}



	public void clickMySummary() {	
		link_mySummary.click();
	}

	/*
		public void clickOrderHistoryLink() {	
			String openInNewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			OrderHistoryLink.sendKeys(openInNewtab);
			}
	 */

	public void clickRedeem() {	
		link_redeem.click();
	}


	public void clickAdminConsole() {	
		link_adminConsole.click();
	}


	public void clicklogo() {	
		logo.click();
	}



	//============== Reports ============//

	public void clickDashboard() {	
		link_dashboard.click();
	}



	public void clickReports() {	
		tab_reports.click();		
	}

	public void clickSelectReportDropdown() {	
		dropdown_selectReports.click();		
	}

	public void clickBudgetHeadReport() {	
		report_BudgetHeadReport.click();		
	}

	public void clickRecognitionsReport() {	
		report_RecognitionsReport.click();		
	}

	public void clickRedemptionReport() {	
		report_RedemptionReport.click();		
	}

	public void clickUserLoginReport() {	
		report_UserLoginReport.click();		
	}



	public void clickVisualization() {	
		tab_DataVisualization.click();
	}



}





