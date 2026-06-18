public class RandomStats {
    public static void main(String[] args) {
        int[] values = generate4DigitRandomArray(5);
        System.out.print("Generated numbers: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();

        double[] stats = findAverageMinMax(values);
        System.out.printf("Average: %.2f%n", stats[0]);
        System.out.printf("Minimum: %.0f%n", stats[1]);
        System.out.printf("Maximum: %.0f%n", stats[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
}
