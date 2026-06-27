


import java.util.*;
class odd_even{
    
    public static void main(String[] arga){
        int x =0,y=0;
        int A[] = new int [20];
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter the numbers");
        
        for(int i = 0;i<A.length; i++){
            A[i] = sc.nextInt();
        }
        for(int b=0; b<A.length; b++){
            
            if(A[b] % 2 ==0){
                x += A[b];
            }
            if(A[b] %2 !=0){
                y += A[b];
            }
        }
        System.out.println("even:" + x);
        System.out.println("odd:" + y);
    }
}