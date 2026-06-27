


import java.util.*;
class automorphic{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= a*a;
        String c = String.valueOf(a);
        String d = String.valueOf(b);
        
        if(d.endsWith(c))
           
           System.out.println("It is an automorphic number");
        else
           System.out.println("It is not an automorphic number");
    }
}