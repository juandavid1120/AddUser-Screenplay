package co.com.sofka.tasks.practiceform;

import co.com.sofka.userinterfaces.practiceform.PracticeForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.sofka.userinterfaces.practiceform.PracticeForm.*;

public class SearchUser implements Task {
     private String assercionUserName;

    public SearchUser andUsingAserssionUserName(String assercionUserName) {
        this.assercionUserName = assercionUserName;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(USERNAME_VALIDATION),
                Enter.theValue(assercionUserName).into(USERNAME_VALIDATION),

                Scroll.to(SEARCH),
                Click.on(SEARCH)

           );


    }

    public static SearchUser searchUserPracticeForm(){
        return new SearchUser();
    }
}
