


import java.util.*;
class hcf_ref {
    
    int a = 0, b = 0, c = 0;
    
    hcf_ref hcf(hcf_ref n) {
        hcf_ref d = new hcf_ref();
        int max;
        
        if (n.a > n.b)
            max = n.a;
        else
            max = n.b;
        
        for (int i = 1; i <= max; i++) {
            if (n.a % i == 0 && n.b % i == 0)
                d.c = i;
        }
        
        return d;
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        hcf_ref n = new hcf_ref();
        hcf_ref ob = new hcf_ref();
        
        System.out.println("Enter two numbers:");
        n.a = sc.nextInt();
        n.b = sc.nextInt();
        ob.hcf(n);   
        System.out.println("HCF of two numbers: " );
        System.out.println((ob.hcf(n)).c);
    }
}
