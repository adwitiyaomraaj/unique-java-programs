


import java.util.*;
class neg_pos{
    
    public static void main(String[] args){
        int A[]= new int[10];
        int i,x=0,y=0;
        
        System.out.println("Enter any 10 numbers");
        
        Scanner sc =new Scanner(System.in);
        
        for( i =0; i< A.length; i++){
            A[i] = sc.nextInt();
        }
        for(i=0; i<A.length; i++)
            
            if(A[i] < 0)
                System.out.println(A[i]);
        for(i=0; i<A.length; i++)
            if(A[i] > 0)
                System.out.println(A[i]);
    }
}
