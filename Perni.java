


import java.util.*;
class Perni{
    
    int num;
    Perni(){
        num=0;
    }
    
    void accept(){
        
        Scanner sc = new Scanner(System.in);
        int b=0,c=0;
        
        System.out.println("Enter the binary number");
        num = sc.nextInt();
        
        if(num<10)
          System.exit(0);
        b=num;
        
        while(b!=0){
           c=b%10;
           if(c!=1 && c!=0)
             System.exit(0);
           b=b/10;
        }
    }
    
    int countOne(int k){
        int b=0,c=0,x=0;
        b=num;
        while(b!=0){
            c=b%10;
            if(c==1)
              x++;
            b=b/10;
        }
        k=x;
        
        return k;
    }
    
    void check(){
        int a = countOne(num);
        int x=0;
        
        for(int i=1;i<=a;i++){
            if(a%i==0)
              x++;
        }
        if(x==2)
           System.out.println("It is a pernicious number");
        else
           System.out.println("It is not a pernicious number");
    }
    
    public static void main(String args[]){
        Perni ob = new Perni();
        ob.accept();
        ob.check();
    }
}