


import java.util.*;
class gcd_ref {
    
    int a = 0, b = 0, c = 0;
    
    gcd_ref gcd(gcd_ref n) {
        gcd_ref d = new gcd_ref();
        
        while(n.b!=0){
            int x = n.b;
            n.b=n.a%n.b;
            n.a=x;
        }
        d.c=n.a;
        
        return d;
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        gcd_ref n = new gcd_ref();
        gcd_ref ob = new gcd_ref();
        
        System.out.println("Enter two numbers:");
        n.a = sc.nextInt();
        n.b = sc.nextInt();
        ob.gcd(n);   
        System.out.println("gcd of two numbers: " );
        System.out.println((ob.gcd(n)).c);
    }
}
