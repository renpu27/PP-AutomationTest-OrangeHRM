package personalproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import personalproject.drivers.DriverSingleton;

public class AdminPage {
    private WebDriver driver;
    public AdminPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    WebElement menuAdmin;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btnAdd;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    WebElement btnUserRole;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    WebElement btnStatus;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    WebElement usernameAU;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
    WebElement passwordAU;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    WebElement confirmPasswordAU;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSave;

    @FindBy(xpath = "//div[contains(text(),'Admin2')]")
    WebElement txtAdmin2;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']")
    WebElement txtUserManagement;

    @FindBy(xpath = "//span[normalize-space()='Job']")
    WebElement btnJob;

    @FindBy(xpath = "//a[normalize-space()='Job Titles']")
    WebElement btnJobTitle;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    WebElement jobTitle;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
    WebElement jobDesc;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")
    WebElement jobNote;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement txtJobTitle;

    public String getTxtUserManagement(){return txtUserManagement.getText();}
    public String getTxtAdmin2(){return txtAdmin2.getText();}
    public String getTxtJobTitle(){return txtJobTitle.getText();}
    public void goToMenuAdmin(){menuAdmin.click();}
    public void clickBtnAdd(){btnAdd.click();}
    public void selectUserRole(){btnUserRole.sendKeys("Admin");
    }
    public void fillEmployeeName(){employeeName.sendKeys("Lisa  Andrews");}
    public void fillNoEmployeeName(){employeeName.sendKeys("");}
    public void selectStatus(){btnStatus.sendKeys("Enabled");}
    public void fillUsernameAU(){usernameAU.sendKeys("Admin2");}
    public void fillNoUsernameAU(){usernameAU.sendKeys("");}
    public void fillPasswordAU(){
        passwordAU.sendKeys("Admin_123");
        confirmPasswordAU.sendKeys("Admin_123");
    }
    public void clickBtnSave(){btnSave.click();}
    public void clickJob(){
        btnJob.click();
        btnJobTitle.click();
    }
    public void fillJobTitle(){jobTitle.sendKeys("Manager Test");}
    public void fillNoJobTitle(){jobTitle.sendKeys("");}
    public void writeJobDesc(){jobDesc.sendKeys("Test");}
    public void writeJobNote(){jobNote.sendKeys("Test");}
}
