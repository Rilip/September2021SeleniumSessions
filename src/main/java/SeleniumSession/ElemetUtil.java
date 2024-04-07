package SeleniumSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElemetUtil {
	
private  WebDriver driver;  //default value driver is poiting to null when we call we will get NPE
//to get driver got initialization ,needs  constructor 
private WebDriverWait wait;

public ElemetUtil(WebDriver driver) {  ///same driver we need to give private WebDriver driver so you needs this keyword
	this.driver=driver;  //when we create Eleutill object ,Eleutill constructor will be called
	// wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));   //wait is defined globally because it take for all elements will be 10 so we not defined globally
}
public  By  getBy(String locatorType,String loctorValue) {
	By locator =null;  //Initially it is pointing to null
	
	switch (locatorType.toLowerCase()) {
	case "id":
		 locator = By.id(loctorValue);
		break;
	case "name":
		 locator = By.name(loctorValue);
		break;
	case "className":
		 locator = By.className(loctorValue);
		break;
	case "xpath":
		 locator = By.xpath(loctorValue);
		break;
	case "cssSelector":
		 locator = By.cssSelector(loctorValue);
		break;
	case "LinkText":
		 locator = By.linkText(loctorValue);
		break;
	default:
		System.out.println("please pass the right locator type and value....");
		break;
	}
	return locator;
}

public  WebElement getElement(By locator) {
	return driver.findElement(locator);
}
public  WebElement getElement(By locator,int timeout) {
	return doPresenceofElementLocated(locator, timeout);
}
public  List<WebElement> getElements(By locator) {
	return driver.findElements(locator);
}

public  WebElement getElement(String locatorType, String locatorvalue) {
	return driver.findElement(getBy( locatorType, locatorvalue));
}
public  void doSendKeys(By locator,String value) { //without wait  method overlading
	getElement(locator).sendKeys(value);  //for webelement we can directly apply send keys method
}
public  void doSendKeys(String locatortype,String locatorvalue,String value) {  //without wait
	getElement(locatortype, locatorvalue).sendKeys(value);
}
public  void doSendKeys(By locator,String value,int timeout) {  //with wait
	doPresenceofElementLocated(locator, timeout).sendKeys(value);
}
public  void doClick(By locator) {
	getElement(locator).click();
}
public  void doClick(String locatorType,String locatorvalue) {
	getElement(locatorType, locatorvalue).click();
}
public  void doClick(By locator,int timeout) {
	doPresenceofElementLocated(locator, timeout).click();
}
public  String doGetText(By locator) {  //this method is used to call text
	return getElement(locator).getText();
}

public  String getAttributeValue(By locator,String attrname) {  //this method is used to call attribute 
	String attrval = getElement(locator).getAttribute(attrname);
	System.out.println(attrval);
	return attrval;
}

	//in Element Util class we dont use static keyword
public  boolean doIsDisplayed(By locator) {
	return getElement(locator).isDisplayed();
}

public  boolean isElementExist(By locator) {
	//int elementcout = driver.findElements(locator).size();	
//	int elementcout = getElements(locator).size();
	int elementcout = getElemetsCout(locator);
	System.out.println("total element count is :"+elementcout);
	if (elementcout >=1) {
		System.out.println("element found is:"+locator);
		return true;
	}
	else {
		System.out.println("element is not found :"+locator);
		return false;
	}
	}

public  List<String> getElementsTextList(By locator) {
	List<WebElement> elelist = getElements(locator);
	List<String>eletextlist=new ArrayList<String>();  //blank list we created
	
	for (WebElement e : elelist) {
		String eleText = e.getText();
		//if (!e.getText().isEmpty()) {
		if(!eleText.isEmpty()) {
			eletextlist.add(eleText);
		}
	}
	return eletextlist;
}
public  int getElemetsCout(By locator) {
	return getElements(locator).size();
}
//to printing also creating generic method
public  void printElementValues(List<String> ellist) {
	for (String e : ellist) {
	System.out.println(e);	
	}
}
public  List<String> getAttributeList(By locator,String AttributeName) {
	List<WebElement> elelist = getElements(locator);
	List<String>attrlist=new ArrayList<String>();  //blank list
	
	for (WebElement e : elelist) {
		String attributevalue = e.getAttribute(AttributeName);
		//test driven approach
		attrlist.add(attributevalue);
	}
	return attrlist;
}

/******************DropDown Utils*************************************/

public  void doDropDownSelectByIndex(By locator,int index) {
	Select select=new Select(getElement(locator));
	select.selectByIndex(index);
}
public  void doSelectDropDownSelectByValue(By locator,String value) {
	Select select=new Select(getElement(locator));
	select.selectByValue(value);
}
public  void doSelectDropDownSelectByvisibletext(By locator,String text) {
	Select select=new Select(getElement(locator));
	select.selectByValue(text);
}

public  void doSelectDropdownValue(By locator,String value) {
    Select select=new Select(getElement(locator));
	List<WebElement> optionList = select.getOptions();
	for (WebElement e : optionList) {
		String text = e.getText();
		System.out.println(text);
		//if (text.equals("India")) {
		if (text.equals(value)) {
			e.click();
			break;
		 }
	  }
	
   }
public  void selectdropdownvaluewithoutselect(By locator ,String value) {
	//List<WebElement> countrylist = driver.findElements(locator);  //xpath will starts "//"
	List<WebElement> optionList = getElements(locator);
	System.out.println(optionList.size());
	
	for (WebElement e : optionList) {
		String text = e.getText();
		if (text.equals(value)) {
			e.click();
			break;
		}
	}
}
/******************************LinksUtil***************8*/
public  List<String> getLikTextList(By locator) {
	//List<WebElement> linklist =driver.findElements(locator);
	List<WebElement> linklist =getElements(locator);
	List<String> linktextlist=new ArrayList<String>();
	System.out.println(linklist.size());
	
	for (WebElement e : linklist) {
		String text = e.getText().trim();
		linktextlist.add(text);
		}
	return linktextlist;
}
public  void clickonelementFromSection(By locator,String linktext) {
	//List<WebElement> langlist =driver.findElements(locator);
	List<WebElement> langlist =getElements(locator);
	System.out.println(langlist.size());
	
	for (WebElement e : langlist) {
		String text = e.getText().trim();
		System.out.println(text);
		if (text.equals(linktext)) {
			e.click();
			break;
		}
	}
}
/*************WebTableUtility*************/
	public  void pritTable(By rowlocator,By collocator,String beforexpath,String afterxpath ) {
//		int rowcount = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
//		int colcount=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th")).size();
		
		int rowcount =getElements(rowlocator).size();
		int colcount=getElements(collocator).size();
		
		for(int row=2;row<=rowcount;row++) {
		for(int col=1;col<=colcount;col++) {
			//String xpath="//table[@id=\"customers\"]/tbody/tr["+row+"]/td["+col+"]";
			String xpath=beforexpath+row+afterxpath+col+"]";
			String text = doGetText(By.xpath(xpath));
			System.out.println(text);
		}
		System.out.println();
		}
  }
	
	/************Actions Util*****************/
	
	public  void doMoveToElement(By locator) {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
	}
	public  void doClickOnChildMenuLocator(By parentMenuLoctor,By childMenuLocator) throws InterruptedException {
		doMoveToElement(parentMenuLoctor);
		Thread.sleep(3000);
		doClick(childMenuLocator);
	}
	public  void doActionSendKeys(By locator,String value) {
		 Actions act=new Actions(driver);
		 act.sendKeys(getElement(locator), value).build().perform();
	}
	public  void doActionSendKeysOnActiveElement(By locator,String value) {
		 Actions act=new Actions(driver);
		 act.click(getElement(locator)).sendKeys(value).build().perform();
	}
	public  void doactionsclick(By locator) {
		 Actions act=new Actions(driver);
		 act.click(getElement(locator)).build().perform();
	}
	public  void doActionMovetoElementClick(By locator) {
		 Actions act=new Actions(driver);
		 act.moveToElement(getElement(locator)).click().build().perform();
	}
	/**************WaitUtils*************/
	
	public  WebElement doPresenceofElementLocated(By locator ,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout)); 
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public  WebElement doPresenceofElementLocated(By locator ,int timeout,long intervaltime) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime)); 
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public  WebElement isElementVisible(By locator ,int timeout,long intervaltime) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime)); 
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public  WebElement WaitForElementToBeVisibleWithWebElement(By locator ,int timeout,long intervaltime) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime)); 
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	public  List<WebElement> WaitForElementsToBeVisible(By locator ,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout)); 
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public  List<WebElement> WaitForElementsToBeVisible(By locator ,int timeout,long intervaltime) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime)); 
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public  List<String> getElementTextList(By locator,int timeout) {
		List<WebElement> elementlist = WaitForElementsToBeVisible(locator, timeout);
		List<String> elementtextlist=new ArrayList<String>();
		for (WebElement e : elementlist) {
			String text = e.getText();
			elementtextlist.add(text);
		}
		return elementtextlist;
	}
	
	/***************wait utils for Non-WebEalemets**********/
	public  boolean waitforURLToContain(String urlFraction,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlContains(urlFraction));
	}
	public  boolean waitforURLToBe(String url,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlToBe(url));
	}
	public  String doGetTitlewithfraction(String titlefraction,int timeout) {
		if (waitForTitleContains(titlefraction,timeout)) {
			return driver.getTitle();
		}	
		return null;
		}
		public  String doGetTitle(String title,int timeout) {
			if (waitForTitleToBe(title,timeout)) {
				return driver.getTitle();
			}	
			return null;
			}
		public  boolean waitForTitleContains(String titlefractio,int timeout) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.titleContains(titlefractio));
		}
		
		public  boolean waitForTitleToBe(String title,int timeout) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.titleIs(title));
		}
