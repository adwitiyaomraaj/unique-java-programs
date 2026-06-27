

import java.util.*;

class a_b{
    
    public static void main(String args[])throws InterruptedException{
        
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        
        if(n == 1){
            
            for(int i = 1; i < 100; i++){
                
                Thread.sleep(1);
                
                System.out.println(i);
            }
        }

        
        sc.close();
    }
}