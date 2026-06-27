


import java.util.*;
class su_ascii{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SENTENCE: ");
        String a =sc.nextLine();
        int sum = 0; 
        int i = 0;
        
        while(i< a.length()){
            char cuChar = a.charAt(i);
            sum += cuChar;
            i++;
        }
        System.out.print("SUM OF ALL CHARACTERS: " + sum);
    }
}
