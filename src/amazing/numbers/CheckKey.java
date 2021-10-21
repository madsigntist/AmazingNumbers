package amazing.numbers;

public class CheckKey {
    /*check if acceptable property is entered*/
    static final String properties =
            "[BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD, EVEN, ODD]";
    static final String negativeProperties =
            "[-BUZZ, -DUCK, -PALINDROMIC, -GAPFUL, -SPY, -SQUARE, -SUNNY, -JUMPING, -HAPPY, -SAD, -EVEN, -ODD]";

    static void checkKey(String key) {
        key = key.toUpperCase();
        if (!properties.contains(key) && !negativeProperties.contains(key)) {
            System.out.printf("The property [%s] is wrong.\n" +
                    "Available properties: %s%n\n", key, properties);
            Start.start();
        }
    }

    /*checks if acceptable properties entered*/
    static void checkKey(String firstProperty, String secondProperty) {
        firstProperty = firstProperty.toUpperCase();
        secondProperty = secondProperty.toUpperCase();
        if (!properties.contains(firstProperty) && !properties.contains(secondProperty)
                && !negativeProperties.contains(firstProperty) && !negativeProperties.contains(secondProperty)) {
            System.out.printf("The properties [%s, %s] are wrong.\n" +
                    "Available properties: %s%n\n", firstProperty, secondProperty, properties);
            Start.start();
        }
    }
}
