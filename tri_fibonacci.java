


import java.util.*;
class tri_fibonacci {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int a = 0, b = 0, c = 1;
        System.out.print("0,");
        
        for (int i = 0; i < n-1; i++) {
            int s = a + b + c;
            a = b;
            System.out.print(a + ",");
            b = c;
            c = s;
        }
        System.out.println();
    }
}
