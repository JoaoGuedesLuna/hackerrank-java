package main.java.dev.guedes.hackerrank.introduction.easy;

import java.util.Scanner;

/**
 * <strong>Objective</strong>
 * <br><br>
 * In this challenge, we're going to use loops to help us do some simple math.
 * <br><br>
 * <strong>Task</strong>
 * <br><br>
 * Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.
 * <br><br>
 * <strong>Input Format</strong>
 * <br><br>
 * A single integer, N.
 * <br><br>
 * <strong>Constraints</strong>
 * <ul><li>2 <= N <= 20</li></ul>
 * <br><br>
 * <strong>Output Format</strong>
 * <br><br>
 * Print 10 lines of output; each line i (where 1 <= i <= 10) contains the result of N x i in the form: N x i = result
 * <br><br>
 * <strong>Sample Input</strong>
 * <br><br>
 * <code>
 *     2
 * </code>
 * <br><br>
 * <strong>Sample Output</strong>
 * <br><br>
 * <code>
 *     2 x 1 = 2<br>
 *     2 x 2 = 4<br>
 *     2 x 3 = 6<br>
 *     2 x 4 = 8<br>
 *     2 x 5 = 10<br>
 *     2 x 6 = 12<br>
 *     2 x 7 = 14<br>
 *     2 x 8 = 16<br>
 *     2 x 9 = 18<br>
 *     2 x 10 = 20
 * </code>
 *
 * @author João Guedes
 */
public class JavaLoopsI {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", n, i, (n * i));
            }
        }
    }
}
