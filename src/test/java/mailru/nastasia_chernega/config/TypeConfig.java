package mailru.nastasia_chernega.config;

import org.aeonbits.owner.Config;

import java.net.URL;

// проверить FILE, URL, Path, byte[]

public interface TypeConfig extends Config {

    @Key("integer")
    Integer getInteger();

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();

    @Key("browser")
    Browser getBrowser();


}
