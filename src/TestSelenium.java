//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import Selenium.TestCase.ApplyTest;
import java.util.Scanner; // Import the Scanner class to read text files

public class TestSelenium {
    public static void main(String[] args) throws InterruptedException, IOException {
         File myObj = new File("results.txt");
         if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File will be overrided");
        }
        FileWriter myWriter = new FileWriter("results.txt",false);

        //==== Test here ====

        myWriter.write("\n==============Testing in Chrome ===============\n");

       Chrome ChromeTesting = new Chrome(myWriter);
       ChromeTesting.check();



        myWriter.close();
    }
}