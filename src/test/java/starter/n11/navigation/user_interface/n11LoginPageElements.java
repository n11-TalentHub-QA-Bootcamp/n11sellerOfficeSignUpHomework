package starter.n11.navigation.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11LoginPageElements {
   public static Target NAME_FIELD = Target.the("name textbox").located(By.id("username"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").located(By.id("passwordInputText"));
    public static Target REPASSWORD_FIELD = Target.the("retype pass textbox").located(By.id("passwordRetype"));

    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("email"));
    public static Target REEMAIL_FIELD = Target.the("retype email textbox").located(By.id("emailRetype"));

    public static Target STORE_FIELD = Target.the("store name textbox").located(By.id("nickname"));

    public static Target LOGIN_BTN = Target.the("login btn").located(By.id("registerNow"));



}
