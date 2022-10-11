import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.exe", "C:\\Users\\amanu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amanuttam1192.github.io/#contact");
		driver.findElement(By.id("name")).sendKeys("Ashok");
		driver.findElement(By.id("email")).sendKeys("ash.kvuc@gmail.com");
		driver.findElement(By.id("message")).sendKeys("hil hil ke nacho nacho");
		driver.findElement(By.className("primary")).click();
		driver.close();	}

}
