


import java.util.*;
class Perfect_Buzz {
    
    public static void main(String[] args) {
        int[] A = new int[20];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any 20 numbers:");
        
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter 1 to store all perfect numbers");
        System.out.println("Enter 2 to store all Buzz numbers");
        int x = sc.nextInt();
        
        switch (x) {
            case 1:
                System.out.println("Perfect numbers are:");
                for (int b = 0; b < A.length; b++) {
                    int y = 0;
                    for (int i = 1; i < A[b]; i++) {
                        
                        if (A[b] % i == 0) {
                            y += i;
                        }
                    }
                    if (y == A[b] && A[b] != 0) {
                        System.out.println(A[b]);
                    }
                }
                break;
                
            case 2:
                System.out.println("Buzz numbers are:");
                for (int c = 0; c < A.length; c++) {
                    if (A[c] % 10 == 7 || A[c] % 7 == 0) {
                        System.out.println(A[c]);
                    }
                }
                break;
                
            default:
                System.out.println("Wrong Choice");
        }
    }
}