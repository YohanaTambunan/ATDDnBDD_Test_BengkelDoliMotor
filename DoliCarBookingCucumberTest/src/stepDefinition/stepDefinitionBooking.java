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

////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//1
//public class stepDefinitionBooking {
//    WebDriver driver;
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
//    @When("^I enter valid email and valid username$")
//    public void I_enter_valid_email_and_valid_username() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//    }
//
//    @And("^I can login successfully$")
//    public void I_can_login_successfully() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }
//
//    @And("^I navigate to the Services menu$")
//    public void I_navigate_to_the_Services_menu() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(servicesMenu).perform();
//    }
//
//    @And("^I navigate to the Services submenu$")
//    public void I_navigate_to_the_Services_submenu() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//    }
//
//    @And("^I navigate to the Booking page from Car Rental$")
//    public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//    }
//
//    @And("^I fill in the fields with valid information$")
//    public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//    	TimeUnit.SECONDS.sleep(2);
//        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//        driver.findElement(By.name("alamat")).sendKeys("Porsea");
//        driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//        driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//        driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//        dropdownElement.click();
//        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//        dropdownOption.click();
//    }
//
//    @Then("^the booking is successfully done$")
//    public void the_booking_is_successfully_done() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//    }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////2
public class stepDefinitionBooking {
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
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
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
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
    }

    @And("^I navigate to the Booking page from Car Rental$")
    public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
    }

    @And("^I fill in the fields with valid information$")
    public void I_fill_in_the_fields_with_valid_information() throws Throwable {
    	TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
        driver.findElement(By.name("alamat")).sendKeys("Porsea");
        driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
        driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
        driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
    }

    @Then("^the booking is successfully done$")
    public void the_booking_is_successfully_done() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
    }
}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////3
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//      driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////4
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//      driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////5
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////6
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////7
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////8
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////9
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////10
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////11
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////12
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////13
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////14
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////15
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////16
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////17
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////18
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////19
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////20
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////21
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////22
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan")]
//      driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////23
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Nani");
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("nomortelepon")).sendKeys("082468263946");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////24
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Alberto");
//    driver.findElement(By.name("nomortelepon")).sendKeys("0813623423");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////25
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Tadisa");
//    driver.findElement(By.name("nomortelepon")).sendKeys("08137692583");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////26
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Youna");
//    driver.findElement(By.name("nomortelepon")).sendKeys("08136837453793");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////27
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Hanni");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361482476");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////28
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Sarah");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////29
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("safaty");
//    driver.findElement(By.name("tanggalrental")).sendKeys("12/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("22/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////30
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Krisna");
//    driver.findElement(By.name("tanggalrental")).sendKeys("30/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/06/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////31
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//      driver.findElement(By.name("tanggalrental")).sendKeys("22/07/2023");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/08/2023");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////32
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Pandi Tambunan");
//      driver.findElement(By.name("tanggalrental")).sendKeys("09/05/2023");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////33
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Winata Saragi");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////34
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Gabrielle");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/09/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////35
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Hazael");
//    driver.findElement(By.name("tanggalrental")).sendKeys("27/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////36
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Manda");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/06/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////37
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Aurelia");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/01/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////38
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Esteria");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/02/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////39
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Mariana");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/04/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////40
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Emilia");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////41
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Sonia");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////42
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Maryono");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////43
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Sandoreo");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////44
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////45
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////46
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Paris");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361057836");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/07/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////47
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Nigeria");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361056284");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/09/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("01/10/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////48
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Balige");
//    driver.findElement(By.name("nomortelepon")).sendKeys("0813654476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("03/04/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////49
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Polonia");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081388854476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/012/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////50
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Laguboti");
//    driver.findElement(By.name("nomortelepon")).sendKeys("08136168486");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/11/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////51
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("alamat")).sendKeys("California");
//      driver.findElement(By.name("nomortelepon")).sendKeys("0812748054476");
//      driver.findElement(By.name("tanggalrental")).sendKeys("02/08/2023");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////52
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Messy");
//      driver.findElement(By.name("alamat")).sendKeys("Pangkailan");
//      driver.findElement(By.name("nomortelepon")).sendKeys("081361019376");
//      driver.findElement(By.name("tanggalrental")).sendKeys("04/06/2023");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/07/2023");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////53
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Citra");
//    driver.findElement(By.name("alamat")).sendKeys("Sitoluama");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081365834476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("01/02/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/03/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////54
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////55
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yohana Tambunan");
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////56
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Nania");
//    driver.findElement(By.name("alamat")).sendKeys("Donal");
//    driver.findElement(By.name("nomortelepon")).sendKeys("08136129376");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("01/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////57
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Putra");
//    driver.findElement(By.name("alamat")).sendKeys("Siraituruk");
//    driver.findElement(By.name("nomortelepon")).sendKeys("08166454476");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/01/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////58
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yodi");
//    driver.findElement(By.name("alamat")).sendKeys("Galpak");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361068436");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////59
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yani");
//    driver.findElement(By.name("alamat")).sendKeys("Jambi");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081377054476");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////60
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Marianne");
//    driver.findElement(By.name("alamat")).sendKeys("Siantar");
//    driver.findElement(By.name("tanggalrental")).sendKeys("12/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("22/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////61
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Youni");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("tanggalrental")).sendKeys("02/09/2023");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////62
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Luana");
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("tanggalrental")).sendKeys("02/07/2023");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////63
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Mega");
//    driver.findElement(By.name("alamat")).sendKeys("Parisi");
//    driver.findElement(By.name("tanggalrental")).sendKeys("12/08/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////64
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Alex");
//    driver.findElement(By.name("alamat")).sendKeys("Washington");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("11/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////65
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Rut");
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/01/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////66
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Saimar");
//    driver.findElement(By.name("alamat")).sendKeys("Balige");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////67
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Lince");
//    driver.findElement(By.name("alamat")).sendKeys("Jawa")
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////68
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Lovinta");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081367754876");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/11/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/12/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////69
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Yoas");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081359224476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("01/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("05/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////70
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("namalengkap")).sendKeys("Refina");
//    driver.findElement(By.name("nomortelepon")).sendKeys("08136147326");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/06/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////71
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("There");
//      driver.findElement(By.name("nomortelepon")).sendKeys("081379254476");
//      driver.findElement(By.name("tanggalrental")).sendKeys("01/01/2023");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////72
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("namalengkap")).sendKeys("Obed");
//      driver.findElement(By.name("nomortelepon")).sendKeys("081365836476");
//      driver.findElement(By.name("tanggalrental")).sendKeys("09/09/2023");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////73
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);\
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////74
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////75
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////76
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////77
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////78
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////79
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////80
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////81
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////82
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("alamat")).sendKeys("Porsea");
//      driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////83
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////84
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("alamat")).sendKeys("Porsea");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////85
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////86
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////87
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////88
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////89
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////90
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////91
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//      dropdownElement.click();
//      WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//      dropdownOption.click();
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////92
//public class stepDefinitionBooking {
//  WebDriver driver;
//
//  @Given("^open chrome and start application$")
//  public void open_chrome_and_start_application() throws Throwable {
//      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get("http://127.0.0.1:8000/login");
//  }
//
//  @When("^I enter valid email and valid username$")
//  public void I_enter_valid_email_and_valid_username() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//  }
//
//  @And("^I can login successfully$")
//  public void I_can_login_successfully() throws Throwable {
//      WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().perform();
//  }
//
//  @And("^I navigate to the Services menu$")
//  public void I_navigate_to_the_Services_menu() throws Throwable {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//      
//      Actions actions = new Actions(driver);
//      actions.moveToElement(servicesMenu).perform();
//  }
//
//  @And("^I navigate to the Services submenu$")
//  public void I_navigate_to_the_Services_submenu() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//  }
//
//  @And("^I navigate to the Booking page from Car Rental$")
//  public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//  }
//
//  @And("^I fill in the fields with valid information$")
//  public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//  	TimeUnit.SECONDS.sleep(2);
//      driver.findElement(By.name("nomortelepon")).sendKeys("081361054476");
//  }
//
//  @Then("^the booking is successfully done$")
//  public void the_booking_is_successfully_done() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//  }
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////93
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////94
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////95
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////96
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("tanggalrental")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////97
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////98
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    driver.findElement(By.name("tanggalpengembalian")).sendKeys("02/05/2023");
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////99
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//    WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div"));
//    dropdownElement.click();
//    WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[6]/div/ul/li[2]"));
//    dropdownOption.click();
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}
////------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////100
//public class stepDefinitionBooking {
//WebDriver driver;
//
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I enter valid email and valid username$")
//public void I_enter_valid_email_and_valid_username() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[2]")).sendKeys("tambunanyohana63@gmail.com");
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/form/input[3]")).sendKeys("yohanad3ti");
//}
//
//@And("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div/form/div/button"));
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).click().perform();
//}
//
//@And("^I navigate to the Services menu$")
//public void I_navigate_to_the_Services_menu() throws Throwable {
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/a")));
//    
//    Actions actions = new Actions(driver);
//    actions.moveToElement(servicesMenu).perform();
//}
//
//@And("^I navigate to the Services submenu$")
//public void I_navigate_to_the_Services_submenu() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/nav/div/ul/li[7]/ul/li[1]/a")).click();
//}
//
//@And("^I navigate to the Booking page from Car Rental$")
//public void I_navigate_to_the_Booking_page_from_Car_Rental() throws Throwable {
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div/div[2]/div/div/a[1]")).click();
//}
//
//@And("^I fill in the fields with valid information$")
//public void I_fill_in_the_fields_with_valid_information() throws Throwable {
//	TimeUnit.SECONDS.sleep(2);
//}
//
//@Then("^the booking is successfully done$")
//public void the_booking_is_successfully_done() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"ltn__form_tab_1_1\"]/div/form/div[7]/div/button")).click();
//}
//}