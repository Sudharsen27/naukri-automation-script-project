package automationprojectFLIPKART;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriProject {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, Exception {
		WebDriver d=new FirefoxDriver();
		Actions a=new Actions(d);
		d.get("https://www.naukri.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		d.findElement(By.id("login_Layer")).click();
		d.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("sundarlingam272000@gmail.com");
		d.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Sundar@27");
		d.findElement(By.xpath("//button[text()='Login']")).click();
		d.findElement(By.xpath("//a[text()='View']")).click();
		WebElement findElement = d.findElement(By.xpath("//img[@class='user-img']"));
		a.moveToElement(findElement).click().perform();
		Thread.sleep(4000);
		WebElement element = d.findElement(By.xpath("//input[@id='fileUpload']"));
		a.moveToElement(element).click().perform();
		
		StringSelection sc=new StringSelection("C:\\Users\\Sundar\\Desktop\\SUNDARALINGAM.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		
		
		// to perform file and photo uploading
		Robot r=new Robot();
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		a.scrollByAmount(0, 1000).perform();
		Thread.sleep(3000);
		WebElement findElement2 = d.findElement(By.id("submit"));
		a.moveToElement(findElement2).click().perform();
		
	}
	public static void completProfile() {
		
	}

}
