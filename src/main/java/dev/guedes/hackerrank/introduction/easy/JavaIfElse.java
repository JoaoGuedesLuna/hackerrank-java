package main.java.dev.guedes.hackerrank.introduction.easy;

import java.util.Scanner;

/**
 * In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
 * <br><br>
 * <img src="https://s3.amazonaws.com/hr-challenge-images/13689/1446563087-4ec019a919-332px-If-Then-Else-diagram.svg.png">
 * <br><br>
 * <strong>Task</strong>
 * <br><br>
 * Given an integer, n, perform the following conditional actions:
 * <ul>
 *     <li>If n is odd, print Weird</li>
 *     <li>If n is even and in the inclusive range of 2 to 5, print Not Weird</li>
 *     <li>If n is even and in the inclusive range of 6 to 20, print Weird</li>
 *     <li>If n is even and greater than 20, print Not Weird</li>
 * </ul>
 * <br><br>
 * Complete the stub code provided in your editor to print whether or not n is weird.
 * <br><br>
 * <strong>Input Format</strong>
 * <br><br>
 * A single line containing a positive integer, n.
 * <br><br>
 * <strong>Constraints</strong>
 * <ul><li>1 <= n <= 100</li></ul>
 * <br><br>
 * <strong>Output Format</strong>
 * <br><br>
 * Print Weird if the number is weird; otherwise, print Not Weird.
 * <br><br>
 * <strong>Sample Input 0</strong>
 * <br><br>
 * <code>
 *     3
 * </code>
 * <br><br>
 * <strong>Sample Output 0</strong>
 * <br><br>
 * <code>
 *     Weird
 * </code>
 * <br><br>
 * <strong>Sample Input 1</strong>
 * <br><br>
 * <code>
 *     24
 * </code>
 * <br><br>
 * <strong>Sample Output 1</strong>
 * <br><br>
 * <code>
 *     Not Weird
 * </code>
 * <br><br>
 * <strong>Explanation</strong>
 * <br><br>
 * Sample Case 0: n = 3
 * <br><br>
 * n, is odd and odd numbers are weird, so we print Weird.
 * <br><br>
 * Sample Case 1: n = 24
 * <br><br>
 * n > 20 and n is even, so it isn't weird. Thus, we print Not Weird.
 *
 * @author João Guedes
 */
public class JavaIfElse {
    private static final int WEIRD_MIN = 6;
    private static final int WEIRD_MAX = 20;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            if (isOdd(n) || isWeirdRange(n)) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }

    private static boolean isOdd(int n) { return n % 2 != 0; }

    private static boolean isWeirdRange(int n) { return n >= WEIRD_MIN && n <= WEIRD_MAX; }
}
