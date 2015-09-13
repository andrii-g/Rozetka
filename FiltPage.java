package rozetka;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltPage {
	
	public FiltPage(){
		PageFactory.initElements(TestPage.getDriver(), this);
	}
	
	@FindBy(linkText = "Сбросить")
	private WebElement backButton;
	
	@FindBy(xpath = ".//*[@id='title_page']/div/div/div[2]")
	private WebElement banner;
	
	@FindBy(xpath = ".//*[@id='title_page']/div/div/div[3]/ul/li[1]")
	private WebElement filtName;
	
	public StartPage resetFilter(){
		backButton.click();
		return new StartPage();
	}
	
	public String verifyFiltBannerText(){
		return banner.getText();
	}
	
	public String verifyFiltName(){
		return filtName.getText();
	}

}
