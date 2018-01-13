package kyu8;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class WelcomeTest {
    private static Map<String, String> mapa() {
        Map<String, String> lang = new HashMap<>();
        lang.put("english", "Welcome");
        lang.put("czech", "Vitejte");
        lang.put("danish", "Velkomst");
        lang.put("dutch", "Welkom");
        lang.put("estonian", "Tere tulemast");
        lang.put("finnish", "Tervetuloa");
        lang.put("flemish", "Welgekomen");
        lang.put("french", "Bienvenue");
        lang.put("german", "Willkommen");
        lang.put("irish", "Failte");
        lang.put("italian", "Benvenuto");
        lang.put("latvian", "Gaidits");
        lang.put("lithuanian", "Laukiamas");
        lang.put("polish", "Witamy");
        lang.put("spanish", "Bienvenido");
        lang.put("swedish", "Valkommen");
        lang.put("welsh", "Croeso");
        lang.put("IP_ADDRESS_INVALID", "Welcome");
        lang.put("IP_ADDRESS_NOT_FOUND", "Welcome");
        lang.put("IP_ADDRESS_REQUIRED", "Welcome");

        return lang;
    }

    @Test
    public void Greeting() {

        for (int i = 1; i <= 100; i++) {
            Random random = new Random();
            List<String> keys = new ArrayList<String>(mapa().keySet());
            String randomKey = keys.get(random.nextInt(keys.size()));
            String value = mapa().get(randomKey);

            assertEquals(value, Welcome.greet(randomKey));

        }
    }

}