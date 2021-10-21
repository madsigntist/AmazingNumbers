package amazing.numbers;

public class ProcessOneNumber {
    /*process one number*/
    static void one(Long number) {
        System.out.
                printf("%nProperties of %d%n", number).
                printf("even: %b%n", NumberTheory.isEven(number)).
                printf("odd: %b%n", NumberTheory.isOdd(number)).
                printf("buzz: %b%n", NumberTheory.isBuzz(number)).
                printf("duck: %b%n", NumberTheory.isDuck(number)).
                printf("palindromic: %b%n", NumberTheory.isPalindromic(number)).
                printf("gapful: %b%n", NumberTheory.isGapful(number)).
                printf("spy: %b%n", NumberTheory.isSpy(number)).
                printf("sunny: %b%n", NumberTheory.isSunny(number)).
                printf("square: %b%n", NumberTheory.isSquare(number)).
                printf("happy: %b%n", NumberTheory.isHappy(number)).
                printf("sad: %b%n", NumberTheory.isSad(number)).
                printf("jumping: %b%n", NumberTheory.isJumping(number));
        Start.start();
    }
}
