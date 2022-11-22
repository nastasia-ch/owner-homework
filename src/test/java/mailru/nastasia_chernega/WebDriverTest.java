package mailru.nastasia_chernega;

import mailru.nastasia_chernega.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {



    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebDriverProvider().get();
    }

    @Test
    public void checkTitle() {
        assertEquals("GitHub: Let’s build from here · GitHub", driver.getTitle());

    }

    @AfterEach
    void stopDriver() {
        driver.quit();
    }

}
