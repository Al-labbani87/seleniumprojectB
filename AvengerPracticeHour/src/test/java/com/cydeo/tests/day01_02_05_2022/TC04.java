package com.cydeo.tests.day01_02_05_2022;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04 {
    private static WebDriver driver;
    public static void main(String[] args) {


        //- Go to "https://app.vytrack.com/user/login"
        forEachVerification("https://app.vytrack.com/user/login");
        //- Verify the url contains "vytrack"
      //  verifyingURLContains()


        String expectedWord= "vytrack";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(expectedWord)){
            System.out.println("URL is PASSED");
        }else {
            System.out.println("URL is FAILED");
        }

        //- Verify the title contains "Login"


        //- Verify the label "Login"

        //login


        //- Verify the message "Invalid user name or password"

    }
    private static void forEachVerification(String url){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }
}
