package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static Selenium.objetos.*;

public class botonconfirmarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CONFIRMAR)
        );
    }

    public static botonconfirmarTask Botonc() {
        return Tasks.instrumented(botonconfirmarTask.class);
    }
}