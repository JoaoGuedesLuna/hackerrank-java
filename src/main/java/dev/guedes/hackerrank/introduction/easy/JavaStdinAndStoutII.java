package main.java.dev.guedes.hackerrank.introduction.easy;

import java.util.Scanner;

/**
 * In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.
 * <br><br>
 * <strong>Note:</strong> We recommend completing Java Stdin and Stdout I before attempting this challenge.
 * <br><br>
 * <strong>Input Format</strong>
 * <br><br>
 * There are three lines of input:
 * <br><br>
 * <ol>
 *     <li>The first line contains an integer.</li>
 *     <li>The second line contains a double.</li>
 *     <li>The third line contains a String.</li>
 * </ol>
 * <br><br>
 * <strong>Output Format</strong>
 * <br><br>
 * There are three lines of output:
 * <br><br>
 * <ol>
 *     <li>On the first line, print String: followed by the unaltered String read from stdin.</li>
 *     <li>On the second line, print Double: followed by the unaltered double read from stdin.</li>
 *     <li>On the third line, print Int: followed by the unaltered integer read from stdin.</li>
 * </ol>
 * <br><br>
 * To make the problem easier, a portion of the code is already provided in the editor.
 * <br><br>
 * <strong>Note:</strong>If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
 * <br><br>
 * <strong>Sample Input</strong>
 * <br><br>
 * <code>
 *     42<br>
 *     3.1415<br>
 *     Welcome to HackerRank's Java tutorials!
 * </code>
 * <br><br>
 * <strong>Sample Output</strong>
 * <br><br>
 * <code>
 *     String: Welcome to HackerRank's Java tutorials!<br>
 *     Double: 3.1415<br>
 *     Int: 42
 * </code>
 *
 * @author João Guedes
 */
public class JavaStdinAndStoutII {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int anInt = scanner.nextInt();
            double aDouble = scanner.nextDouble(); scanner.nextLine();
            String aString = scanner.nextLine();

            System.out.println("String: " + aString);
            System.out.println("Double: " + aDouble);
            System.out.println("Int: " + anInt);
        }
    }
}
