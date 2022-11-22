package mailru.nastasia_chernega.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseURL")
    @DefaultValue("https://github.com")
    String getBaseURL();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    //@Key("remoteURl")
    //URL getRemoteURL();


}
