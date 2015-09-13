package rozetka;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {
	
	public StartPage(){
		PageFactory.initElements(TestPage.getDriver(), this); 	
	}
	//-------------------------
	@FindBy(xpath = ".//*[@id='sort_named_filters']/li[1]/label/a/span/i[1]")
	private WebElement netbook;					//"Нетбуки"
	
	public FiltPage clickNetbook(){			
		netbook.click();
		return new FiltPage();
	}
	
	public String chooseNetbook(){			
		return netbook.getText();
	}
	//-------------------------
	@FindBy(xpath = ".//*[@id='sort_named_filters']/li[2]/label/a/span/i[1]")
	private WebElement simpleNote;				//"Для несложных задач"
	
	public FiltPage clickSimple(){			
		simpleNote.click();
		return new FiltPage();
	}
	
	public String chooseSimple(){			
		return simpleNote.getText();
	}
	//-------------------------
	@FindBy(xpath = ".//*[@id='sort_named_filters']/li[3]/label/a/span/i[1]")
	private WebElement workNStudyNote;			//"Для работы и учебы"
	
	public FiltPage clickWorkNStudy(){		
		workNStudyNote.click();
		return new FiltPage();
	}
	
	public String chooseWorkNStudy(){		
		return workNStudyNote.getText();
	}
	//-------------------------
	@FindBy(xpath = ".//*[@id='sort_named_filters']/li[4]/label/a/span/i[1]")
	private WebElement businessNote;			//"Для бизнеса"
	
	public FiltPage clickBusiness(){		
		businessNote.click();
		return new FiltPage();
	}
	
	public String chooseBusiness(){			
		return businessNote.getText();
	}
	//-------------------------
	@FindBy(xpath = ".//*[@id='sort_named_filters']/li[5]/label/a/span/i[1]")
	private WebElement multimediaCenter;		//"Мультимедийные центры"
	
	public FiltPage clickMultimedia(){		
		multimediaCenter.click();
		return new FiltPage();
	}
	
	public String chooseMultimedia(){		
		return multimediaCenter.getText();
	}
	//-------------------------
	@FindBy(xpath = ".//*[@id='sort_named_filters']/li[6]/label/a/span/i[1]")
	private WebElement gamerNote;				//"Геймерские ноутбуки"
	
	public FiltPage clickGamerNote(){
		gamerNote.click();
		return new FiltPage();
	}
	
	public String chooseGamerNote(){
		return gamerNote.getText();
	}
	//-------------------------
	@FindBy(xpath = ".//*[@id='sort_named_filters']/li[7]/label/a/span/i[1]")
	private WebElement thinLightNote;			//"Тонкие и легкие"
	
	public FiltPage clickThinLightNote(){
		thinLightNote.click();
		return new FiltPage();
	}
	
	public String chooseThinLight(){
		return thinLightNote.getText();
	}
	//-------------------------
	@FindBy(xpath = ".//*[@id='sort_named_filters']/li[8]/label/a/span/i[1]")
	private WebElement transformerNote;			//"Трансформеры"
	
	public FiltPage clickTransformerNote(){
		transformerNote.click();
		return new FiltPage();
	}
	
	public String chooseTransformerNote(){
		return transformerNote.getText();
	}
}
