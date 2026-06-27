


import java.util.*;
class check_prime{
    
    void check(){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a =0;
        
        for(int i =1;i<=n;i++){
           
           if(n%i==0)
             a++;
            }
        if(a==2){
           
           System.out.println(a+": is prime");
        }
    }
      
      public static void main(String[] args){
      check_prime ob = new check_prime();
        ob.check();
    }
}