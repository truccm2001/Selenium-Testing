import Selenium.TestCase.ApplyTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileWriter;
import java.io.IOException;

import Selenium.TestCase.SearchTest;

public class Chrome {

    public FileWriter myWriter;
    public Chrome(FileWriter myWriter){
        this.myWriter = myWriter;
    }

    public void check() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome 100.0.4896.20\\chromedriver.exe");
        WebDriver chromedriver = new ChromeDriver();
        SearchTest TestCases = new SearchTest(chromedriver);

        this.myWriter.write(TestCases.FB_004_001());
        this.myWriter.write(TestCases.FB_004_002());
        this.myWriter.write(TestCases.FB_004_003());
        this.myWriter.write(TestCases.FB_004_004());
        this.myWriter.write(TestCases.FB_004_005());
        this.myWriter.write(TestCases.FB_004_006());
        chromedriver.close();
        //Write test to check bellow here

    }

}
