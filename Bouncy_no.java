


import java.util.*;
class Bouncy_no {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();

        boolean increasing = true;
        boolean decreasing = true;

        
        for (int i = 0; i < num.length() - 1; i++) {
            int curr = num.charAt(i) - '0';
            int next = num.charAt(i + 1) - '0';

            
            if (curr < next)
                decreasing = false;
            
            else if (curr > next)
                increasing = false;
        }

        if (!increasing && !decreasing)
            
            System.out.println(num + " is a Bouncy Number.");
        else
            System.out.println(num + " is NOT a Bouncy Number.");
    }
}
