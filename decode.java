import java.util.*;
class decode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String s = sc.nextLine();
        String rev = "", ans = "";
        int i;
        for(i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        i = 0;
        String t = "";
        while(i < rev.length()) {
            t = t + rev.charAt(i);
            int num = Integer.parseInt(t);
            if(num == 32 || (num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
                ans = ans + (char)num;
                t = "";
            }
            i++; 
        }
        System.out.println("Decoded Message: " + ans);
    }
}