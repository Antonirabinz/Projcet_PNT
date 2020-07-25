package Runer;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.CreatDepotAccount;
import Pages.Home;
import Sites.PageObjecModelFarmeWork.Base;

public class HomeDepotTest extends Base{
  @Test (priority=1)
  public void Verification() {
	  Home home=new Home(driver);
	  String MyAccountText=home.MyAccountTextVerification();
	  SoftAssert softAssert=new SoftAssert();
	  softAssert.assertEquals(MyAccountText, "My Account");
	  String YourShoppingText=home.YourShoppingTextVerification();
	  YourShoppingText=YourShoppingText.trim();
	  softAssert.assertEquals(YourShoppingText, "You're shopping Leesburg OPEN until 8 pm");
	  String FindStoreText=home.StoreFinderTextVerification();
	  softAssert.assertEquals(FindStoreText, "Store Finder");
	  softAssert.assertAll();
  }
  
  @Test (priority=2)
  public void CreateTheAccount() {
	  Home home=new Home(driver);
	  home.MyAccountClick();
	  home.Registerbutton();
	  CreatDepotAccount dt= new CreatDepotAccount(driver);
	  String CreateAccountText=dt.CreateAnAccountVerification();
	  SoftAssert softAssert=new SoftAssert();
	  softAssert.assertEquals(CreateAccountText, "Create an Account");
	  boolean lk=dt.linkds();
	  softAssert.assertEquals(lk, true);
	  //boolean clicked=dt.createButtonClickable();
	  //softAssert.assertEquals(clicked,false);
	  dt.email("rafi@gmail.com");
	  dt.passwrd("virginia");
	  dt.phoneNumber("7034440004");
	  dt.zipCode("11001");
	  dt.createButtonAccount();

	 

 
	  
  }

  }

