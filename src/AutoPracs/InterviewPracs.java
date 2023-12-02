package AutoPracs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InterviewPracs {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sonya\\OneDrive\\Desktop\\Sonya_Study\\chromedriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  System.out.println("\n Title of page : "+title);
	  // Get String
	  Thread.sleep(5000);
	  String text=driver.findElement(By.xpath("//div[@class='a-cardui gw-sign-in']/div/h2/span/span[1]")).getText();
	  System.out.println(text);
	  
	  System.out.println("\n Font Size :"+ driver.findElement(By.xpath("//div[@class='a-cardui gw-sign-in']/div/h2/span/span[1]")).getCssValue("font-size"));
	  
	  
	  
	  driver.close();
  }
}
