package challenge;

public class challenge8 {
    ublic static void main(String[] args) {
        int[] input = {4, 3, 1, 6, 2, 5, 9, 8, 7, 1, 3, 6, 9, 2, 4, 7, 8, 5};

        System.out.println("Original array: " + Arrays.toString(input));

        countingSort(input, 1, 9);

        System.out.println("Sorted array: " + Arrays.toString(input));
    }

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
