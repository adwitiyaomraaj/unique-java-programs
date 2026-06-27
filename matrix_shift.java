import java.util.*;
class matrix_shift {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M (Rows): ");
        int m = sc.nextInt();
        System.out.print("N (Columns): ");
        int n = sc.nextInt();
        if(m <= 2 || m >= 10 || n <= 2 || n >= 10){
            System.out.println("SIZE OUT OF RANGE");
            System.exit(0);
        }
        int[][] a = new int[m][n];
        System.out.println("ENTER ELEMENTS IN THE MATRIX:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        // Step 1: Extract the very first row and store it safely in a 1D array
        int[] temp = new int[n];
        for(int j=0; j<n; j++){
            temp[j] = a[0][j];
        }
        // Step 2: Shift all the remaining rows UP by exactly one position
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n; j++){
                a[i][j] = a[i+1][j]; 
            }
        }
        // Step 3: Drop the original first row into the newly emptied bottom row
        for(int j=0; j<n; j++){
            a[m-1][j] = temp[j];
        }
        System.out.println("MATRIX AFTER ROW SHIFT:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}