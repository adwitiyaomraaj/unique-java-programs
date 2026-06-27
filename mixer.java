import java.util.*;
class mixer{
    int ar[],arr[];
    int n;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int m = sc.nextInt();
        ar = new int[m];
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the size of first array");
        int k = sc.nextInt();
        arr = new int[k];
        System.out.println("Enter the elements");
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the n th term");
        n=sc.nextInt();
    }
    void combine(){
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+","+arr[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args){
        mixer ob = new mixer();
        ob.input();
        ob.combine();
    }
}