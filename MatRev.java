import java.util.*;
class MatRev{
    int m,n,arr[][];
    MatRev(int mm, int nn){
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    int reverse(int x){
        int b=0;
        int rev=0;
        while(x!=0){
            b=x%10;
            rev=rev*10+b;
            x=x/10;
        }
        return rev;
    }
    void revMat(MatRev P){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=reverse(P.arr[i][j]);
            }
        }
    }
    void show(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        MatRev C = new MatRev(a,b);
        MatRev D = new MatRev(a,b);
        C.fillarray();
        D.revMat(C);
        C.show();
        System.out.println();
        D.show();
    }
}