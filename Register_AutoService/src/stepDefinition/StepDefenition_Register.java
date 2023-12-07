////1
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("ribka");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Ribka Tobing");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("ribka@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRIBKA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}

//
////2//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("salsa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Salsa Silalahi");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("salsa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSALSA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yohan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yohan Tambunan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yohan@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOHAN");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////3//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yosefa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yosefa Tambun");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yosefa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOSEFA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("krisna");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Krisna Saragih");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("krisna@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meKRISNA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("renova");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Renova Gultom");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("renova@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRENOVA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////4//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("emys");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Emy Sinambela");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("emyly@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meEMY");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////5//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("sana");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Sana Simanullang");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("sana@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSANA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////6//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("dante");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Dante Sihombing");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("dante@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meDANTE");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////7//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("megaria");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Megaria Napitupuluh");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("megaria@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meMEGARIA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////8//
///*package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Ribka Tobing");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("ribka@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRIBKA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////9//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Salsa Silalahi");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("salsa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSALSA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////10//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yohan Tambunan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yohan@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOHAN");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////11//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yosefa Tambun");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yosefa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOSEFA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////12//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Krisna Saragih");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("krisna@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meKRISNA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////13//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Renova Gultom");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("renova@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRENOVA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////14//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("ribka");
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("ribka@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRIBKA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////15//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("salsa");
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("salsa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSALSA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////16//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yohan");
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yohan@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOHAN");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////17//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yosefa");
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yosefa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOSEFA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////18//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("krisna");
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("krisna@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meKRISNA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////19//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("renova");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("renova@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRENOVA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////20//
// /*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("ribka");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Ribka Tobing");
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRIBKA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////21//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("salsa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Salsa Silalahi");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSALSA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////22//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yohan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yohan Tambunan");
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOHAN");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////23//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yosefa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yosefa Tambun");
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOSEFA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////24//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("krisna");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Krisna Saragih");
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meKRISNA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////25//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("renova");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Renova Gultom");
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRENOVA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////26//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("ribka");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Ribka Tobing");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("ribka@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
// 
////27//
///* package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("salsa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Salsa Silalahi");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("salsa@gmail.com");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////28//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yohan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yohan Tambunan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yohan@gmail.com");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////29//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yosefa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yosefa Tambun");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yosefa@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////30//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("krisna");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Krisna Saragih");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("krisna@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////31
///*
//
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("renova");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Renova Gultom");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("renova@gmail.com");
//
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////32//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("ribka");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////33//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("salsa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Salsa Silalahi");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("salsa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSALSA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////34//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yohan");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////35//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yosefa");
//
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////36//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("krisna");
//
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////37//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("renova");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Renova Gultom");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("renova@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRENOVA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////38//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Ribka Tobing");
//
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////39//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Salsa Silalahi");
//
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////40//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yohan Tambunan");
//
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////41//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yosefa Tambun");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////42//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Krisna Saragih");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////43//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Renova Gultom");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////44//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("ribka@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////45//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("salsa@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////46//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yohan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yohan Tambunan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yohan@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOHAN");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////47//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yosefa@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////48//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("krisna@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////49//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("renova@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////50//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRIBKA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}*/
//
////51//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSALSA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}*/
//
////52//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOHAN");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}*/
//
////53//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOSEFA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////54//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meKRISNA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////55//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRENOVA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////56//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("ribka@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRIBKA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
////57//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("salsa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSALSA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}*/
//
////58//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yohan@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOHAN");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}*/
//
////59//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yosefa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOSEFA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////60//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("krisna@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meKRISNA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////61//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("renova@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRENOVA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////62//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("ribka");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Ribka Tobing");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////63//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("salsa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Salsa Silalahi");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}*/
//
////64//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yohan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yohan Tambunan");
//
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}*/
//
////65//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yosefa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yosefa Tambun");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////66//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("krisna");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Krisna Saragih");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("renova");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Renova Gultom");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////67//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("ribka");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("ribka@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////68//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("salsa");
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("salsa@gmail.com");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////69//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yohan");
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yohan@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////70//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yosefa");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yosefa@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////71//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("krisna");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("krisna@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////72//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("renova");
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("renova@gmail.com");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////73//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Ribka Tobing");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRIBKA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////74//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Salsa Silalahi");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSALSA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}*/
//
////75//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yohan Tambunan");
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOHAN");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////76//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yosefa Tambun");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOSEFA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////77//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Krisna Saragih");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meKRISNA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////78//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Renova Gultom");
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRENOVA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////79//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("ribka");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRIBKA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}*/
//
////80//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("salsa");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSALSA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////81//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yohan");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOHAN");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}*/
//
////82//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yosefa");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOSEFA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////83//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("krisna");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meKRISNA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////84//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("renova");
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRENOVA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////85//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Ribka Tobing");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("ribka@gmail.com");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////86//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Salsa Silalahi");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("salsa@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////87//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yohan Tambunan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yohan@gmail.com");
//
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////88//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yosefa Tambun");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yosefa@gmail.com");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////89//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Krisna Saragih");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("krisna@gmail.com");
//	
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////90//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Renova Gultom");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("renova@gmail.com");
//		
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}*/
//
////91//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////92//
// /*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("salsa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Salsa Silalahi");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("salsa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meSALSA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////97//
///*
// package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yohan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yohan Tambunan");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yohan@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOHAN");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//
//}
//*/
//
////98//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("yosefa");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Yosefa Tambun");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("yosefa@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meYOSEFA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////99//
///*
//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("krisna");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Krisna Saragih");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("krisna@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meKRISNA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
////100//
///*package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefenition_Register {
//	WebDriver driver;
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_starte_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");
//		
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[2]")).sendKeys("renova");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[3]")).sendKeys("Renova Gultom");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[4]")).sendKeys("renova@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/input[5]")).sendKeys("meRENOVA");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div/form/div/button")).click();
//	}
//}
//*/
//
//
//
