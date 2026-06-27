


import java.util.*;
class one{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a =0,sum = 0;
        
        System.out.println("Enter the n for (1+11+111+1111........n)");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                a = (int)(Math.pow(10,j));
            }
            sum += a;
            System.out.print(sum);
        }
        System.out.println();
    }
}