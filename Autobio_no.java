


import java.util.*;
class Autobio_no {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();    

        int[] count = new int[10];

        
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            count[digit]++;
        }

        
        boolean isAuto = true;
        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0';
            
            if (count[i] != expected) {
                isAuto = false;
                break;
            }
        }

        if (isAuto)
            
            System.out.println("Yes! It is an Autobiographical Number.");
        else
            System.out.println("Nope! It is not an Autobiographical Number.");
    }
}
