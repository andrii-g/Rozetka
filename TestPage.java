package rozetka;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPage {
	
	private static WebDriver driver;
	static String baseURL = "http://rozetka.com.ua/notebooks/c80004/filter/";	//base URL for test
	
	public static WebDriver getDriver(){			
		return driver;
	}
	
	@BeforeClass												
	public static void setUp(){												//method that is executed once before all tests
		driver = new FirefoxDriver();										//start Firefox driver
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	//implicitly wait
		driver.manage().window().setPosition(new Point(316, 0));			//set window position
		driver.manage().window().setSize(new Dimension(1050, 500));			//set window size
		driver.get(baseURL);												//open base URL
	}
	
	@Test
	public void testNetbooks() throws InterruptedException{		//test class "Нетбуки"
		StartPage strtPage = new StartPage();
		String filtClassName = strtPage.chooseNetbook();		//Filter name on start page		
		FiltPage fltrdPage = strtPage.clickNetbook();
		String fltrBanner = fltrdPage.verifyFiltBannerText();	//Banner text on the filtered page	
		String fltrName = fltrdPage.verifyFiltName();			//Filter text on the filtered page
		
		try{
			assertTrue(fltrdPage.verifyFiltBannerText().contains(filtClassName));
			assertTrue(fltrdPage.verifyFiltName().contains(filtClassName));
			System.out.println("Filter name: " + filtClassName + "; Banner text: " + fltrBanner +
					"; Choosen filter type: " + fltrName);
		}catch(Exception e){
			System.out.println(e.toString());
		}		
		fltrdPage.resetFilter();
	}
	
	@Test
	public void testSimpleNotes(){								//test class "Для несложных задач"
		StartPage strtPage = new StartPage();	
		String filtClassName = strtPage.chooseSimple();			//Filter name on start page			
		FiltPage fltrdPage = strtPage.clickSimple();
		String fltrBanner = fltrdPage.verifyFiltBannerText();	//Banner text on the filtered page
		String fltrName = fltrdPage.verifyFiltName();			//Filter text on the filtered page
		
		try{
			assertTrue(fltrdPage.verifyFiltBannerText().contains(filtClassName));
			assertTrue(fltrdPage.verifyFiltName().contains(filtClassName));
			System.out.println("Filter name: " + filtClassName + "; Banner text: " + fltrBanner +
					"; Choosen filter type: " + fltrName);
		}catch(Exception e){
			System.out.println(e.toString());
		}		
		fltrdPage.resetFilter();
	}
	
	@Test
	public void testWorkNStudyNotes(){							//test class "Для работы и учебы"
		StartPage strtPage = new StartPage();	
		String filtClassName = strtPage.chooseWorkNStudy();		//Filter name on start page			
		FiltPage fltrdPage = strtPage.clickWorkNStudy();
		String fltrBanner = fltrdPage.verifyFiltBannerText();	//Banner text on the filtered page
		String fltrName = fltrdPage.verifyFiltName();			//Filter text on the filtered page
		
		try{
			assertTrue(fltrdPage.verifyFiltBannerText().contains(filtClassName));
			assertTrue(fltrdPage.verifyFiltName().contains(filtClassName));
			System.out.println("Filter name: " + filtClassName + "; Banner text: " + fltrBanner +
					"; Choosen filter type: " + fltrName);
		}catch(Exception e){
			System.out.println(e.toString());
		}		
		fltrdPage.resetFilter();
	}
	
	@Test
	public void testBusinessNotes(){							//test class "Для бизнеса"
		StartPage strtPage = new StartPage();
		String filtClassName = strtPage.chooseBusiness();		//Filter name on start page	
		FiltPage fltrdPage = strtPage.clickBusiness();
		String fltrBanner = fltrdPage.verifyFiltBannerText();	//Banner text on the filtered page
		String fltrName = fltrdPage.verifyFiltName();			//Filter text on the filtered page
		
		try{
			assertTrue(fltrdPage.verifyFiltBannerText().contains(filtClassName));
			assertTrue(fltrdPage.verifyFiltName().contains(filtClassName));
			System.out.println("Filter name: " + filtClassName + "; Banner text: " + fltrBanner +
					"; Choosen filter type: " + fltrName);
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
		fltrdPage.resetFilter();
	}
	
	@Test
	public void testMultimediaCenter(){							//test class "Мультимедийные центры"
		StartPage strtPage = new StartPage();
		String filtClassName = strtPage.chooseMultimedia();		//Filter name on start page	
		FiltPage fltrdPage = strtPage.clickMultimedia();
		String fltrBanner = fltrdPage.verifyFiltBannerText();	//Banner text on the filtered page
		String fltrName = fltrdPage.verifyFiltName();			//Filter text on the filtered page
		
		try{
			assertTrue(fltrdPage.verifyFiltBannerText().contains(filtClassName));
			assertTrue(fltrdPage.verifyFiltName().contains(filtClassName));
			System.out.println("Filter name: " + filtClassName + "; Banner text: " + fltrBanner +
					"; Choosen filter type: " + fltrName);
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
		fltrdPage.resetFilter();
	}
	
	@Test
	public void testGamerNotes(){								//test class "Геймерские ноутбуки"
		StartPage strtPage = new StartPage();
		String filtClassName = strtPage.chooseGamerNote();		//Filter name on start page	
		FiltPage fltrdPage = strtPage.clickGamerNote();
		String fltrBanner = fltrdPage.verifyFiltBannerText();	//Banner text on the filtered page
		String fltrName = fltrdPage.verifyFiltName();			//Filter text on the filtered page
		
		try{
			assertTrue(fltrdPage.verifyFiltBannerText().contains(filtClassName));
			assertTrue(fltrdPage.verifyFiltName().contains(filtClassName));
			System.out.println("Filter name: " + filtClassName + "; Banner text: " + fltrBanner +
					"; Choosen filter type: " + fltrName);
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
		fltrdPage.resetFilter();
	}
	
	@Test
	public void testThinLight(){								//test class "Тонкие и легкие"
		StartPage strtPage = new StartPage();
		String filtClassName = strtPage.chooseThinLight();		//Filter name on start page	
		FiltPage fltrdPage = strtPage.clickThinLightNote();
		String fltrBanner = fltrdPage.verifyFiltBannerText();	//Banner text on the filtered page
		String fltrName = fltrdPage.verifyFiltName();			//Filter text on the filtered page
		
		try{
			assertTrue(fltrdPage.verifyFiltBannerText().contains(filtClassName));
			assertTrue(fltrdPage.verifyFiltName().contains(filtClassName));
			System.out.println("Filter name: " + filtClassName + "; Banner text: " + fltrBanner +
					"; Choosen filter type: " + fltrName);
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
		fltrdPage.resetFilter();
	}
	
	@Test
	public void testTransformerNotes(){								//test class "Трансформеры"
		StartPage strtPage = new StartPage();
		String filtClassName = strtPage.chooseTransformerNote();	//Filter name on start page	
		FiltPage fltrdPage = strtPage.clickTransformerNote();
		String fltrBanner = fltrdPage.verifyFiltBannerText();		//Banner text on the filtered page
		String fltrName = fltrdPage.verifyFiltName();				//Filter text on the filtered page
		
		try{
			assertTrue(fltrdPage.verifyFiltBannerText().contains(filtClassName));
			assertTrue(fltrdPage.verifyFiltName().contains(filtClassName));
			System.out.println("Filter name: " + filtClassName + "; Banner text: " + fltrBanner +
					"; Choosen filter type: " + fltrName);
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
		fltrdPage.resetFilter();
	}
	
	@AfterClass														
	public static void tearDown(){									//method that is executed once after all tests
		driver.quit();												//quit driver and complete the test
	}

}
