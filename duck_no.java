


import java.util.*;
class duck_no {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();  

        
        if (num.charAt(0) == '0') {
            
            System.out.println("Nope! It starts with 0 — not a Duck Number.");
            
            return;
        }

        boolean isDuck = false;
        
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                isDuck = true;
                break;
            }
        }

        if (isDuck)
            System.out.println("Yes! It is a Duck Number.");
        else
            System.out.println("Nope! It is not a Duck Number.");
    }
}
