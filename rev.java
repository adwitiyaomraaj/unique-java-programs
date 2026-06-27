


import java.util.*;
class rev{
    
    public static void main(String[]args){
        int a=0,x=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to reverse it");
        int n = sc.nextInt();
        a=n;
        
        while(a!=0){
            x= a%10;
            a= a/10;
            System.out.print(x);
        }
        System.out.println();
    }
}