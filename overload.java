


import java.util.*;
class overload{
    
    void o(int a){
        System.out.print("10, ");
        
        for(int i =1; i<=a; i++)
        System.out.print((30*i)+", ");
        
        System.out.println();
    }
    
    void ov(int b){
        for(int i =1; i<=b; i++)
        System.out.print((int)Math.pow(i,2)+", ");
        System.out.println();
    }
    
    void ove(int c){
        for(int i =1; i<=c; i++)
        System.out.print((int)Math.pow(i,3)+", ");
        System.out.println();
    }
    
    void over(int d){
        for(int i =1; i<=d; i++)
        System.out.print((int)(Math.pow(i,3)+1)+", ");
        System.out.println();
    }
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        overload obj = new overload();
        obj.o(n);
        obj.ov(n);
        obj.ove(n);
        obj.over(n);
        sc.close();
    }
}