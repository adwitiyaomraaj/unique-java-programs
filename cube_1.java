


import java.util.*;
class cube_1 {
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the ending value of range");
        int n = sc.nextInt();
        int a=0, b=0,c=0,d=0,x=0,y=0;
        
        for(int i =1; i<=n; i++){
            System.out.print(i+": ");
            a=i*i*i;
            System.out.print(a);
            b=a;
            
            while(b!=0){
                c=b%10;
                d+=c;
                y++;
                
                if(y==1)
                  x=c;
                y=c;
                b=b/10;
            }
            if(a%2==0)
                System.out.println(" "+d);
            else
                System.out.println(" "+(int)Math.abs(x-y));
            d=0;y=0;
        }
    }
}