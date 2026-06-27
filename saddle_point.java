import java.util.*;
class saddle_point {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (M): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (N): ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter elements in the matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int saddleCount = 0;
        for(int i=0;i<m;i++){
            int min = a[i][0];
            int colIndex = 0;            
            for(int j=1;j<n;j++){
                if(a[i][j]<min){
                    min = a[i][j];
                    colIndex = j;
                }
            }
            int flag = 0; 
            for(int k=0;k<m;k++){
                if(a[k][colIndex]>min){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Saddle point = " + min);
                saddleCount++;
            }
        }
        if(saddleCount==0){
            System.out.println("No saddle point");
        }
    }
}