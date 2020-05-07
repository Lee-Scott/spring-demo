package seleniumTest2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class SCPlayBot {
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
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);



        int x = 0;
        int waitT = 1000;



        while(x < 50){
            Thread.sleep(waitT);
            WebDriver driver = new ChromeDriver();
            Thread.sleep(waitT);
            driver.get("https://soundcloud.com/leesan-music/sets/new-sounds");
            Thread.sleep(10000);

            if(x == 0){
                while(!driver.findElement(By.linkText("Play")).isDisplayed()){}
                driver.findElement(By.linkText("Play")).click();
            }

            Thread.sleep(waitT);
            driver.findElement(By.cssSelector("html")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            driver.findElement(By.cssSelector(".playControls__next")).click();
            Thread.sleep(waitT);
            System.out.println("----------------");
            System.out.println("*** X: " + x + " ***");
            System.out.println("----------------");

            x++;
            Thread.sleep(waitT);
            driver.quit();
            Thread.sleep(waitT);
        }




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

    private static void firstRun(int x, int waitT) throws InterruptedException {
        Thread.sleep(waitT);
        WebDriver driver = new ChromeDriver();
        Thread.sleep(waitT);
        driver.get("https://soundcloud.com/leesan-music/sets/new-sounds");
        Thread.sleep(10000);
        while(!driver.findElement(By.linkText("Play")).isDisplayed()){}
        driver.findElement(By.linkText("Play")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector("html")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        driver.findElement(By.cssSelector(".playControls__next")).click();
        Thread.sleep(waitT);
        x++;
        Thread.sleep(waitT);
        driver.quit();
        Thread.sleep(waitT);
    }


}










