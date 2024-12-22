import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay21 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        // Validate title should be "Your Store"
        String act_title = driver.getTitle();
        System.out.println(act_title);

        if (act_title.equalsIgnoreCase("Your Store")){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }

        // close the browser
        driver.close();
    }
}
