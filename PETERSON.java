

import java.util.*;
class PETERSON{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=a,x=0,c=0,y=0,sum=0;
        while(b!=0){
            b=b/10;
            x=b%10;
            c++;
        }
        System.out.println(c);
        for(int i=0; i<c; i++){
            for(int j=1; j<=x; j++){
                y *=j;
            }
            sum +=y;
        }
        if(sum==b)
            System.out.println("It is a Peterson Number");
        else
            System.out.println("It is not a Peterson Number");
    }
}