

import java.util.*;
class pangram{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence");
        String a = sc.nextLine();
        
        if (a.endsWith(".") || a.endsWith("?") || a.endsWith("!")) {
            System.out.println();
        }
        else{
            System.out.println("Invalid statement . or !or ? should be at end");
            System.exit(0);
        }
        int x=0;
        
        for(char ch='a';ch<='z';ch++){
            for(int i=0;i<a.length();i++){
                if(ch==Character.toLowerCase(a.charAt(i))){
                    x++;
                    break;
                }
            }
        }
        System.out.println();
        if(x==26)
            System.out.println("It is a pangram");
        else
            System.out.println("It is not a pangram");
    }
}