package co.com.sofka.questions.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.practiceform.PracticeForm.*;

public class PracticeForm implements Question<Boolean> {
    private String userRole;
    private String employeeName;
    private String userName;
    private String status;
    private String password;
    private String confirmPassword;
    String valueInputUserNameValidation;

    public PracticeForm wasFilledUserRole(String userRole) {
        this.userRole = userRole;
        return this;
    }

    public PracticeForm andWithEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    public PracticeForm andWithUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public PracticeForm andWithStatus(String status) {
        this.status = status;
        return this;
    }
    public PracticeForm andWithPassword(String password) {
        this.password = password;
        return this;
    }
    public PracticeForm andWithConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public PracticeForm is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        valueInputUserNameValidation=USERNAME_VALIDATION.resolveFor(actor).getTextValue();
        if(valueInputUserNameValidation.equals(userName)){
            return true;
        }
        return false;

    }

    public static PracticeForm practiceForm(){
        return new PracticeForm();
    }
}
