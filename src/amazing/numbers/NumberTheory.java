package amazing.numbers;

public class NumberTheory {
    /*Check if num is natural*/
    static boolean isNatural(Long number) {
        return number > 0;
    }

    /*Check if num is even*/
    static boolean isEven(Long number) {
        return number % 2 == 0;
    }

    /*Check if num is odd*/
    static boolean isOdd(Long number) {
        return !isEven(number);
    }

    /*check if num is buzz*/
    static boolean isBuzz(Long number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    /*check if num is duck*/
    static boolean isDuck(Long number) {
        return String.valueOf(number).substring(1).contains("0");
    }

    /*check if num is palindromic*/
    static boolean isPalindromic(Long number) {
        String numberString = String.valueOf(number);
        return numberString.equals(new StringBuilder(numberString).reverse().toString());
    }

    /*check if num is gapful*/
    static boolean isGapful(Long number) {
        String[] splitNumber = number.toString().split("");
        if (splitNumber.length >= 3) {
            StringBuilder concatNumber = new StringBuilder();
            concatNumber.append(splitNumber[0]).append(splitNumber[splitNumber.length - 1]);
            if (number % Integer.parseInt(concatNumber.toString()) == 0) {
                return true;
            }

        }
        return false;
    }

    /*check if num is spy*/
    static boolean isSpy(Long number) {
        String[] splitNumber = number.toString().split("");
        int sumTemp = Integer.parseInt(splitNumber[0]);
        int productTemp = Integer.parseInt(splitNumber[0]);
        for (int i = 1; i <= splitNumber.length - 1; i++) {
            sumTemp += Integer.parseInt(splitNumber[i]);
            productTemp *= Integer.parseInt(splitNumber[i]);
        }
        if (sumTemp == productTemp) {
            return true;
        }
        return false;
    }

    /*checks if num is a perfect square*/
    static boolean isSquare(Long number) {
        double sqrt = Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    /*check if num is sunny*/
    static boolean isSunny(Long number) {
        return isSquare(number + 1);
    }

    /*check if num is jumping*/
    static boolean isJumping(Long number) {
        char[] digits = number.toString().toCharArray();
        for (int i = 1; i < digits.length; ++i) {
            if (Math.abs(Character.getNumericValue(digits[i - 1]) - Character.getNumericValue(digits[i])) != 1) {
                return false;
            }
        }
        return true;
    }

    /*check if num is happy*/
    static boolean isHappy(Long number) {
        if (number == 1) {
            return true;
        }
        if (number == 37) {
            return false;
        }

        String[] numberInString = String.valueOf(number).split("");
        long sum = 0;
        for (String digit : numberInString) {
            sum += (long) Math.pow(Integer.parseInt(digit), 2);
        }
        return isHappy(sum);
    }

    /*check if num is sad*/
    static boolean isSad(Long number) {
        return !isHappy(number);
    }
}
