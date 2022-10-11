package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Selenium.objetos.BOTON_ACEPTAR_COKKIES;
import static Selenium.objetos.BOTON_REGISTRARSE;

public class botonregistrarseTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ACEPTAR_COKKIES),
                Click.on(BOTON_REGISTRARSE)
        );
    }

    public static botonregistrarseTask botonregistrarseTask() {
        return Tasks.instrumented(botonregistrarseTask.class);
    }
}
