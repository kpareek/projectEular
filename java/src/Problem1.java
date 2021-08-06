/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {
    public Problem1() {
    }

    public static int sumOfNatual(int limit) {
        int counter = 0;

        for(int i = 0; i < limit; ++i) {
            if (i % 5 == 0 || i % 3 == 0) {
                counter += i;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int i = sumOfNatual(1000);
        System.out.println(i);
    }
}