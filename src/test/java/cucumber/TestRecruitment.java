package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import personalproject.pages.LoginPage;
import personalproject.pages.RecruitmentPage;

public class TestRecruitment {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static RecruitmentPage recruitmentPage = new RecruitmentPage();
    public TestRecruitment(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Admin click menu Recruitment")
    public void admin_click_menu_recruitment(){
        recruitmentPage.goToMenuRecruitment();
        extentTest.log(LogStatus.PASS, "Admin click menu Recruitment");
    }

    @When("Admin click button Add")
    public void admin_click_button_add(){
        Hooks.delay(3);
        recruitmentPage.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "Admin click button Add");
    }

    @And("Admin fill candidate Name")
    public void admin_fill_candidate_name(){
        recruitmentPage.fillName();
        extentTest.log(LogStatus.PASS, "Admin fill candidate Name");
    }

    @And("Admin choose Vacancy")
    public void admin_choose_vacancy(){
        recruitmentPage.selectVacancy();
        extentTest.log(LogStatus.PASS, "Admin choose Vacancy");
    }

    @And("Admin fill Email address and Contact number")
    public void admin_fill_email_contact(){
        recruitmentPage.fillEmailContact();
        extentTest.log(LogStatus.PASS, "Admin fill Email address and Contact number");
    }

    @And("Admin upload Resume")
    public void admin_upload_resume(){
        recruitmentPage.uploadResume();
        extentTest.log(LogStatus.PASS, "Admin upload Resume");
    }

    @And("Admin write Keywords")
    public void admin_write_keywords(){
        recruitmentPage.fillKeywords();
        extentTest.log(LogStatus.PASS, "Admin write Keywords");
    }

    @And("Admin set Date")
    public void admin_set_date(){
        recruitmentPage.chooseDate();
        extentTest.log(LogStatus.PASS, "Admin set Date");
    }

    @And("Admin write Notes")
    public void admin_write_notes(){
        recruitmentPage.fillNotes();
        extentTest.log(LogStatus.PASS, "Admin write Notes");
    }

    @And("Admin click Consent to keep data")
    public void admin_click_consent(){
        recruitmentPage.checkConsent();
        extentTest.log(LogStatus.PASS, "Admin click Consent to keep data");
    }

    @And("Admin click button Vacancies")
    public void admin_click_button_vacancies(){
        recruitmentPage.clickMenuVacancies();
        extentTest.log(LogStatus.PASS, "Admin click button Vacancies");
    }

    @And("Admin fill Vacancy Name")
    public void admin_fill_vacancy_name(){
        recruitmentPage.fillVacName();
        extentTest.log(LogStatus.PASS,"Admin fill Vacancy Name");
    }

    @And("Admin choose Job Title")
    public void admin_choose_job_title(){
        recruitmentPage.selectJobTitle();
        extentTest.log(LogStatus.PASS,"Admin choose Job Title");
    }

    @And("Admin write Description")
    public void admin_write_description(){
        recruitmentPage.fillDescription();
        extentTest.log(LogStatus.PASS,"Admin write Description");
    }

    @And("Admin fill Hiring Manager")
    public void admin_fill_hiring_manager(){
        recruitmentPage.fillHiring();
        extentTest.log(LogStatus.PASS,"Admin fill Hiring Manager");
    }

    @And("Admin fill Number of Positions")
    public void admin_fill_position(){
        recruitmentPage.fillPosNumber();
        extentTest.log(LogStatus.PASS,"Admin fill Number of Positions");
    }

    @And("Admin click button Active")
    public void admin_click_button_active(){
        recruitmentPage.clickActive();
        extentTest.log(LogStatus.PASS,"Admin click button Active");
    }

    @And("Admin click button Publish in RSS and Web Page")
    public void admin_click_button_publish(){
        recruitmentPage.clickPublish();
        extentTest.log(LogStatus.PASS,"Admin click button Publish in RSS and Web Page");
    }

    @Then("Admin go to page Recruitment")
    public void admin_go_to_page_recruitment(){
        Hooks.delay(1);
        Assert.assertEquals(recruitmentPage.getTxtRecruitment(), "Recruitment");
        extentTest.log(LogStatus.PASS, "Admin go to page Recruitment");
    }

    @Then("Admin click button Save candidate")
    public void admin_click_button_savecan(){
        Hooks.delay(3);
        recruitmentPage.clickBtnSave();
        Assert.assertEquals(recruitmentPage.getTxtAppStage(), "Application Stage");
        extentTest.log(LogStatus.PASS, "Admin click button Save candidate");
    }

    @Then("Admin click button Save vacancies")
    public void admin_click_button_savevac(){
        Hooks.delay(3);
        recruitmentPage.clickBtnSave();
        Assert.assertEquals(recruitmentPage.getTxtEditVacancy(), "Add Vacancy");
        extentTest.log(LogStatus.PASS, "Admin click button Save vacancies");
    }

}
