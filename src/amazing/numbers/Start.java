package amazing.numbers;

import java.util.Scanner;

public class Start {
    /*process inputs*/
    static int count;

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a request: ");
        String next = scanner.nextLine();
        String[] input = next.split(" ");
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].toUpperCase();
        }
        long number = Long.parseLong(input[0]);
        CheckNumber.checkFirstNumber(number);

        switch (input.length) {
            case 1:
                ProcessOneNumber.one(number);
                break;
            case 2:
                count = Integer.parseInt(input[1]);
                CheckNumber.checkSecondNumber(Long.valueOf(count));
                while (count != 0) {
                    ProcessRangeOfNumbers.two(number);
                    count--;
                    number++;
                }
                break;
            case 3:
                count = Integer.parseInt(input[1]);
                CheckNumber.checkSecondNumber(Long.valueOf(count));
                CheckKey.checkKey(input[2]);

                while (count > 0) {
                    if (CheckProperty.checkProperty(input[2], number)) {
                        ProcessRangeOfNumbers.two(number);
                        count--;
                    }
                    number++;
                }
                break;
            default:
                count = Integer.parseInt(input[1]);
                CheckNumber.checkSecondNumber(Long.valueOf(count));
                CheckKey.checkKey(input[2], input[3]);

                for (int i = 2; i < input.length; i++) {
                    CheckKey.checkKey(input[i]);
                }
                MutuallyExclusive.mutuallyExclusive(input);
                boolean check;
                while (count > 0) {
                    check = true;
                    for (int i = 2; i < input.length; i++) {
                        if (!CheckProperty.checkProperty(input[i], number)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        ProcessRangeOfNumbers.two(number);
                        count--;
                    }
                    number++;
                }
        }
        start();
    }
}
