import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver drv = new FirefoxDriver();
		drv.get("http://localhost:100");
		drv.findElement(By.name("user_name")).sendKeys("admin");
		drv.findElement(By.name("user_password")).sendKeys("admin");
		Thread.sleep(10000);
		drv.findElement(By.name("Login")).click();
		System.out.println("Hello");
	}

}
