


import java.util.*;
class series_cube$1{
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        
        for(int i =1; i<=n; i++){
            System.out.print((int)(Math.pow(i,3)+1)+", ");
        }
        System.out.println();
    }
}