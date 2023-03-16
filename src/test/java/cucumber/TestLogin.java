package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import personalproject.pages.LoginPage;
import personalproject.utils.Constants;

public class TestLogin {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @Given("Admin open browser and url")
    public void admin_open_browser_and_url() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"Admin open browser and url");
    }

    @When("Admin enter valid username")
    public void admin_enter_valid_username() {
        loginPage.enterUsername("Admin");
        extentTest.log(LogStatus.PASS,"Admin enter valid username");
    }

    @And("Admin enter valid password")
    public void admin_enter_valid_password() {
        loginPage.enterPassword("admin123");
        extentTest.log(LogStatus.PASS,"Admin enter valid password");
    }

    @And("Admin click button login")
    public void admin_click_button_login() {
        loginPage.buttonLogin();
        extentTest.log(LogStatus.PASS,"Admin click button login");
    }

    @When("Admin click button logout")
    public void admin_click_button_logout(){
        loginPage.buttonLogout();
        extentTest.log(LogStatus.PASS,"Admin click button logout");
    }

    @And("Admin enter invalid username")
    public void admin_enter_invalid_username() {
        loginPage.enterUsername("Edmin");
        extentTest.log(LogStatus.PASS,"Admin enter invalid username");
    }

    @And("Admin enter invalid password")
    public void admin_enter_invalid_password() {
        loginPage.enterPassword("edmin123");
        extentTest.log(LogStatus.PASS,"Admin enter invalid password");
    }

    @And("Admin enter no password")
    public void admin_enter_no_password() {
        loginPage.enterPassword("");
        extentTest.log(LogStatus.PASS,"Admin enter no password");
    }

    @Then("Admin go to page Dashboard")
    public void admin_go_to_page_dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getTxtDashboard(),"Dashboard");
        extentTest.log(LogStatus.PASS,"Admin go to page Dashboard");
    }

    @Then("Admin get message invalid credentials")
    public void admin_get_message_invalid_credentials() {
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Invalid credentials");
        extentTest.log(LogStatus.PASS,"Admin get message invalid credentials");
    }

    @Then("Admin get message required")
    public void Admin_get_message_required() {
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getTxtRequired(),"Required");
    }


}
