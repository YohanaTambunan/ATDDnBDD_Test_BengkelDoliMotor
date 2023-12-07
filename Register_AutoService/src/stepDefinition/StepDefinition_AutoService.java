package stepDefinition;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_AutoService {
	WebDriver driver;

    @Given("^open chrome and start application$")
    public void open_chrome_and_start_application() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000/login");
    }

	@When("^I enter valid email and valid username$")
	public void I_enter_valid_email_and_valid_username() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
    }

	@And("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

	@And("^I navigate to the Services menu$")
	public void I_navigate_to_the_Services_menu() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
        
        Actions actions = new Actions(driver);
        actions.moveToElement(servicesMenu).perform();
    }

	@And("^I navigate to the Services submenu$")
	public void I_navigate_to_the_Services_submenu() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
    }

	@And("^I fill in the fields with valid information$")
	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
    	TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
        driver.findElement(By.name("layanan")).sendKeys("service ban");
		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");  
    }

	@Then("^the booking is successfully done$")
	 public void the_booking_is_successfully_done() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
    }
}

//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}
//3//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}
//
//4//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//5//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//6//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//7//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//8//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//9//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//10//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//11//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//12//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//13//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//14//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//15//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//16//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//		driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//17//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//18//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//19//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//20//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//21//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//22//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//23//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//24//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//25//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//26//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//27//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//28//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//29//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}


//30//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//31//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//32//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//33//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//34//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//35//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//36//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//37//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}


//38//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//39//

//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//40//

//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//41//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//42//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//43//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//44//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//45//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//46//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//47//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}


//48//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//49//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//50//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//51//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//52//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//53//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//54//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//55//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//56//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//57//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//58//

//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//59//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//60//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//61//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//62//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//63//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//64//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service ban");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("avanza");
//        driver.findElement(By.name("tangal")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//65//

//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");  
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//66//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//67//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//68//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//69//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//70//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//71//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//72//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//73//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//74//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Sarah Tobing");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//75//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//76//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//77//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//78//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//79//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//80//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//		driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//81//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//82//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//83//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//84//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//85//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//86//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//87//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//88//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//89//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//90//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//91//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//92//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//93//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}


//94//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//95//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//96//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		  driver.findElement(By.name("nomortelepon")).sendKeys("081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//97//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		  driver.findElement(By.name("nomortelepon")).sendKeys("081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//98//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		  driver.findElement(By.name("nomortelepon")).sendKeys("081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//99//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tipemobil")).sendKeys("Rush");
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}

//100//
//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_AutoService {
//	WebDriver driver;
//
//    @Given("^open chrome and start application$")
//    public void open_chrome_and_start_application() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://127.0.0.1:8000/login");
//    }
//
//	@When("^I enter valid email and valid username$")
//	public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("sarah@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("meSARAH");
//    }
//
//	@And("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//	@And("^I navigate to the Services menu$")
//	public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//	@And("^I navigate to the Services submenu$")
//	public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[2]/a")).click();
//    }
//
//	@And("^I fill in the fields with valid information$")
//	public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("layanan")).sendKeys("service kaca mobil");
//		  driver.findElement(By.name("nomortelepon")).sendKeys(" 081312125656");
//        driver.findElement(By.name("tangal")).sendKeys("03/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/select/option[2]"));
//        dropdownOption.click();
//    }
//
//	@Then("^the booking is successfully done$")
//	 public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}





























































































































































