package com.crunchsdkios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;


public class IOSSDK {
	
	public static IOSDriver<?> driver;
	public static WebDriverWait wait;
	@SuppressWarnings("rawtypes")
	TouchAction action;
	  
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
	    caps.setCapability("app", "/Users/apple/Documents/ioscsdk/Example.ipa");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability( "udid", "d9281185fb7cdff99e8799a22f0d3028ba216de9");
        caps.setCapability("platformName", "IOS");
        caps.setCapability( "platformVersion", "11.2.6");
        caps.setCapability("xcodeOrgID", "KLLYGU7M7Q");
        caps.setCapability("xcodeSigningId", "iPhone Developer");
        
        caps.setCapability("xcodeConfigFile", "/Users/apple/Documents/csdk.xcconfig");
        caps.setCapability("deviceName", "Vijay");
        caps.setCapability("autoAcceptAlerts", true);
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 100);
        //caps.setCapability("usePrebuiltWDA",true);
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        
        String score = args[0];
      
		
		IOSSDK d = new IOSSDK();
		
		//d.fromGallerytranscode();
		
		
		d.fromDropboxtranscode(score);

	
	}
	 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void fromDropboxtranscode(String score) throws InterruptedException {
		
		
		

		
		
		//String score = System.getenv("SSIM");
		//System.out.println(score);
		//float iscore = Integer.parseInt(score);
		
		driver.findElementByName("Transcode").click();
		/*driver.findElementByAccessibilityId("Camera").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByAccessibilityId("Camera Roll").click();
		@SuppressWarnings("unchecked")
		List<WebElement> img = (List<WebElement>) driver.findElementsByClassName("XCUIElementTypeImage");
		for (int x=0; x<img.size();x++) {*/
			
		driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\"CRTranscoderTestView\"]/XCUIElementTypeButton[2]").click();
		driver.findElementByAccessibilityId("SSIM").click();
		WebElement cs = (WebElement) driver.findElementsByClassName("XCUIElementTypeSwitch").get(2);
		if(cs.getAttribute("value").equals("0")) {
			
			
			cs.click();
		}
		
		WebElement st = (WebElement) driver.findElementsByClassName("XCUIElementTypeTextField").get(1);
		st.clear();
		st.sendKeys(score);
		driver.findElementByAccessibilityId("Back").click();
		driver.findElementByAccessibilityId("Organize").click();
		//WebElement el = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"CrunchSDK\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]");
	    //WebElement el = (WebElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"CrunchSDK\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther");
	    //el.click();
		
		  Dimension dimensions = driver.manage().window().getSize();
		  int screenWidth = dimensions.getWidth();
		  int screenHeight = dimensions.getHeight();
		  System.out.println(screenWidth);
		  System.out.println(screenHeight);
		  
		  
        
			Thread.sleep(3000);
		
	    new TouchAction(driver).tap(PointOption.point(40, 40)).perform();
	    
	       Thread.sleep(1000);
	    
	    new TouchAction(driver).tap(PointOption.point(45, 180)).perform();
	    
	    Thread.sleep(1000);

		new TouchAction(driver).tap(PointOption.point(50, 200)).perform();
		
		Thread.sleep(1000);
		
		new TouchAction(driver).tap(PointOption.point(55, 200)).perform();
		
		driver.findElementByAccessibilityId("480p").click();
		//new TouchAction(driver).press(new PointOption().withCoordinates(181,130)).perform();
		
				
		//WebElement vid = (WebElement) driver.findElementsByClassName("XCUIElementTypeImage").get(1);
		//vid.click();
		//driver.findElementByAccessibilityId("Done").click();
		//driver.findElementByAccessibilityId("480p").click();
		//WebDriverWait wait = new WebDriverWait(driver,100);
		//wait.until(ExpectedConditions.inv 
		Thread.sleep(3000);
		
		
		List<WebElement> tid = (List<WebElement>) driver.findElementsByAccessibilityId("Task ID:");
		int s = tid.size();
		
		System.out.println("Size is "+s);
		
		if(s==1) {
			
			
			
			driver.findElementByAccessibilityId("Export").click();
		}
		else {
			
			try {
				
				
				wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Transcoding\"][2]")));
				
			}
			catch(Exception e) {
				
				Thread.sleep(2000);
				List<WebElement> exp2 = (List<WebElement>) driver.findElementsByAccessibilityId("Export");
				exp2.get(0).click();
				
				
				
			}
				
				
		}
				

			
			
		
		
		/*try {
		
		  driver.findElementByXPath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[@name=\"Transcoding\"]");	
		  WebElement exp = driver.findElementByXPath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[@name=\"Export\"]");
		  exp.click();

		}
		catch(Exception e) {
			
			System.out.println("Transcoding text is not found");
		}*/
			//driver.findElementByXPath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[@name=\"Export\"]");
		//WebElement exp = (WebElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"CrunchSDK\"]/XCUIElementTypeWindow[1]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[@name=\"Export\"])");
		
		//exp.click();
		driver.findElementByAccessibilityId("Export transcoded").click();
		WebElement dp = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"ActivityListView\"]/XCUIElementTypeOther");
		dp.click();
		
		 try {
			 
			   driver.findElementByAccessibilityId("TRANS1");
			  driver.findElementByAccessibilityId("Save").click();
	            
	            //WebElement cf = driver.findElementByAccessibilityId("Choose a Folder…");
	            //cf.click();
	            
	           
	        }
	        catch (Exception e)
	        {
	        
	           	 WebElement cf = driver.findElementByAccessibilityId("Choose a Folder…");
	               cf .click();
	             WebElement tf = driver.findElementByAccessibilityId("TRANS1. Folder");
		       	    tf.click();
		       	driver.findElementByAccessibilityId("Choose").click();
		       	driver.findElementByAccessibilityId("Save").click();
	        
	        	 
	           
	        }
		   
			   
		driver.findElementByAccessibilityId("Return to CrunchSDK").click();
		driver.findElementByAccessibilityId("Select task").click();
		
		
		
		
		
	}
	
	
	
	public void fromGallerytranscode() {
		
		//wait = new WebDriverWait(driver, 30);
		
		driver.findElementByName("Transcode").click();
		/*driver.findElementByAccessibilityId("Camera").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByAccessibilityId("Camera Roll").click();
		@SuppressWarnings("unchecked")
		List<WebElement> img = (List<WebElement>) driver.findElementsByClassName("XCUIElementTypeImage");
		for (int x=0; x<img.size();x++) {*/
			
		driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\"CRTranscoderTestView\"]/XCUIElementTypeButton[2]").click();
		driver.findElementByAccessibilityId("SSIM").click();
		WebElement cs = (WebElement) driver.findElementsByClassName("XCUIElementTypeSwitch").get(2);
		if(cs.getAttribute("value").equals("0")) {
			
			
			cs.click();
		}
		
		WebElement st = (WebElement) driver.findElementsByClassName("XCUIElementTypeTextField").get(1);
		st.clear();
		st.sendKeys("0.90");
		driver.findElementByAccessibilityId("Back").click();
		driver.findElementByAccessibilityId("Camera").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByAccessibilityId("Camera Roll").click();
		WebElement vid = (WebElement) driver.findElementsByClassName("XCUIElementTypeImage").get(1);
		vid.click();
		driver.findElementByAccessibilityId("Done").click();
		driver.findElementByAccessibilityId("480p").click();
		//WebDriverWait wait = new WebDriverWait(driver,100);
		//wait.until(ExpectedConditions.inv 
		driver.findElementByAccessibilityId("Export").click();
		driver.findElementByAccessibilityId("Export transcoded").click();
		WebElement dp = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"ActivityListView\"]/XCUIElementTypeOther");
		dp.click();
		
		 try {
	            wait.until(ExpectedConditions.visibilityOf(driver.findElementByAccessibilityId("Choose a Folder…")));
	            
	            WebElement tf = driver.findElementByAccessibilityId("TRANSCODED. Folder");
	       		tf.click();
	       		driver.findElementByAccessibilityId("Choose").click();
	       		//driver.findElementByAccessibilityId("Save").click();
	        }
	        catch (Exception e)
	        {
	           
	        }
		   finally {
			 
			   driver.findElementByAccessibilityId("Save").click();
		 }
	
		//if(driver.findElementByAccessibilityId("Choose a Folder…").isDisplayed()){
	
	   /* WebElement sel = driver.findElementByXPath("//XCUIElementTypeStaticText[contains(@id, 'Choose')]");
        sel.click();
   		WebElement tf = driver.findElementByAccessibilityId("TRANSCODED. Folder");
   		tf.click();
   		driver.findElementByAccessibilityId("Choose").click();
   		driver.findElementByAccessibilityId("Save").click();*/
    	    driver.findElementByAccessibilityId("Return to CrunchSDK").click();
		driver.findElementByAccessibilityId("Select task").click();
		driver.quit();
		
		
		
		
		
		
		

		
		
		
		
		
	
}
}

