package org.launchcode.models;

/**
 * Created by Rebecca on 3/18/2017.
 */
public class HelloMessage {
    public static String createMessage(String name, String lang) {
        String greet = "";
        if (lang.equals("en")) {
            greet = "Hello, ";
        }
        else if (lang.equals("fr")) {
            greet = "Bonjour, ";
        }
        else if (lang.equals("es")) {
            greet = "Hola, ";
        }
        else if (lang.equals("de")) {
            greet = "Guten tag, ";
        }
        else if (lang.equals("it")) {
            greet = "Bonjourno, ";
        }

        greet = greet + name;

        String html = "<p style='color:purple'>" + "<strong>" + greet + "</strong>" + "</p>";

        return html;
    }

}
