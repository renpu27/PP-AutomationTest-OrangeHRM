package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import personalproject.pages.AdminPage;

public class TestAdmin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static AdminPage adminPage = new AdminPage();
    public TestAdmin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Admin click menu Admin")
    public void admin_click_menu_admin(){
        adminPage.goToMenuAdmin();
        extentTest.log(LogStatus.PASS,"Admin click menu Admin");
    }

    @When("Admin click button Job and click Job Titles")
    public void admin_click_job(){
        adminPage.clickJob();
        extentTest.log(LogStatus.PASS,"Admin click button Job and click Job Titles");
    }

    @And("Admin click button User Role")
    public void admin_click_button_userrole(){
        adminPage.selectUserRole();
        extentTest.log(LogStatus.PASS,"Admin click button User Role");
    }

    @And("Admin fill Employee Name")
    public void admin_fill_employeename(){
        adminPage.fillEmployeeName();
        extentTest.log(LogStatus.PASS,"Admin fill Employee Name");
    }

    @And("Admin click button Status")
    public void admin_click_button_status(){
        adminPage.selectStatus();
        extentTest.log(LogStatus.PASS,"Admin click button Status");
    }

    @And("Admin fill Username add user")
    public void admin_fill_usernameAU(){
        adminPage.fillUsernameAU();
        extentTest.log(LogStatus.PASS,"Admin fill Username add user");
    }

    @And("Admin fill Password and Confirm Password add user")
    public void admin_fill_passwordAU(){
        adminPage.fillPasswordAU();
        extentTest.log(LogStatus.PASS,"Admin fill Password and Confirm Password add user");
    }

    @And("Admin fill Job Title")
    public void admin_fill_job_title(){
        adminPage.fillJobTitle();
        extentTest.log(LogStatus.PASS,"Admin fill Job Title");
    }

    @And("Admin write Job Description")
    public void admin_write_jobdesc(){
        adminPage.writeJobDesc();
        extentTest.log(LogStatus.PASS,"Admin write Job Description");
    }

    @And("Admin write job Note")
    public void admin_write_jobnote(){
        adminPage.writeJobNote();
        extentTest.log(LogStatus.PASS,"Admin write job Note");
    }

    @Then("Admin go to page Admin User Management")
    public void admin_go_to_page_usermanagement(){
        Hooks.delay(1);
        Assert.assertEquals(adminPage.getTxtUserManagement(), "User Management");
        extentTest.log(LogStatus.PASS,"Admin go to page Admin User Management");
    }

    @Then("Admin click button Save add user")
    public void admin_click_button_saveAU(){
        Hooks.delay(3);
        adminPage.clickBtnSave();
        adminPage.clickBtnCancel();
        Assert.assertEquals(adminPage.getTxtUserManagement(), "User Management");
        extentTest.log(LogStatus.PASS,"Admin click button Save add user");
    }

    @Then("Admin click button Save job")
    public void admin_click_button_savejob(){
        Hooks.delay(3);
        adminPage.clickBtnSave();
        Assert.assertEquals(adminPage.getTxtJobTitle(), "Add Job Title");
        extentTest.log(LogStatus.PASS,"Admin click button Save job");
    }

}


