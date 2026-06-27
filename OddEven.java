import java.util.*;
class OddEven{
    Scanner sc = new Scanner(System.in);
    int a[],m;
    OddEven(int mm){
        m=mm;
        a= new int[m];
    }
    void fillarray(){
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
           a[i]=sc.nextInt();
    }
    OddEven arrange(OddEven P, OddEven Q){
        OddEven ar = new OddEven(P.m + Q.m);
        int c=0;
        for(int i=0;i<P.m;i++){
            if(P.a[i]%2!=0){
                ar.a[c]=P.a[i];
                c++;
            }
        }
        for(int i=0;i<Q.m;i++){
            if(Q.a[i]%2!=0){
                ar.a[c]=Q.a[i];
                c++;
            }
        }
        for(int i=0;i<P.m;i++){
            if(P.a[i]%2==0){
                ar.a[c]=P.a[i];
                c++;
            }
        }
        for(int i=0;i<Q.m;i++){
            if(Q.a[i]%2==0){
                ar.a[c]=Q.a[i];
                c++;
            }
        }
        return ar;
    }
    void display(){
        for(int i=0;i<m;i++)
           System.out.print(a[i]+",");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int x = sc.nextInt();
        System.out.println("Enter size of second array");
        int y = sc.nextInt();
        OddEven A = new OddEven(x);
        OddEven B = new OddEven(y);
        System.out.println("Enter values of first array");
        A.fillarray();
        System.out.println("Enter values of second array");
        B.fillarray();
        OddEven ar = new OddEven(x+y);
        ar = ar.arrange(A, B);
        System.out.println("Arranged Array:");
        ar.display();
    }
}