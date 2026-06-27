import java.util.*;
class matrix_fill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (M >= 3 and M < 10): ");
        int m = sc.nextInt();
        if(m<3 || m>=10){
            System.out.println("Size out of range.");
            System.exit(0);
        }
        System.out.print("Enter first character (corners): ");
        char c1 = sc.next().charAt(0);
        System.out.print("Enter second character (boundary): ");
        char c2 = sc.next().charAt(0);
        System.out.print("Enter third character (non-boundary): ");
        char c3 = sc.next().charAt(0);
        char[][] a = new char[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                // Condition 1: The Four Corners
                if((i==0 || i==m-1) && (j==0 || j==m-1)){
                    a[i][j] = c1;
                }
                // Condition 2: The Boundary (excluding corners)
                else if(i==0 || i==m-1 || j==0 || j==m-1){
                    a[i][j] = c2;
                }
                // Condition 3: The Inside (non-boundary)
                else{
                    a[i][j] = c3;
                }
            }
        }
        System.out.println("FORMED MATRIX:");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}