package SeleniumSession;

public class WaitTypes {

	public static void main(String[] args) {
		
		//synchornisation in Selenium
		//two types of waits
		//1.Static Wait- means you need to hold/pause the script for no of seconds  --Thread.sleep(3000)
		//2.Dynamic Wait--
		//2.a.Implicitly Wait
		//2.b.Explicitly Wait
		//2.b.1:-WebDriverWait
		//2.b.2:-FluentWait
		
		//Wait(I)--implemented by  one class is called FluentWait(C) and it is extended by WebDriverWait(C)
		//Wait(I)<-----FluentWait(C)<------WebDiverWait(C)
		//ele---------->2 sec,5 sec,10 sec
		//dynamic wait for 10 sec(max timeout)
		//2 sec element is appeared rest of 8 sec will be ignored
		//5 sec--5sec ignored
		//0 sec--10 sec ignored
		//11 sec--we waited till 10 sec then selenium will throw a exception NoSuchElementException		
		
	}

}
