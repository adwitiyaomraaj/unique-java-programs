


import java.util.*;
class CoPrime {
    CoPrime(short num1, short num2){
        
        int min =(int) Math.min(num1, num2);
        int x = 1;
        int i = 1;
           
           while ( i <= min) {
            
            if (num1 % i == 0 && num2 % i == 0) {
                x = i;
            }
            i++;
        }
           if (x == 1) {
            
            System.out.println(num1 + " and " + num2 + " are co-prime numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not co-prime numbers.");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS TO CHECK WHETHER THE NUMBERS ARE CO PRIME NUMBERS OR NOT ");
        cons_over ob1 = new cons_over(sc.nextShort(),sc.nextShort());
    }
}
