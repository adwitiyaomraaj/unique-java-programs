


import java.util.*;
class suc_per{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a positive even or negative odd number only");
        int a= sc.nextInt();
        int d, e;
        
        if(a>0 && a%2==0){
            System.out.println("Enter the number of succedings you want");
            long b= sc.nextLong();
            
            for(d=1;d<=b;d++){
                int x= d*2;
                int g = a + x;
                System.out.println(g);
            }
        }
          
          else if(a<0 && a%2!=0){
            System.out.println("Enter the number of precedings you want");
            long y= sc.nextLong();
            for(e=1;e<=y;e++){
                int c= e*-2;
                int f= a+c;
                System.out.println(f);
            }
             }
            
        else
            System.out.println("The number is nither a positive even nor a negative odd");
    }
}
