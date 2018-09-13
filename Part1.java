public class Part1 {

    public static void main(String[] args) {
            final int numbers = 10000; // finding odd abundant numbers < 10000
            for (int i = 1; i < numbers; i++) {
                int sum = 0;
                for (int j = 1; j < i; j++) { // check for divisors
                    if (i % j == 0)
                        sum += j; // add divisors together
                }
                if (sum > i && i % 2 != 0) // check if odd and abundant
                    System.out.println(i);
            }
    }
}

