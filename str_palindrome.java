


import java.util.*;
class str_palindrome{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the word");
        String a = sc.nextLine();
        a = a.toLowerCase();
        String rev ="";
        int l = a.length();
        
        for (int i = l - 1; i >= 0; i--) {
            rev += a.charAt(i);
        }
        
        if (a.equals(rev)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}