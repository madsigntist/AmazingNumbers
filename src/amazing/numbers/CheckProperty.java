package amazing.numbers;

public class CheckProperty {
    /*check specific properties of number*/
    static boolean checkProperty(String key, Long number) {
        switch (key.toLowerCase()) {
            case "even":
                return NumberTheory.isEven(number);
            case "-even":
                return !NumberTheory.isEven(number);
            case "odd":
                return NumberTheory.isOdd(number);
            case "-odd":
                return !NumberTheory.isOdd(number);
            case "buzz":
                return NumberTheory.isBuzz(number);
            case "-buzz":
                return !NumberTheory.isBuzz(number);
            case "duck":
                return NumberTheory.isDuck(number);
            case "-duck":
                return !NumberTheory.isDuck(number);
            case "palindromic":
                return NumberTheory.isPalindromic(number);
            case "-palindromic":
                return !NumberTheory.isPalindromic(number);
            case "gapful":
                return NumberTheory.isGapful(number);
            case "-gapful":
                return !NumberTheory.isGapful(number);
            case "spy":
                return NumberTheory.isSpy(number);
            case "-spy":
                return !NumberTheory.isSpy(number);
            case "sunny":
                return NumberTheory.isSunny(number);
            case "-sunny":
                return !NumberTheory.isSunny(number);
            case "square":
                return NumberTheory.isSquare(number);
            case "-square":
                return !NumberTheory.isSquare(number);
            case "jumping":
                return NumberTheory.isJumping(number);
            case "-jumping":
                return !NumberTheory.isJumping(number);
            case "happy":
                return NumberTheory.isHappy(number);
            case "-happy":
                return !NumberTheory.isHappy(number);
            case "sad":
                return NumberTheory.isSad(number);
            case "-sad":
                return !NumberTheory.isSad(number);
        }
        return false;
    }
}
