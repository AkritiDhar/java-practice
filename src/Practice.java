import org.openqa.selenium.chrome.ChromeDriver;



public class Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	}

}
