package Selenium.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchTest {


    public WebDriver driver;
    public SearchTest( WebDriver driver){
        this.driver = driver;
    }
    public String FB_004_001() throws InterruptedException {
        // Connect driver and open the browser
        driver.get("https://www.vietnamworks.com/");
        driver.manage().window().maximize();

        // Action
        WebElement inputElement = driver.findElement(By.id("search-bar-input"));
        inputElement.clear();
        inputElement.sendKeys("IT");
        driver.findElement(By.cssSelector(".button.searchBar__button")).click();
        Thread.sleep(2000);

        // Check test case
        String checkMessage = driver.getTitle();
        if(checkMessage.equalsIgnoreCase("Tuyển dụng việc làm it mới nhất | Vietnamworks")) {
            return "Passed FB_004_001\n";
        }
        else {
            return "Failed FB_004_001\n";
        }
    }

    // abcxyz
    public String FB_004_002() throws InterruptedException {
        // Connect driver and open the browser
        driver.get("https://www.vietnamworks.com/");
        driver.manage().window().maximize();

        // Action
        WebElement inputElement = driver.findElement(By.id("search-bar-input"));
        inputElement.clear();
        inputElement.sendKeys("abcxyz");
        driver.findElement(By.cssSelector(".button.searchBar__button")).click();
        Thread.sleep(2000);

        // Check test case
        String checkMessage = driver.getTitle();
        System.out.println(checkMessage);
        if(checkMessage.equalsIgnoreCase("Tuyển dụng việc làm abcxyz mới nhất | Vietnamworks")) {
            return "Passed FB_004_002\n";
        }
        else {
            return "Failed FB_004_002\n";
        }

    }

    // #____11223
    public String FB_004_003() throws InterruptedException {
        // Connect driver and open the browser

        driver.get("https://www.vietnamworks.com/");
        driver.manage().window().maximize();

        // Action
        WebElement inputElement = driver.findElement(By.id("search-bar-input"));
        inputElement.clear();
        inputElement.sendKeys("#____11223");
        driver.findElement(By.cssSelector(".button.searchBar__button")).click();
        Thread.sleep(2000);

        // Check test case
        String emptyMessage = driver.findElement(By.cssSelector(".title:nth-child(2)")).getText();
        if(emptyMessage.equalsIgnoreCase("Hiện chưa có công việc nào theo tiêu chí bạn tìm")) {
            return "Passed FB_004_003\n";
        }
        else {
            return "Failed FB_004_003\n";
        }

    }

    // Sequences of whitespace characters
    public String FB_004_004() throws InterruptedException {
        // Connect driver and open the browser

        driver.get("https://www.vietnamworks.com/");
        driver.manage().window().maximize();

        // Action
        WebElement inputElement = driver.findElement(By.id("search-bar-input"));
        inputElement.clear();
        inputElement.sendKeys("         ");
        driver.findElement(By.cssSelector(".button.searchBar__button")).click();
        Thread.sleep(2000);

        // Check test case
        String emptyMessage = driver.findElement(By.cssSelector(".title:nth-child(2)")).getText();
        if(emptyMessage.equalsIgnoreCase("Hiện chưa có công việc nào theo tiêu chí bạn tìm")) {
            return "Passed FB_004_004\n";
        }
        else {
            return "Failed FB_004_004\n";
        }


    }

    // Empty string
    public String FB_004_005() throws InterruptedException {
        // Connect driver and open the browser

        driver.get("https://www.vietnamworks.com/");
        driver.manage().window().maximize();

        // Action
        WebElement inputElement = driver.findElement(By.id("search-bar-input"));
        inputElement.clear();
        inputElement.sendKeys("");
        driver.findElement(By.cssSelector(".button.searchBar__button")).click();
        Thread.sleep(2000);

        // Check test case
        String emptyMessage = driver.getTitle();
        if(emptyMessage.equalsIgnoreCase("Tuyển dụng tìm việc làm lương cao mới nhất | Vietnamworks")) {
            return "Passed FB_004_005\n";
        }
        else {
            return "Failed FB_004_005\n";
        }


    }

    // a
    public String FB_004_006() throws InterruptedException {
        // Connect driver and open the browser

        driver.get("https://www.vietnamworks.com/");
        driver.manage().window().maximize();

        // Action
        WebElement inputElement = driver.findElement(By.id("search-bar-input"));
        inputElement.clear();
        inputElement.sendKeys("a");
        driver.findElement(By.cssSelector(".button.searchBar__button")).click();
        Thread.sleep(2000);

        // Check test case
        String checkMessage = driver.getTitle();
        if(checkMessage.equalsIgnoreCase("Tuyển dụng việc làm a mới nhất | Vietnamworks")) {
            return "Passed FB_004_006\n";
        }
        else {
            return "Failed FB_004_006\n";
        }
    }


}
