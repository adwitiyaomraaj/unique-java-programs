


import java.util.*;
class Neon {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();    

        int square = num * num;    
        int sum = 0;

        
        while (square > 0) {
            sum += square % 10;
            square = square / 10;
        }

        
        if (sum == num)
            
            System.out.println("Yes! It is a Neon Number.");
        else
            System.out.println("Nope! It is not a Neon Number.");
    }
}
