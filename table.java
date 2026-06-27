


import java.util.*;
class table{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. till where you want the table");
        int n=sc.nextInt();
        
        for(int i =1;i<=n;i++){
            System.out.println("Table of:"+ i);
            for(int j =1;j<=10;j++){
                System.out.println(i+"*"+j+"="+" "+i*j);
            }
            System.out.println();
        }
    }
}