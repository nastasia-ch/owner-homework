package mailru.nastasia_chernega.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Key("array")
    String[] getFruitsArray();

    @Key("array_with_default_values")
    @DefaultValue("orange,apple")
    String[] getFruitsArrayWithDefaultValues();

    @Key("list")
    List<String> getFruitsList();

    @Key("list_with_separator")
    @Separator(";")
    List<String> getFruitsListWithSeparator();

    @Key("list_of_browsers")
    @Separator(" ")
    List<Browser> getListOfBBrowsers();

    @Key("list_of_integers")
    List<Integer> getListOfIntegers();

}
