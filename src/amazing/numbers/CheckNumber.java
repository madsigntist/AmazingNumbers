package amazing.numbers;

public class CheckNumber {
    /*check for exit request or if first input number is natural*/
    static void checkFirstNumber(Long number) {
        if (number == 0) {
            System.out.println("\nGoodbye!");
            System.exit(0);
        } else if (!NumberTheory.isNatural(number)) {
            System.out.println("\nThe first parameter should be a natural number or zero.\n");
            Start.start();
        }
    }

    /*check if second input number is natural*/
    static void checkSecondNumber(Long number) {
        if (!NumberTheory.isNatural(number)) {
            System.out.println("\nThe second parameter should be a natural number.\n");
            Start.start();
        }
    }
}
