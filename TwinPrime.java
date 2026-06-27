

    

import java.util.*;
class TwinPrime {
    
    TwinPrime(int a, int b){
        int c1 = 0;
        int c2 = 0;
        
        for (int i = 1; i <= a; i++) {
            
            if (a % i == 0) {
                c1++;
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                c2++;
            }
        }
        if (c1 == 2 && c2 == 2 && Math.abs(a - b) == 2) {
            
            System.out.println(a + " and " + b + " are twin primes.");
        } else {
            System.out.println(a + " and " + b + " are not twin primes.");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS TO CHECK WHETHER THE NUMBERS ARE TWIN PRIME NUMBERS OR NOT ");
        cons_over ob = new cons_over(sc.nextInt(),sc.nextInt());
    }
}
