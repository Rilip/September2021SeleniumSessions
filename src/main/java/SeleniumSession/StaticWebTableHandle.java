package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {
static WebDriver driver;
	public static void main(String[] args) {
		
		//table[@id="customers"]  
		//*[@id="customers"]
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		//table[@id="customers"]/tbody/tr[7]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		
		String beforexpath_comp="//table[@id=\"customers\"]/tbody/tr[";
		String afterxpath_comp="]/td[1]";
		
//		int rowcount = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
//		for(int i=2;i<=7;i++) {
//			String compxpath=beforexpath_comp+i+afterxpath_comp;
//			//System.out.println(compxpath);
//	        String compname = driver.findElement(By.xpath(compxpath)).getText();
//	        System.out.println(compname);
//		}
//		 
		//table[@id="customers"]/tbody/tr[2]/td[2]
		//table[@id="customers"]/tbody/tr[3]/td[2]
//		String beforexpath1 = "//table[@id=\"customers\"]/tbody/tr[";
//		String afterxpath1 = "]/td[2]";
//		for(int i=2;i<7;i++) {
//			String contact = beforexpath1+afterxpath1;
//			String conta = driver.findElement(By.xpath(contact)).getText();
//			System.out.println(conta);
//		}
		By row =By.xpath("//table[@id=\\\"customers\\\"]/tbody/tr");
		By col=By.xpath("By.xpath(\"//table[@id=\\\"customers\\\"]/tbody/tr[1]/th");
		String beforexpath="//table[@id=\\\"customers\\\"]/tbody/tr[";
		String afterxpath="]/td[";
		pritTable(row, col,beforexpath,afterxpath);
	}
	public static void pritTable(By rowlocator,By collocator,String beforexpath,String afterxpath ) {
//		int rowcount = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
//		int colcount=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th")).size();
		
		int rowcount =driver.findElements(rowlocator).size();
		int colcount=driver.findElements(collocator).size();
		
		for(int row=2;row<=rowcount;row++) {
		for(int col=1;col<=colcount;col++) {
			//String xpath="//table[@id=\"customers\"]/tbody/tr["+row+"]/td["+col+"]";
			String xpath=beforexpath+row+afterxpath+col+"]";
			String text = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(text);
		}
		System.out.println();
		}
	}

}
/*//table[@id="customers"]/tbody/tr[2]/td[1]
//table[@id="customers"]/tbody/tr[3]/td[1]
//table[@id="customers"]/tbody/tr[4]/td[1]
//table[@id="customers"]/tbody/tr[5]/td[1]
//table[@id="customers"]/tbody/tr[6]/td[1]
//table[@id="customers"]/tbody/tr[7]/td[1]*/

/*Alfreds Futterkiste
Centro comercial Moctezuma
Ernst Handel
Island Trading
Laughing Bacchus Winecellars
Magazzini Alimentari Riuniti*/