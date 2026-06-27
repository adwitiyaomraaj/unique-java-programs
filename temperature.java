


import java.util.*;
class temperature{
    
    public static void main(String[] arga){
        int x =0;
        int A[] = new int [20];
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter the temperature in ॰F");
        
        for(int i = 0;i<A.length; i++){
            A[i] = sc.nextInt();
        }
        for(int b=0; b<A.length; b++){
            x = (A[b] -32 ) * 5/9;
            System.out.println(A[b]+"॰F:"+" " + x+"॰C");
        }
    }
}