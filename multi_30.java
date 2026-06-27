


import java.util.*;
class multi_30{
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.print("10, ");
        
        for(int i =1; i<=n; i++){
            System.out.print((30*i)+", ");
        }
        System.out.println();
    }
}