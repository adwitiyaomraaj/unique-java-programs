/*
 * Write a program in Java to check whether a number is a Fascinating Number.

A number is said to be Fascinating if, when it is multiplied by 2 and 3, and all three numbers (the original number, the product with 2, and the product with 3) are concatenated together,
the resulting number contains all the digits from 1 to 9 exactly once and does not contain 0.
 */
import java.util.*;
class fascinate{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a, c = 0, d = 0, e = 0;
        while (b != 0) {
            c = b % 10;
            d++;
            b = b / 10;
        }
        if (d < 3) {
            System.out.println("Invalid Input, number should be 3 or more digits");
            System.exit(0);
        }
        int[] n = new int[3];
        c = 0;b=0;d=0;
        for (int i = 0; i < n.length; i++) {
            n[i] = a * (i + 1);
            b = n[i];
            while (b != 0) {
                c = b % 10;
                d++;
                b = b / 10;
            }
            e = e * (int) Math.pow(10, d) + n[i];
            d = 0;
        }
        System.out.println("Fascinating no. input: "+e);
        String s = String.valueOf(e);
        String[] asc = s.split("");
        int count[] = new int[10];
        for (int i = 0; i < asc.length; i++) {
            char ch = asc[i].charAt(0);
            int ascii = (int) ch;
            if (ascii == 48) {
                System.out.println("0 is not a part of a fascinating number.");
                System.out.println("It is not a fascinating number.");
                System.exit(0);
            }
            int digit = ascii - 48;
            count[digit]++;
            if (count[digit] > 1) {
                System.out.println("Repetition of digit is found");
                System.out.println("It is not a fascinating number.");
                System.exit(0);
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (count[i] == 0) {
                System.out.println("Digit " + i + " is missing.");
                System.out.println("It is not a fascinating number.");
                System.exit(0);
            }
        }
        System.out.println(a + " is a Fascinating Number!");
    }
}