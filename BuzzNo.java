


import java.util.*;
class BuzzNo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        if (num % 10 == 7 || num % 7 == 0)
            
            System.out.println("Yes! It is a Buzz Number.");
        else
            System.out.println("Nope! It is not a Buzz Number.");
    }
}
