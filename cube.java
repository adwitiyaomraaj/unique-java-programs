


import java.util.*;
class cube{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the ending value of range");
        int n = sc.nextInt();
        int a=0, b=0, c=0, d=0, x=0, y=0;
        
        for(int i=1; i<=n; i++){
            System.out.print(i+": ");
            a=i*i*i;
            System.out.print(a);
            
            if(a%2==0){
                b=a;
                
                while(b!=0){
                    c=b%10;
                    d+=c;
                    b=b/10;
                }
                System.out.println(" "+d);
                d=0;
            }
            else{
                b=a;
                while(b!=0){
                    c=b%10;
                    d++;
                    if(d==1)
                      x=c;
                    y=c;
                    b=b/10;
                }
                d=0;
                double m = Math.abs(x-y);
                System.out.println(" "+(int)m);
            }
        }
    }
}