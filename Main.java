public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {10, 5, 8, 2, 15};

        // Calculate the difference and print the result
        int difference = calculateDifference(array);
        System.out.println("La diferencia entre el valor más grande y el más pequeño es: " + difference);
    }

    // Method to calculate the difference between the largest and smallest values in an array
    public static int calculateDifference(int[] array) {
        // Initialize variables for the maximum and minimum values
        int max = array[0];
        int min = array[0];

        // Find the maximum and minimum values in the array
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Calculate the difference and return it
        return max - min;
    }
}