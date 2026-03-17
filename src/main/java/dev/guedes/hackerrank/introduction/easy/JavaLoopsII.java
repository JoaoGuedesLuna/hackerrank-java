package main.java.dev.guedes.hackerrank.introduction.easy;

import java.util.Scanner;

/**
 * We use the integers a, b, and n to create the following series:
 * <br><br>
 * (a + 2^0 * b), (a + 2^0 * b + 2^1 * b), ..., (a + 2^0 * b + 2^1 * b + ... + 2^n-1 * b)
 * <br><br>
 * You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
 * <br><br>
 * <strong>Input Format</strong>
 * <br><br>
 * The first line contains an integer, q, denoting the number of queries.
 * Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.
 * <br><br>
 * <strong>Constraints</strong>
 * <ul>
 *     <li>0 <= q <= 500</li>
 *     <li>0 <= a,b <= 50</li>
 *     <li>1 <= n <= 15</li>
 * </ul>
 * <br><br>
 * <strong>Output Format</strong>
 * <br><br>
 * For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
 * <br><br>
 * <strong>Sample Input</strong>
 * <br><br>
 * <code>
 *     2<br>
 *     0 2 10<br>
 *     5 3 5
 * </code>
 * <br><br>
 * <strong>Sample Output</strong>
 * <br><br>
 * <code>
 *     2 6 14 30 62 126 254 510 1022 2046<br>
 *     8 14 26 50 98
 * </code>
 * <br><br>
 * <strong>Explanation</strong>
 * <br><br>
 * We have two queries:
 * <ol>
 *     <li>
 *         We use a = 0, b = 2, and n = 10 to produce some series s0, s1, ..., sn:
 *         <ul>
 *             <li>s0 = 0 + 1 * 2 = 2</li>
 *             <li>s0 = 0 + 1 * 2 + 2 * 2 = 6</li>
 *             <li>s0 = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14</li>
 *         </ul>
 *         ... and so on.<br>
 *         Once we hit n = 10, we print the first ten terms as a single line of space-separated integers.
 *     </li>
 *     <li>
 *         We use a = 5, b = 3, and n = 5 to produce some series s0, s1, ..., sn:
 *         <ul>
 *             <li>s0 = 5 + 1 * 3 = 8</li>
 *             <li>s0 = 5 + 1 * 3 + 2 * 3 = 14</li>
 *             <li>s0 = 5 + 1 * 3 + 2 * 3 + 4 * 3 = 26</li>
 *             <li>s0 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 = 50</li>
 *             <li>s0 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 + 16 * 3 = 98</li>
 *         </ul>
 *         We then print each element of our series as a single line of space-separated values.
 *     </li>
 * </ol>
 *
 * @author João Guedes
 */
public class JavaLoopsII {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int q = scanner.nextInt();

            while (q-- > 0) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int n = scanner.nextInt();

                int serie = a;
                int term = b;

                for (int j = 0; j < n; j++) {
                    serie += term;
                    System.out.print(serie + " ");
                    term <<= 1;
                }

                System.out.println();
            }
        }
    }
}
