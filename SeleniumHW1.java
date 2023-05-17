package SeleniumHomework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW1 {
    /*navigate to
     https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
Note: use name or id as locators
*/
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("  https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer first name")).sendKeys("Ramona");
        driver.findElement(By.id("customer last name")).sendKeys(("Alexandra"));
        driver.findElement(By.id("customer.address.street")).sendKeys("Las Olas blvd");
        driver.findElement(By.id("customer.address.city")).sendKeys("Fort Lauderdale");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipcode")).sendKeys("33332");
        driver.findElement(By.id("customer phone number")).sendKeys("1234567890");
        driver.findElement(By.id("customer SSN")).sendKeys(("7912901234"));
        driver.findElement(By.id("customer.username")).sendKeys("RamoRamo");
        driver.findElement(By.id("customer.password")).sendKeys(("123456pass"));
        driver.findElement(By.id("customer.confirmPassword")).sendKeys("123456pass");
        Thread.sleep(5000);
        driver.quit();





    }

}
