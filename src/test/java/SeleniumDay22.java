import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumDay22 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();



        // 1. name
        //driver.findElement(By.name("search")).sendKeys("Mac");

        // 2. ID
        //boolean logoDisplayStatus =  driver.findElement(By.id("logo")).isDisplayed();
        //System.out.println(logoDisplayStatus);

        // 3. LinkText and PartialLinkText
        //driver.findElement(By.linkText("Tablets")).click();


        // Finding elements not only specific single element ->
        // ClassName and TagName

        // 4. ClassName
        List <WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        System.out.println("Total number of header links: " + headerLinks.size());

        // 5. TagName
        List <WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images: " + images.size());

        driver.close();
    }

}
