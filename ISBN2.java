


import java.util.Scanner;

public class ISBN2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ISBN number: ");
        String isbn = sc.next();
        
        int length = isbn.length();
        
        
        if (length == 10) {
            int sum = 0;
            
            for (int i = 0; i < 9; i++) {
                char ch = isbn.charAt(i);
                int digit = ch - '0';
                sum += digit * (i + 1);
            }
            char lastChar = isbn.charAt(9);
            int lastDigit = (lastChar == 'X') ? 10 : (lastChar - '0');
            sum += lastDigit * 10;
            
            if (sum % 11 == 0) {
                
                System.out.println("Valid 10-digit ISBN");
            } else {
                System.out.println("Invalid 10-digit ISBN");
            }
        } 
        
        else if (length == 13) {
            int sum = 0;
            for (int i = 0; i < 12; i++) {
                int digit = isbn.charAt(i) - '0';
                if (i % 2 == 0) {
                    sum += digit;
                } else {
                    sum += digit * 3;
                }
            }
            int checkDigit = isbn.charAt(12) - '0';
            int computedCheck = (10 - (sum % 10)) % 10;
            
            if (computedCheck == checkDigit) {
                System.out.println("Valid 13-digit ISBN");
            } else {
                System.out.println("Invalid 13-digit ISBN");
            }
        } 
        else {
            System.out.println("Invalid ISBN length");
        }
    }
}
