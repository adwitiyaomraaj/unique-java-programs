


import java.util.*;
class Diamond {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (odd number): ");
        int rows = sc.nextInt();

        int n = rows / 2 + 1;

        
        for (int i = 1; i <= n; i++) {
            
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        
        for (int i = n - 1; i >= 1; i--) {
            
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
