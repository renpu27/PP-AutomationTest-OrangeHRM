package personalproject.utils;

public enum TestScenarios {
    T1("Open invalid URL"),
    T2("Open valid URL"),
    T3("Admin empty login into web HRM"),
    T4("Admin invalid login into web HRM"),
    T5("Admin successful login into web HRM"),
    T6("Admin go to Recruitment page"),
    T7("Admin add candidate without name"),
    T8("Admin add candidate without first name"),
    T9("Admin add candidate without last name"),
    T10("Admin add candidate"),
    T11("Admin add vacancies without name"),
    T12("Admin add vacancies without hiring manager"),
    T13("Admin add vacancies invalid hiring manager"),
    T14("Admin add vacancies"),
    T15("Admin go to Admin/User Management page"),
    T16("Admin add System Users without name"),
    T17("Admin add System Users without username"),
    T18("Admin add System Users"),
    T19("Admin empty Job Title"),
    T20("Admin add Job Title");

    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
