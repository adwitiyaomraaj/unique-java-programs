


import java.util.*;
class pal_prime{
    
    void check(){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a=0, b=0, c=0, rev=0;
        b=n;
        
        while(b!=0){
            c=b%10;
            rev=rev*10+c;
            b=b/10;
        }
        
        for(int i=1;i<=n;i++){
            
            if(n%i==0){
                a++;
            }
        }
        if(n ==rev && a==2)
           
           System.out.println(n+" is a palprime no.");
        else
           System.out.println(n+" is a palprime no.");
    }
    
    public static void main(String[] args){
        pal_prime ob = new pal_prime();
        ob.check();
    }
}