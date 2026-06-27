


import java.util.*;
class ISBN_10{
    
    public static void main( String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ISBN number: ");
        String a = sc.nextLine();
        
        if (a.length() != 10) {
            
            System.out.println("Invalid ISBN");
        } 
        else {
            int sum = 0;
            
            for (int i = 0; i < 10; i++) {
                int digit = a.charAt(i) - '0';  
                sum += (i + 1) * digit;
            }
            if (sum % 11 == 0) {
                System.out.println("LEGAL ISBN");
            } else {
                System.out.println("ILLEGAL ISBN");
            }
        }
    }
}