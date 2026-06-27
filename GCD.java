


import java.util.*;
class GCD {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        
        while (b != 0) {
            int x = b;
            b = a % b;
            a = x;
        }
        System.out.println("GCD is: " + a);
    }
}
