package SeleniumSession;

public class AmazoTest {

	public static void main(String[] args) {
		BrowserUtil brutil=new BrowserUtil();
		brutil.lauchBrowser("Chrome");
		brutil.enterurl("http://www.amazon.com");
		String title = brutil.getTitle();
		if (title.contains("amazo")) {
			System.out.println("correct title");
		}
		brutil.getAppCurrenturl();

	}

}
