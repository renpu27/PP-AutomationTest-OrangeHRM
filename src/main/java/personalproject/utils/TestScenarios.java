package personalproject.utils;

public enum TestScenarios {
    T1("Admin empty login into web HRM"),
    T2("Admin invalid login into web HRM"),
    T3("Admin successful login into web HRM"),
    T4("Admin go to Recruitment page"),
    T5("Admin add candidate"),
    T6("Admin add vacancies"),
    T7("Admin go to Admin/User Management page"),
    T8("Admin add System Users"),
    T9("Admin add Job Title");

    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
