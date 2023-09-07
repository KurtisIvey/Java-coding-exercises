package September07;

import java.util.HashMap;
import java.util.Map;


public class Welcome {
    public static String greet(String language){
        // your code
        Map<String, String> greetings = new HashMap<>();

        // Add language-greeting pairs to the HashMap
        greetings.put("english", "Welcome");
        greetings.put("czech", "Vitejte");
        greetings.put("danish", "Velkomst");
        greetings.put("dutch", "Welkom");
        greetings.put("estonian", "Tere tulemast");
        greetings.put("finnish", "Tervetuloa");
        greetings.put("flemish", "Welgekomen");
        greetings.put("french", "Bienvenue");
        greetings.put("german", "Willkommen");
        greetings.put("irish", "Failte");
        greetings.put("italian", "Benvenuto");
        greetings.put("latvian", "Gaidits");
        greetings.put("lithuanian", "Laukiamas");
        greetings.put("polish", "Witamy");
        greetings.put("spanish", "Bienvenido");
        greetings.put("swedish", "Valkommen");
        greetings.put("welsh", "Croeso");

        // must check if greetings hashmap contains lang first
        if (greetings.containsKey(language)) {
            return greetings.get(language);
        } else {
            // If the language is not found, return a default greeting
            return "Welcome";
        }
    }
}