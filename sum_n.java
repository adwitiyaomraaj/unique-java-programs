


import java.util.*;
class sum_n{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a =0,sum = 0, x=0;
        
        System.out.println("Enter the n for (1+(1+2)+(1+2+3)+(1+2+3+4)........n)");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>=0;j--){
                a += j;
                
                
                
            }
            n--;
            
            
        }
        sum += a;
            System.out.println(sum);
        System.out.println();
    }
}