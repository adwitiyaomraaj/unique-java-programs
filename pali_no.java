import java.util.*;
class pali_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String a = sc.nextLine();
        String[] word = a.split(" ");
        int c = 0;
        for (int i = 0; i < word.length; i++) {
            String b = word[i];
            String rev = "";
            for (int j = b.length() - 1; j >= 0; j--) {
                rev += b.charAt(j);
            }
            if (rev.equalsIgnoreCase(b)) {
                System.out.print(b + " ");
                c++;
            }
        }
        System.out.println();
        System.out.println("no. of palindrome words: " + c);
    }
}