package amazing.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MutuallyExclusive {
    /*check for exclusive properties*/
    static void mutuallyExclusive(String[] input) {
        List<String> exclusives = new ArrayList<>();
        List<String> list = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(input, 2, input.length)));

        for (int i = 0; i < list.size() - 1; i++) {
            String property = list.get(i);
            if (property.startsWith("-")) {
                String oppositeProperty = property.substring(1);
                if (list.contains(oppositeProperty)) {
                    exclusives.add(property + ", " + oppositeProperty);
                }
            } else {
                String oppositeProperty = "-" + property;
                if (list.contains(oppositeProperty)) {
                    exclusives.add(oppositeProperty + ", " + property);
                }
            }
        }

        if (list.contains("-ODD") && list.contains("-EVEN")) exclusives.add("-ODD, -EVEN");
        if (list.contains("ODD") && list.contains("EVEN")) exclusives.add("ODD, EVEN");
        if (list.contains("SPY") && list.contains("DUCK")) exclusives.add("SPY, DUCK");
        if (list.contains("SUNNY") && list.contains("SQUARE")) exclusives.add("SUNNY, SQUARE");
        if (list.contains("HAPPY") && list.contains("SAD")) exclusives.add("HAPPY, SAD");
        if (list.contains("-HAPPY") && list.contains("-SAD")) exclusives.add("-HAPPY, -SAD");

        if (exclusives.size() > 0) {
            System.out.println("The request contains mutually exclusive properties: " + exclusives);
            System.out.println("There are no numbers with these properties.");
            Start.start();
        }
    }
}
