package challenge;

import java.util.Arrays;

public class challenge8 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 6, 2, 5, 7, 8, 7, 9, 6, 9, 4, 8};

        System.out.println("The initial array is: " + Arrays.toString(numbers));

        countingSort(numbers, 1, 9);

        System.out.println("The sorted array is: " + Arrays.toString(numbers));
    }

    // Creating a function to sort the array
    private static void countingSort(int[] arr, int min, int max) {
        int[] count = new int[max - min + 1];

        for (int num : arr) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            while (count[i - min] > 0) {
                arr[index++] = i;
                count[i - min]--;
            }
        }
    }
}

// Given a collection of 1 million integers, all ranging between1 to 9, sort them in Big O(n) time
