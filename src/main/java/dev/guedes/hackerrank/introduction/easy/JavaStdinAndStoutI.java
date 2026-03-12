package main.java.dev.guedes.hackerrank.introduction.easy;

import java.util.Scanner;

/**
 * Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).
 * <br><br>
 * One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:
 * <br><br>
 * <code>
 *     Scanner scanner = new Scanner(System.in);<br>
 *     String myString = scanner.next();<br>
 *     int myInt = scanner.nextInt();<br>
 *     int myInt = scanner.nextInt();<br>
 *     scanner.close();<br>
 *     <br>
 *     System.out.println("myString is: " + myString);<br>
 *     System.out.println("myInt is: " + myInt);
 * </code>
 * <br><br>
 * The code above creates a Scanner object named  and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:
 * <br><br>
 * <code>
 *     Hi 5
 * </code>
 * <br><br>
 * Our code will print:
 * <br><br>
 * <code>
 *     myString is: Hi<br>
 *     myInt is: 5
 * </code>
 * <br><br>
 * Alternatively, you can use the BufferedReader class.
 * <br><br>
 * <strong>Task</strong>
 * <br><br>
 * In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
 * <br><br>
 * <strong>Input Format</strong>
 * <br><br>
 * There are  lines of input, and each line contains a single integer.
 * <br><br>
 * <code>
 *     42<br>
 *     100<br>
 *     125
 * </code>
 * <br><br>
 * <strong>Sample Output</strong>
 * <br><br>
 * <code>
 *     42<br>
 *     100<br>
 *     125
 * </code>
 *
 * @author João Guedes
 */
public class JavaStdinAndStoutI {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();

            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
        }
    }
}
