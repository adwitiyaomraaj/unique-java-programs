import java.util.*;
class encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. of rows: ");
        int n = sc.nextInt();        
        if (n > 1 && n < 10) {
            sc.nextLine();
        } else {
            System.out.println("Out of range");
            System.exit(0);
        }
        String[] row = new String[n];
        for (int i = 0; i < n; i++) {
            row[i] = sc.nextLine().toUpperCase();
            if (row[i].equals("") || row[i].charAt(row[i].length() - 1) != '.') {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                String s = row[i].substring(0, row[i].length() - 1);
                String[] words = s.split(" ");
                for (int j = words.length - 1; j >= 0; j--) {
                    System.out.print(words[j]);
                    if (j > 0) 
                        System.out.print(" "); 
                }
                System.out.println("."); 
            } else {
                String cl = row[i];
                for (int j = 0; j < cl.length(); j++) {
                    char ch = cl.charAt(j);
                    if (ch >= 'A' && ch <= 'Z') {
                        ch += 2;
                        if (ch > 'Z') {
                            ch -= 26; 
                        }
                    }
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
}