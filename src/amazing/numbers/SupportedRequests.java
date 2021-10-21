package amazing.numbers;

public class SupportedRequests {
    /*print supported requests*/
    static void supportedRequests() {
        System.out.println("\nSupported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "   * the first parameter represents a starting number;\n" +
                "   * the second parameters show how many consecutive numbers are to be processed\n" +
                "- two natural numbers and two properties to search for\n" +
                "- a property preceded by minus must not be present in numbers;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit\n");
        Start.start();
    }
}
