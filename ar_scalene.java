


import java.util.*;
class ar_scalene{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ente the length of side(cm)");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int s = (a+b+c)/2;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area="+" "+ar+"cm sq.");
    }
}