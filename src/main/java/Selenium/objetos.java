package Selenium;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.todotest.com/")
public class objetos extends Webdriver{
    public static final Target BOTON_ACEPTAR_COKKIES=Target.the("Boton aceptar cokkies").located(By.xpath("//div[@id='qc-cmp2-ui']/div[2]/div/button[2]"));

    public static final Target BOTON_REGISTRARSE=Target.the("Boton registrarse").located(By.xpath("//div[@id='mnu']/div[2]/a[2]"));

    public static final Target CAMPO_EMAIL=Target.the("Campo Email").located(By.xpath("//input[@id='email']"));

    public static final Target CAMPO_CP=Target.the("Campo codigo postal").located(By.xpath("//input[@id='cp']"));

    public static final Target CAMPO_TELEFONO=Target.the("Campo telefono").located(By.xpath("//input[@id='tel']"));

    public static final Target RADIO_TIEMPO_PRESENTAR_EXAMEN=Target.the("Selector de tiempo de presentar examen").located(By.xpath("//form[@id='frm_reg']/div[3]/div[2]/div[2]/label"));

    public static final Target RADIO_PRESENTAR_EXAMEN=Target.the("Porque de la solicitud").located(By.xpath("//form[@id='frm_reg']/div[3]/div[4]/div[3]/label"));

    public static final Target RADIO_VIA_LIBRE=Target.the("Selector si va por via libre").located(By.xpath("//div[@id='lib_si_div']/label"));

    public static final Target CAMPO_CONTRASENA=Target.the("Escribir contraseña").located(By.xpath("//input[@id='contra']"));

    public static final Target CAMPO_REPETIR_CONTRASENA=Target.the("Repetir contraseña").located(By.xpath("//input[@id='contrarep']"));

    public static final Target RADIO_ACEPTARTC=Target.the("Aceptar terminos y condiciones").located(By.xpath("//form[@id='frm_reg']/div[7]/fieldset/div/label"));

    public static final Target RADIO_RECIBIR_INFORMACION=Target.the("Recibir informacion").located(By.xpath("//div[@id='pubon_div']/label"));

    public static final Target SELECTOR_PERMISO=Target.the("Boton confirmar registro").located(By.xpath("//select[@id='perm']"));

    public static final Target BOTON_CONFIRMAR=Target.the("Boton confirmar registro").located(By.xpath("//a[@id='bot_reg']"));

    public static final Target SELECTOR_PERMISO_B=Target.the("Boton confirmar registro").located(By.xpath("/html/body/div[3]/div/div/div/form/div[4]/div/fieldset[1]/select/option[2]"));
}
