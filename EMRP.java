


import java.util.*;
class EMRP{
    
    void  check(){
        
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int a =0,b=0,c=0,d=0,rev=0,i;
        b=n;
        
        while(b!=0){
            c=b%10;
            rev = rev*10+c;
            b=b/10;
        }
        
        for(i =1;i<=rev;i++){
            
            if(rev%i==0)
                a++;
        }
        for(i =1;i<=n;i++){
            if(n%i==0)
                d++;
        }
        if(d==2){
            if(a==2){
            
            System.out.println(n+" EMRP no.");
          }
        }
        else{
            System.out.println(n+" is not EMRP no.");
        }
    }
    
    public static void main(String[] args){
        EMRP ob = new EMRP();
        ob.check();
    }
}