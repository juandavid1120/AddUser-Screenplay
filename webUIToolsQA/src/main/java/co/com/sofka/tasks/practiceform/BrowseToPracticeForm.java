package co.com.sofka.tasks.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.practiceform.PracticeForm.*;

public class BrowseToPracticeForm implements Task {
    private String passwordLogin;
    private String username;


    public BrowseToPracticeForm usingUserName(String username) {
        this.username = username;
        return this;
    }

    public BrowseToPracticeForm usingPassword(String passwordLogin) {
        this.passwordLogin = passwordLogin;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(USERNAME_LOGIN),
                Enter.theValue(username).into(USERNAME_LOGIN),

                Scroll.to(PASSWORD_LOGIN),
                Enter.theValue(passwordLogin).into(PASSWORD_LOGIN),

                Scroll.to(SUBMIT_LOGIN),
                Click.on(SUBMIT_LOGIN),

                Scroll.to(ADMIN),
                Click.on(ADMIN),

                Scroll.to(ADD),
                Click.on(ADD)

        );
    }

    public static BrowseToPracticeForm browseToPracticeForm(){
        return new BrowseToPracticeForm();
    }
}
