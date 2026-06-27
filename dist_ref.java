


import java.util.*;
class dist_ref{
    
    double x=0,y=0,a=0;
    
    dist_ref dist(dist_ref p1, dist_ref p2){
       dist_ref d = new dist_ref();
       d.a=Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2));
       
       return d;
    }
    
    public static void main(){
        
        Scanner sc = new Scanner(System.in);
        dist_ref p1 = new dist_ref();
        dist_ref p2 = new dist_ref();
        dist_ref ob = new dist_ref();
        
        System.out.println("Enter the coordinate of point 1");
        p1.x = sc.nextDouble();
        p1.y = sc.nextDouble();
        System.out.println("Enter the coordinate of point 2");
        p2.x = sc.nextDouble();
        p2.y = sc.nextDouble();
        ob.dist(p1,p2);
        System.out.println("Distance between two coordinates:");
        System.out.println((ob.dist(p1,p2)).a);
    }
}