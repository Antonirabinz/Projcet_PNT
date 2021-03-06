package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatDepotAccount {
	public WebDriver driver;
	@FindBy(xpath="(//*[text()='Create an Account'])[1]")
	WebElement CreateSiteText;
	@FindBy(xpath = "//*[text()='Back']")
	WebElement back;
	
	@FindBy(name = "email")
	 WebElement email;
	 @FindBy(name = "password")
	 WebElement password;
	 @FindBy(name = "zipcode")
	 WebElement zipcode;
	 @FindBy(name = "phone")
	 WebElement phone;
	 @FindBy(xpath = "//span[text()='Create an Account']")
	 WebElement createAccountButton;
	 
	 public CreatDepotAccount(WebDriver driver) {
	  // TODO Auto-generated constructor stub
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	  
	 }
	 // if you do not put public VOID then you have to return
	 public String CreateAnAccountVerification() {
	  String currentTextAccount = CreateSiteText.getText();
	  return currentTextAccount;
	 }
	 public boolean linkds() {
		  boolean backds = back.isDisplayed();
		  return backds;
		 }
		 public void email(String emails) {
		  email.sendKeys(emails);
		 }
		 public void passwrd(String psswd) {
		  password.sendKeys(psswd);
		 }
		 public void zipCode(String zipCodes) {
		  zipcode.sendKeys(zipCodes);
		 }
		 public void phoneNumber(String numbers) {
		  phone.sendKeys(numbers);
		 }
		 public void createButtonAccount() {
		  createAccountButton.click();
		 }
		 public boolean createButtonClickable() {
		  boolean click = createAccountButton.isEnabled();
		  return click;
		 }
}
