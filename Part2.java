import java.util.Arrays;

public class Part2 {

    public static void main(String[] args) {
        final int maxNum = 10000;
        boolean[] arr = new boolean[maxNum];
        Arrays.fill(arr, true);

        // change all composite numbers to false
        for (int i = 2; i < maxNum; i++) {
            int count = 0; // used to count the number of divisors
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count > 1) // if there is other divisors besides 1
                arr[i] = false; // then that number is not prime
            else { // if it is prime
                for (int k = i+1; k < maxNum-1; k++) { // check for multiples of i
                    if (arr[k] && k % i == 0) // if k is divisible by i
                        arr[k] = false; // then k is not prime
                }
            }
        }

        // print out the last 10 prime numbers
        int count = 0; // count until 10 numbers have been printed
        for (int i = maxNum-1; i >= 0; i--) {
            if (arr[i]) {
                System.out.println(i);
                count++;
            }
            if (count == 10)
                break;
        }



    }
}
