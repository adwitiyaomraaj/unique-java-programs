


import java.util.*;
class Emirp_No {
    
    static boolean isPrime(int n) {
        
        if (n < 2) return false;
        
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }

    
    static int reverse(int n) {
        int rev = 0;
        
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = reverse(num);

        if (isPrime(num) && isPrime(rev) && num != rev)
            
            System.out.println("Yes! It is an Emirp Number.");
        else
            System.out.println("Nope! It is not an Emirp Number.");
    }
}
