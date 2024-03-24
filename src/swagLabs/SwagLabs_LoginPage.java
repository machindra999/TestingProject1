package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs_LoginPage {

	

	@FindBy(id ="user-name") private WebElement user_name;
	@FindBy (name="password") private WebElement password_field;
	@FindBy(id="login-button")private WebElement login_button;
	
	//constructor
	public SwagLabs_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void enterUserName()
	{
		user_name.sendKeys("standard_user");
	}
	
	public void enterPassword()
	{
		password_field.sendKeys("secret_sauce");
	}
	
	public void submitButton()
	{
		login_button.click();
	}
}
