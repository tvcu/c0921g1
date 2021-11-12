package vn.codegym;

public class Math {
    public static String language;

    static {
        if (System.getProperty("lang").equals("en")) {
            language = "english";
        } else {
            language = "spanish";
        }
    }

}
