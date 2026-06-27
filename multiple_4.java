


import java.util.*;
class multiple_4{
    
    public static void main(String[] args){
        int A[] = new int[20];
        int i;
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter any 20 numbers");
        
        for(i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Multiple of 4 is:");
        for(i=0; i<A.length; i++)
            
            if(A[i] %4 ==0)
              System.out.println(A[i]);
    }
}