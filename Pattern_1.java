


import java.util.*;
class Pattern_1{
    
    public static void main(String args[]) throws InterruptedException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the value till you want");
        long a = sc.nextLong();
        System.out.println("Starting:");
        Thread.sleep(6000);
        System.out.println("Initializing the program:");
        Thread.sleep(6000);
        System.out.println("1%");
        Thread.sleep(2000);
        System.out.println("23%");
        Thread.sleep(2000);
        System.out.println("38%");
        Thread.sleep(2000);
        System.out.println("56%");
        Thread.sleep(2000);
        System.out.println("79%");
        Thread.sleep(2000);
        System.out.println("88%");
        Thread.sleep(2000);
        System.out.println("100%");
        Thread.sleep(6000);
        System.out.println("Initializing done:");
        Thread.sleep(6000);
        System.out.println( );
        System.out.println("RESULTS:");
        
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++)
                   System.out.print(j);
                System.out.println( );
        }
    }
}