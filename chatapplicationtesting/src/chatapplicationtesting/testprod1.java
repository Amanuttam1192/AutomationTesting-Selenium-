import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.exe", "C:\\Users\\amanu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		for(int i=0;i<5;i++) {
		driver.get("http://amitatstarship6261.com/");
		driver.findElement(By.id("name")).sendKeys("SeleniumTesing(Aman)");
		WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/form/div[2]/input"));
		chooseFile.sendKeys("C:\\Users\\amanu\\Downloads\\testing123.jpeg");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/form/button")).click();
		}
			}
			/*dependencies used
			 * <dependencies> <!--
			 * https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
			 * <dependency> <groupId>org.seleniumhq.selenium</groupId>
			 * <artifactId>selenium-java</artifactId> <version>4.4.0</version> </dependency>
			 * 
			 * <!-- https://mvnrepository.com/artifact/org.testng/testng --> <dependency>
			 * <groupId>org.testng</groupId> <artifactId>testng</artifactId>
			 * <version>7.6.1</version> <scope>test</scope> </dependency>
			 * 
			 * </dependencies>
			 * <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>chatapplicationtesting</groupId>
  <artifactId>chatapplicationtesting</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies>
  <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.4.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.6.1</version>
    <scope>test</scope>
</dependency>

</dependencies>
  <build>
    <sourceDirectory>src</sourceDirectory>
    <plugins>
      <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
          <release>17</release>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
			 */

}
