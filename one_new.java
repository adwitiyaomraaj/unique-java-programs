


import java.util.*;
class one_new{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b ="";
        int i = 0;
        
        while(i<a.length()){
            char c = a.charAt(i);
            char d = (char)(c+i);
            b += d;
            i++;
        }
        
        System.out.println(b);
        
    }
}