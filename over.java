


import java.util.*;
class over{
    
    Scanner sc= new Scanner(System.in);
    
    int n = sc.nextInt();
    
    void o(){
        System.out.print("10, ");
        
        for(int i =1; i<=n; i++)
        System.out.print((30*i)+", ");
        
        System.out.println();
    }
    
    void ov(){
        for(int i =1; i<=n; i++)
        System.out.print((int)Math.pow(i,2)+", ");
        System.out.println();
    }
    
    void ove(){
        for(int i =1; i<=n; i++)
        System.out.print((int)Math.pow(i,3)+", ");
        System.out.println();
    }
    
    void over(){
        for(int i =1; i<=n; i++)
        System.out.print((int)(Math.pow(i,3)+1)+", ");
        System.out.println();
    }
    
    public static void main(String[] args){
        over obj = new over();
        obj.o();
        obj.ov();
        obj.ove();
        obj.over();
    }
}