package co.com.sofka.userinterfaces.practiceform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class PracticeForm extends PageObject {

    public static final Target USERNAME_LOGIN = Target
            .the("User name login")
            .located(id("txtUsername"));

    public static final Target PASSWORD_LOGIN = Target
            .the("Password login")
            .located(id("txtPassword"));
    public static final Target SUBMIT_LOGIN = Target
            .the("Submit Login")
            .located(id("btnLogin"));

    public static final Target ADMIN = Target
            .the("Admin")
            .located(id("menu_admin_viewAdminModule"));

    public static final Target SEARCH = Target
            .the("Search")
            .located(id("searchBtn"));
    public static final Target USERNAME_VALIDATION = Target
            .the("UserName Admin")
            .located(id("searchSystemUser_userName"));

    public static final Target ADD = Target
            .the("ADD")
            .located(id("btnAdd"));


    public static final Target USER_ROLE = Target
            .the("User Role")
            .located(id("systemUser_userType"));

    //For validations.
    public static final Target EMPLOYEE_NAME = Target
            .the("Employee Name")
            .located(id("systemUser_employeeName_empName"));


    public static final Target USERNAME = Target
            .the("Username")
            .located(id("systemUser_userName"));

    public static final Target STATUS = Target
            .the("Status")
            .located(id("systemUser_status"));


    public static final Target PASSWORD = Target
            .the("Password")
            .located(id("systemUser_password"));
    public static final Target CONFIRM_PASSWORD = Target
            .the("Confirm Password")
            .located(id("systemUser_confirmPassword"));
    public static final Target SAVED = Target
            .the("Saved")
            .located(id("btnSave"));


   /* public static final Target STUDENT_NAME_VALIDATION = Target
            .the("Student Name")
            .located(xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[1]/td[2]"));
    */
   /* public static final Target GENDER_VALIDATION = Target
            .the("Gender")
            .located(xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[3]/td[2]"));

    public static final Target MOBILE_VALIDATION = Target
            .the("Gender")
            .located(xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[4]/td[2]"));

    public static final Target DATE_OF_BIRTH_VALIDATION = Target
            .the("Gender")
            .located(xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[5]/td[2]"));
*/
}
