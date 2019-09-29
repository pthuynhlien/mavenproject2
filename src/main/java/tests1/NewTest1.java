package tests1;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class NewTest1 {
 
 public WebDriver driver;
 
  @Test
  public void openMyBlog() {
 driver.get("https://www.youtube.com/");
  }
  
  @BeforeClass
  public void beforeClass() {
   
   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
   driver = new ChromeDriver();
   
  }
 
  @AfterClass
  public void afterClass() {
   driver.quit();
  }
 
}