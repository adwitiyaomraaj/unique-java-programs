


import java.util.*;
class crypto{
    
    crypto(String a) {
        String en_pass = "";
        int i = 0;
        
        while(i< a.length()){
            char cuChar = a.charAt(i);
            char enChar = (char) (cuChar - 2);
            en_pass += enChar;
            i++;
        }
        
        
        
        System.out.println("New password: " + en_pass);
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        cons_over ob = new cons_over(sc.nextLine());
    }
}
