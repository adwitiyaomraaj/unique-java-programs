


import java.util.*;
class TechNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();  

        int count = 0;
        int temp = num;

        
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        
        if (count % 2 != 0) {
            
            System.out.println("Nope! It is not a Tech Number (odd number of digits).");
            
            return;
        }

        int divider = (int)Math.pow(10, count / 2);
        int firstHalf = num / divider;
        int secondHalf = num % divider;
        int sum = firstHalf + secondHalf;

        if (sum * sum == num)
            System.out.println("Yes! It is a Tech Number.");
        else
            System.out.println("Nope! It is not a Tech Number.");
    }
}
