package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import javax.swing.*;

import static Selenium.objetos.*;

public class datosformularioTask implements Task {

    private String email;
    private String codigo;
    private String telefono;
    private String contrasena;

    public datosformularioTask(String email, String codigo, String telefono, String contrasena) {
        this.email = email;
        this.codigo= codigo;
        this.telefono=telefono;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_EMAIL),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Click.on(CAMPO_CP),
                Enter.theValue(codigo).into(CAMPO_CP),
                Click.on(CAMPO_TELEFONO),
                Enter.theValue(telefono).into(CAMPO_TELEFONO),
                Scroll.to(RADIO_TIEMPO_PRESENTAR_EXAMEN),
                Click.on(RADIO_TIEMPO_PRESENTAR_EXAMEN),
                Click.on(RADIO_PRESENTAR_EXAMEN),
                Click.on(RADIO_VIA_LIBRE),
                Click.on(CAMPO_CONTRASENA),
                Enter.theValue(contrasena).into(CAMPO_CONTRASENA),
                Click.on(CAMPO_REPETIR_CONTRASENA),
                Enter.theValue(contrasena).into(CAMPO_REPETIR_CONTRASENA),
                Click.on(SELECTOR_PERMISO),
                Click.on(SELECTOR_PERMISO_B),
                Scroll.to(RADIO_ACEPTARTC),
                Click.on(RADIO_ACEPTARTC),
                Scroll.to(RADIO_RECIBIR_INFORMACION),
                Click.on(RADIO_RECIBIR_INFORMACION)
        );
    }

    public static datosformularioTask datosformularioTask(String email, String codigo, String telefono, String contrasena) {
        return Tasks.instrumented(datosformularioTask.class,email,codigo,telefono,contrasena);
    }


}
