package challenge;

public class challenge3 {
    public static void main(String[] args) {
        int[] array = {1, 6, 3, 5, 8, 10, 6};

        Pair result = findMaxProductPair(array);

        if (result != null) {
            System.out.println("Two numbers with maximum product: " + result.first + " and " + result.second);
            System.out.println("Maximum product: " + (long) result.first * result.second);
        } else {
            System.out.println("Array does not have enough elements to find two numbers with maximum product.");
        }
    }

    private static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    private static Pair findMaxProductPair(int[] array) {
        if (array == null || array.length < 2) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }

            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin) {
                secondMin = num;
            }
        }

        // Check if the product of two positive numbers is greater or the product of two negative numbers is greater
        return (long) max * secondMax > (long) min * secondMin ? new Pair(max, secondMax) : new Pair(min, secondMin);
    }
}

// Find two numbers of which the product is maximum in an array
