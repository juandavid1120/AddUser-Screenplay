package co.com.sofka.tasks.practiceform;

import co.com.sofka.userinterfaces.practiceform.PracticeForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.sofka.userinterfaces.practiceform.PracticeForm.*;

public class FillPracticeForm implements Task {

    private String userRole;
    private String employeeName;
    private String userName;
    private String status;
    private String password;
    private String confirmPassword;


    public FillPracticeForm usingUserRole(String userRole) {
        this.userRole = userRole;
        return this;
    }

    public FillPracticeForm usingEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    public FillPracticeForm usingUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public FillPracticeForm andUsingPassword(String password) {
        this.password = password;
        return this;
    }
    public FillPracticeForm andUsingConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    } public FillPracticeForm andUsingStatus(String status) {
        this.status = status;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(USER_ROLE),
                SelectFromOptions.byVisibleText("ESS").from(USER_ROLE),

                Scroll.to(EMPLOYEE_NAME),
                Enter.theValue(employeeName).into(EMPLOYEE_NAME),

                Scroll.to(USERNAME),
                Enter.theValue(userName).into(USERNAME),

                Scroll.to(STATUS),
                SelectFromOptions.byVisibleText("Enabled").from(STATUS),

                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),

                Scroll.to(CONFIRM_PASSWORD),
                Enter.theValue(confirmPassword).into(CONFIRM_PASSWORD),

                Scroll.to(SAVED),
                Click.on(SAVED)


        );

    }


    public static FillPracticeForm fillPracticeForm(){
        return new FillPracticeForm();
    }
}
