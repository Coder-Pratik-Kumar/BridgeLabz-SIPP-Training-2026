import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int original = Math.abs(number);

        int[] digits = storeDigits(original);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Digit count: " + countDigits(original));
        System.out.println("Duck number: " + isDuck(digits));
        System.out.println("Armstrong number: " + isArmstrong(digits, original));
        int[] largest = largestAndSecondLargest(digits);
        System.out.printf("Largest: %d, Second largest: %d%n", largest[0], largest[1]);
        int[] smallest = smallestAndSecondSmallest(digits);
        System.out.printf("Smallest: %d, Second smallest: %d%n", smallest[0], smallest[1]);

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of digit squares: " + sumOfSquares(digits));
        System.out.println("Harshad number: " + isHarshad(digits, original));
        System.out.println("Digit frequency:");
        int[][] frequency = digitFrequency(digits);
        for (int[] row : frequency) {
            if (row[1] > 0) {
                System.out.printf("Digit %d: %d%n", row[0], row[1]);
            }
        }

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversed));
        System.out.println("Palindrome: " + arraysEqual(digits, reversed));

        System.out.println("Prime: " + isPrime(original));
        System.out.println("Neon: " + isNeon(original));
        System.out.println("Spy: " + isSpy(digits));
        System.out.println("Automorphic: " + isAutomorphic(original));
        System.out.println("Buzz: " + isBuzz(original));

        System.out.println("Perfect: " + isPerfect(original));
        System.out.println("Abundant: " + isAbundant(original));
        System.out.println("Deficient: " + isDeficient(original));
        System.out.println("Strong: " + isStrong(digits, original));
        scanner.close();
    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        if (number == 0) {
            return new int[]{0};
        }
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        boolean hasZero = false;
        boolean hasNonZero = false;
        for (int digit : digits) {
            if (digit == 0) {
                hasZero = true;
            }
            if (digit != 0) {
                hasNonZero = true;
            }
        }
        return hasZero && hasNonZero;
    }

    public static boolean isArmstrong(int[] digits, int original) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == original;
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit > second && digit != largest) {
                second = digit;
            }
        }
        return new int[]{largest, second};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                second = smallest;
                smallest = digit;
            } else if (digit < second && digit != smallest) {
                second = digit;
            }
        }
        return new int[]{smallest, second};
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshad(int[] digits, int number) {
        int sum = sumOfDigits(digits);
        return sum > 0 && number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int[] digits = storeDigits(square);
        return sumOfDigits(digits) == number;
    }

    public static boolean isSpy(int[] digits) {
        int sum = 0;
        int product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numberStr);
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static int sumOfProperDivisors(int number) {
        if (number <= 1) {
            return 0;
        }
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        return number > 1 && sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return number > 1 && sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return number > 1 && sumOfProperDivisors(number) < number;
    }

    public static boolean isStrong(int[] digits, int number) {
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == number;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
