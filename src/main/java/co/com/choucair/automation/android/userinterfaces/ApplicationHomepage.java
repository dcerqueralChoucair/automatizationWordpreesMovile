package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplicationHomepage {
    public static final Target LOGIN_BUTTON = Target.the("Login Button")
            .located(By.id("org.wordpress.android:id/login_button"));
}
