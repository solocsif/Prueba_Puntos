package stepsdefinition;

import Task.botonconfirmarTask;
import Task.botonregistrarseTask;
import Task.datosformularioTask;
import Task.urlTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class registrosteps {
    @Before
    public void definirEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Dirigirse a la URL$")
    public void DirigirsealaURL() {
        theActor("Javier").wasAbleTo(urlTask.urlTask());
    }

    @When("^el usuario da click en el boton registarse$")
    public void elusuariodaclickenelbotonregistarse() {
        theActorInTheSpotlight().attemptsTo(botonregistrarseTask.botonregistrarseTask());
    }

    @Then("^Usuario llena los datos del formulario con (.*) tambien (.*) tambien (.*) y (.*)$")
    public void Usuariollenalosdatosdelformulariocon(String email,String codigo,String telefono,String contrasena) {
        theActorInTheSpotlight().attemptsTo(
                datosformularioTask.datosformularioTask(email, codigo, telefono, contrasena)
        );

    }

    @And("^usuario da click en boton confirmar registro$")
    public void usuariodaclickenbotonconfirmarregistro() throws InterruptedException {
        Thread.sleep(10000);
        theActorInTheSpotlight().attemptsTo(botonconfirmarTask.Botonc());
    }



}
