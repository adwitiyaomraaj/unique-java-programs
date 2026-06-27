


import java.util.*;
class idk{
    
    idk(int a, int b){
        int c = a+b;
        
        System.out.println(c);
    }
    idk(int a){
        double b= Math.sqrt(a);
        System.out.println(b);
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        idk ob = new idk(sc.nextInt(),sc.nextInt());
        
        idk ob1 = new idk(sc.nextInt());

    }
}