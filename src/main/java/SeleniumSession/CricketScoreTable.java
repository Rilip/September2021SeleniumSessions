package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreTable {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/west-indies-v-india-t20i-series-2022-1317887/india-vs-west-indies-5th-t20i-1317907/full-scorecard");

	}

	public static void getWicketTakerName(String playername) {
		
	}
}
