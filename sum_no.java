


import java.util.*;
class sum_no {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int a = num; 
        int c1 = 0;  
        int Sum = 0;  
        do {
            int digit = num % 10;
            Sum += digit;
            num /= 10;
            c1++; 
        } 
        
        while(num > 0);
        
        if(Sum == c1)
            
            System.out.println("The sum of the digits is equal to the number of digits");
        else 
            System.out.println("The sum of the digits is not equal to the number of digits");
    }
}
