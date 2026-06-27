


import java.util.*;
class Fascinating {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (3 digits or more): ");
        int num = sc.nextInt();  

        
        if (num < 100) {
            
            System.out.println("Number should have at least 3 digits.");
            
            return;
        }

        String concat = num + "" + (num * 2) + (num * 3);

        boolean[] digits = new boolean[10];  

        
        for (int i = 0; i < concat.length(); i++) {
            int d = concat.charAt(i) - '0';
            if (d == 0) continue;  
            if (digits[d]) {
                System.out.println("Not a Fascinating Number.");
                return;
            }
            digits[d] = true;
        }

        for (int i = 1; i <= 9; i++) {
            if (!digits[i]) {
                System.out.println("Not a Fascinating Number.");
                return;
            }
        }

        System.out.println("Yes! It is a Fascinating Number.");
    }
}
