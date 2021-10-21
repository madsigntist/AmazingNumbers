package amazing.numbers;

public class ProcessRangeOfNumbers {
    /*process range of numbers*/
    static void two(Long number) {
        System.out.println(number
                + " is "
                + (NumberTheory.isBuzz(number) ? "buzz, " : "")
                + (NumberTheory.isDuck(number) ? "duck, " : "")
                + (NumberTheory.isPalindromic(number) ? "palindromic, " : "")
                + (NumberTheory.isGapful(number) ? "gapful, " : "")
                + (NumberTheory.isSpy(number) ? "spy, " : "")
                + (NumberTheory.isSquare(number) ? "square, " : "")
                + (NumberTheory.isSunny(number) ? "sunny, " : "")
                + (NumberTheory.isJumping(number) ? "jumping, " : "")
                + (NumberTheory.isHappy(number) ? "happy, " : "sad, ")
                + (NumberTheory.isEven(number) ? "even " : "odd ")
        );
    }
}
