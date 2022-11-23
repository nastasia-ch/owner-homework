package mailru.nastasia_chernega;

import mailru.nastasia_chernega.config.Browser;
import mailru.nastasia_chernega.config.FruitsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FruitTests {

    @Test
    void testArray() {

        System.setProperty("array","apple,orange,banana");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class,System.getProperties());
        assertThat(config.getFruitsArray()).containsExactly("apple","orange","banana");

    }

    @Test
    void testArrayWithDefaultValues() {

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class,System.getProperties());
        assertThat(config.getFruitsArrayWithDefaultValues()).containsExactly("orange","apple");

    }

    @Test
    void testList() {

        System.setProperty("list","grapes,mango,melon");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class,System.getProperties());
        assertThat(config.getFruitsList()).containsExactly("grapes","mango","melon");

    }

    @Test
    void testListWithSeparator() {

        System.setProperty("list_with_separator","banana;grapefruit");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class,System.getProperties());
        assertThat(config.getFruitsListWithSeparator()).containsExactly("banana","grapefruit");

    }

    @Test
    void testListOfBrowsers() {

        System.setProperty("list_of_browsers","CHROME FIREFOX");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class,System.getProperties());
        assertThat(config.getListOfBBrowsers()).containsExactly(Browser.CHROME,Browser.FIREFOX);

    }

    @Test
    @Tag("test_list_of_integers")
    void testListOfIntegers() {

        //System.setProperty("list_of_integers","1,77,987");
        System.getProperty("list_of_integers");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class,System.getProperties());
        assertThat(config.getListOfIntegers()).containsExactly(1,77,987);

    }

}
