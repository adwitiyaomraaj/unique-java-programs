import java.util.*;
class sort_diag_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M (Must be > 3 and < 10): ");
        int m = sc.nextInt();
        if(m<=3 || m>=10){
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");
            System.exit(0);
        }
        int[][] a = new int[m][m];
        System.out.println("Enter elements in the matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int size = (m-2)*(m-2);
        int[] nb = new int[size];
        int k = 0;
        for(int i=1;i<m-1;i++){
            for(int j=1;j<m-1;j++){
                nb[k++] = a[i][j];
            }
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(nb[j]>nb[j+1]){
                    int temp = nb[j];
                    nb[j] = nb[j+1];
                    nb[j+1] = temp;
                }
            }
        }
        k = 0;
        for(int i=1;i<m-1;i++){
            for(int j=1;j<m-1;j++){
                a[i][j] = nb[k++];
            }
        }
        System.out.println("REARRANGED MATRIX");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("DIAGONAL ELEMENTS");
        int sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==j || i+j==m-1){
                    System.out.print(a[i][j]+"\t");
                    sum += a[i][j];
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("SUM OF THE DIAGONAL ELEMENTS = " + sum);
    }
}