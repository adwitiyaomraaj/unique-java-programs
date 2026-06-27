


import java.util.*;
class area_ref{
    
    int a =0;
    static double ar=0;
    
    void input(int x){
        a=x;
    }
    
    area_ref area(area_ref o1, area_ref o2){
        
        area_ref o3 = new area_ref();
        double s = (a + o1.a + o2.a)/2.0;
        o3.ar= Math.sqrt(s*(s-a)*(s-o1.a)*(s-o2.a));
        
        return o3;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        area_ref f = new area_ref();
        area_ref f1 = new area_ref();
        area_ref f2 = new area_ref();
        System.out.println("Enter the second side");
        f1.a = sc.nextInt();
        System.out.println("Enter the third side");
        f2.a = sc.nextInt();
        f.input(5);
        f.area(f1,f2);
        System.out.println((f.area(f1,f2)).ar);
    }
}