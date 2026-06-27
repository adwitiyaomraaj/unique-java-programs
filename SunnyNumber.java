


import java.util.*;
class SunnyNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();     

        int next = num + 1;
        double root = Math.sqrt(next);

        
        if ((root - (int)root) == 0)  
            
            System.out.println("Yes! It is a Sunny Number.");
        else
            System.out.println("Nope! It is not a Sunny Number.");
    }
}
