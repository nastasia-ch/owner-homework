package mailru.nastasia_chernega.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class WebDriverConfigOld {

    public String getBaseURL() {
        // зачитывание значения
        String baseURL = System.getProperty("baseURL");
        // проверка дефолтного значения
        if(Objects.isNull(baseURL)) {
            baseURL = "https://github.com";
        }
        // конвертация возвращаемого типа
        return baseURL;
    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if(Objects.isNull(browser)) {
            browser = "CHROME";
        }
        return Browser.valueOf(browser);
    }

    public URL remoteURL() {
        String remoteURL = System.getProperty("remoteURL");
        if(Objects.isNull(remoteURL)) {
            remoteURL = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
        }
        try {
            return new URL(remoteURL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}
