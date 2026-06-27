


import java.util.*;
class hamming_no{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a positive number");
        int a = sc.nextInt();
        
        if(a<0){
          System.out.println("Number given is negative");  
          System.exit(0);
        }
        int b=a;
        System.out.print(a+"= ");
        
        while(b!=1){
            if(b%2==0){
                b=b/2;
                System.out.print("* 2 ");
            }
            
            else if(b%3==0){
                b=b/3;
                System.out.print("* 3 ");
            }
            
            else if(b%5==0){
                b=b/5;
                System.out.print("* 5 ");
            }
            else{
                
                for(int i=2;i<=b;i++){
                    if(b%i==0){
                        System.out.print("* "+i);
                        b=b/i;
                        i=2;
                    }
                }
                System.out.println();
                System.out.println(a+" is not a hamming no.");
                System.exit(0);
            }
        }
        System.out.println();
        System.out.println(a+" is a hamming no");
    }
}