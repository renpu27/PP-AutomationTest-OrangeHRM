package personalproject.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import personalproject.drivers.DriverSingleton;

public class RecruitmentPage {
    private WebDriver driver;
    public RecruitmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[normalize-space()='Recruitment']")
    WebElement btnRecruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement middleName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement vacancy;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    WebElement email;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
    WebElement contactNumber;

    @FindBy(xpath = "//input[@type='file']")
    WebElement resume;

    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    WebElement keywords;

    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    WebElement date;

    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    WebElement notes;

    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement chkConsent;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSave;

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement menuRecruitment;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtRecruitment;

    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
    WebElement txtApplicationStage;

    @FindBy(xpath = "//a[normalize-space()='Vacancies']")
    WebElement menuVacancies;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")
    WebElement vacancyName;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]")
    WebElement jobTitle;

    @FindBy(xpath = "//textarea[@placeholder='Type description here']")
    WebElement description;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement hiringManager;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input")
    WebElement numberPositions;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/label[1]/span[1]")
    WebElement btnActive;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/label[1]/span[1]")
    WebElement btnPublish;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement txtEditVacancy;

    public void goToMenuRecruitment(){
        menuRecruitment.click();
    }
    public String getTxtRecruitment(){
        return txtRecruitment.getText();
    }
    public String getTxtAppStage(){
        return txtApplicationStage.getText();
    }
    public String getTxtEditVacancy(){return txtEditVacancy.getText();}
    public void clickBtnAdd(){btnAdd.click();}
    public void clickMenuVacancies(){menuVacancies.click();}
    public void fillName(){
        firstName.sendKeys("Yusup");
        middleName.sendKeys("Bin");
        lastName.sendKeys("Sanusi");
    }
    public void selectVacancy(){vacancy.sendKeys("Software");}
    public void fillEmailContact(){
        email.sendKeys("bangucup@gmail.com");
        contactNumber.sendKeys("080989999");
    }
    public void uploadResume(){
        String pathDoc = "D:\\Works\\JuaraCoding\\Excel\\UTT-Books-37.docx";
        resume.sendKeys(pathDoc);
    }
    public void fillKeywords(){keywords.sendKeys("Test");}
    public void chooseDate(){
        date.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        date.sendKeys("2023-02-23");
        }
    public void fillNotes(){notes.sendKeys("Test");}
    public void fillVacName(){vacancyName.sendKeys("abcd");}
    public void selectJobTitle(){jobTitle.sendKeys("Account Assistant");}
    public void fillDescription(){description.sendKeys("Test");}
    public void fillHiring(){hiringManager.sendKeys("Cecil  Bonaparte");}
    public void fillPosNumber(){numberPositions.sendKeys("2");}
    public void checkConsent(){chkConsent.click();}
    public void clickActive(){btnActive.click();}
    public void clickPublish(){btnPublish.click();}
    public void clickBtnSave(){btnSave.click();}

}
