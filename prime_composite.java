


import java.util.*;
class prime_composite{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int i,x=0,y=0;
        
        for(i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        for(i=0;i<A.length;i++){
            for(int a=2;a<10;a++){
                
                if(A[i]>=2 && A[i]%a!=0){
                    if(A[i]%1==0 && A[i]%A[i]==0){
                       x = A[i];
                       y++;
                    }
                }
            }
        }
        
        System.out.println(x);
    }
}