/********Alert****/
		public  Alert waitForAlert(int timeout) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.alertIsPresent());
		}
		public  String getAlertText(int timeout ) {
			return waitForAlert(timeout).getText();
		}
		public  void doAlertAccept(int timeout ) {
			 waitForAlert(timeout).getText();
		}
		public  void getAlertdismiss(int timeout ) {
			 waitForAlert(timeout).getText();
		}
		public  void enterAlertText(String text,int timeout ) {
			 waitForAlert(timeout).sendKeys(text);
		}
		public  void waitforFrameByNameOrId(String NameOID,int TimeOut) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(NameOID));
		}
		public  void waitforFrameByIdex(int frameindex,int TimeOut) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
		}
		public  void waitforFrameByLocator(By framelocator,int TimeOut) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
		}
		public  void waitforFrameElement(WebElement frameelement,int TimeOut) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameelement));
		}
		
		public  void clickElemetWhenReady(By locator,int timeout) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();	
		}
		public  void clickElemetWhenReady(By locator,int timeout,long intervaltime) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime)); 
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();	
		}
		public  WebElement waitForElemetPresetUsingFluentwait(By locator,int timeout,int polligtime) {
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery(Duration.ofSeconds(polligtime))
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.withMessage(ErrorClass.ELEMENT_NOT_FOUND_ERROR_MSG);
			
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		public  WebElement waitForElementusingWebDriverWait(By locator,int timeout,int polligtime) {
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
			//wait.until(ExpectedConditions.presenceOfElementLocated(locator))
			 wait.withTimeout(Duration.ofSeconds(timeout))
			.pollingEvery(Duration.ofSeconds(polligtime))
			.ignoring(NoSuchElementException.class)
			.ignoring(StaleElementReferenceException.class)
			.withMessage(ErrorClass.ELEMENT_NOT_FOUND_ERROR_MSG);
			
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}

	
}
