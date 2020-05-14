

import java.io.File;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Mixcloud {
	/*

 	@arthor Lee Scott

 	This is a simple selenium webdriver that goes to Wikipedia and searches for "Software"
 	must download Selenium: http://docs.seleniumhq.org/download/

	*/


    public static void main(String[] args) throws InterruptedException {


        //Path to wedriver for chrome must be downloaded
        //https://sites.google.com/a/chromium.org/chromedriver/downloads
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lhs49\\OneDrive\\Documents\\chromedriver.exe");

        //Instantiate the webDriver
        WebDriver driver = new ChromeDriver();

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        //WebDriver driver2 = new ChromeDriver();
        //WebDriver driver3 = new ChromeDriver();

        //WebDriver driver4 = new ChromeDriver();
			/*
			WebDriver driver5 = new ChromeDriver();
			WebDriver driver6 = new ChromeDriver();
			WebDriver driver7 = new ChromeDriver();
			WebDriver driver8 = new ChromeDriver();
			WebDriver driver9 = new ChromeDriver();
			WebDriver driver10 = new ChromeDriver();
			*/



        //go to a certain web site

        driver.get("https://www.mixcloud.com/LeeSan/510-open-house-stream/");
        //driver2.get("https://www.mixcloud.com/LeeSan/32520-dubstep-into-128bpm-second-mix-of-the-night/");
        //driver3.get("https://www.mixcloud.com/LeeSan/43-momobathon-rap-trap/");
        //driver4.get("https://www.mixcloud.com/LeeSan/43-trance-into-future-bass-into-trance/");
        //driver5.get("https://www.mixcloud.com/LeeSan/uk-big-room-mainstage-festival-mix-9-20/");
			/*
			driver6.get("https://www.mixcloud.com/LeeSan/925-open-pop-big-room-rnb-rap-mix/");
			driver7.get("https://www.mixcloud.com/LeeSan/9-26-liquid-dnb-mix/");
			driver8.get("https://www.mixcloud.com/LeeSan/psytrance/");
			driver9.get("https://www.mixcloud.com/LeeSan/open-2000s-popish/");
			driver10.get("https://www.mixcloud.com/LeeSan/pop-edm-mix-9-30-19/");
			*/



        int x = 0;

        while(x < 200){
            System.out.println("X : " + x );
            Thread.sleep(10000);
            driver.navigate().refresh();
            Thread.sleep(5000);
            //driver2.navigate().refresh();
            Thread.sleep(5000);

            Thread.sleep(5000);
            //driver3.navigate().refresh();
            Thread.sleep(5000);

            //driver4.navigate().refresh();
				/*
				Thread.sleep(5000);
				driver5.navigate().refresh();
				Thread.sleep(5000);
				driver6.navigate().refresh();
				Thread.sleep(5000);
				driver7.navigate().refresh();
				Thread.sleep(5000);
				driver8.navigate().refresh();
				Thread.sleep(5000);
				driver9.navigate().refresh();
				Thread.sleep(5000);
				driver10.navigate().refresh();
				*/

            Thread.sleep(520000);

            x++;
        }

        driver.quit();


        //maximize the window
        //driver.manage().window().maximize();

        //WebElement link;

        //Element can be found by inspecting on chrome
        //link = driver.findElement(By.id("play-button play-button-cloudcast"));
        //Thread.sleep(5000);
        //link.click();
        //Thread.sleep(5000);

        //Thread.sleep(5000);
        //WebElement searchBox;
        //searchBox = driver.findElement(By.id("searchInput"));

        //type out software into the search bar
        //searchBox.sendKeys("Software");
        //Thread.sleep(10000);
        //link = driver.findElement(By.id("searchButton"));
        //link.click();

        //Copy the body of the webpage
        //String bodyText = driver.findElement(By.id("bodyContent")).getText();

        //System.out.println(bodyText);


    }


}










