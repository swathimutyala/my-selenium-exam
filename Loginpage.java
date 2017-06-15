package Googleupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {


	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser");
		driver.manage().window().maximize();
		
Thread.sleep(5000);
	
		driver.findElement(By.id("identifierId")).sendKeys("swathimutyala72@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();
		
		driver.findElement(By.name("password")).sendKeys("swathi@772");
		Thread.sleep(5000);
		driver.findElement(By.id("passwordNext")).click();

		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


		driver.findElement(By.xpath("//*[contains(text(),'COMPOSE')]")).click();

		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		//*[contains(text(),'COMPOSE')
		
		StringSelection ss=new StringSelection("C:\\Users\\swath\\Downloads\\Selenium");
		

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		Robot robot = new Robot();
		/*robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

		}
		
	}

