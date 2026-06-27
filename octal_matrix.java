import java.util.*;
class octal_matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M (0<=M<=10) = ");
        int m = sc.nextInt();
        System.out.print("N (2<=N<=6) = ");
        int n = sc.nextInt();
        if(m<0 || m>10 || n<2 || n>6){
            System.out.println("Invalid Input for Matrix Order.");
            System.exit(0);
        }
        int[][] a = new int[m][n];
        System.out.println("Enter elements in the matrix (0-7 only):");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int val = sc.nextInt();
                if(val<0 || val>7){
                    System.out.println("Invalid Octal Digit. Terminating program.");
                    System.exit(0);
                }
                a[i][j] = val;
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Decimal Equivalents:");
        for(int i=0;i<m;i++){
            int dec = 0;
            int power = 0;
            for(int j=n-1;j>=0;j--){
                dec += a[i][j] * (int)Math.pow(8, power);
                power++;
            }
            System.out.println(dec);
        }
    }
}