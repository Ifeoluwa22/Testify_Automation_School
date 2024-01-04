package challenge;

public class challenge4 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


}


// Write  a  Java code  to  check  for  the Prime  numbers between 1-100
