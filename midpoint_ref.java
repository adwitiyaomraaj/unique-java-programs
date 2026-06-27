


import java.util.*;
class midpoint_ref{

	double x=0, y=0,a=0,b=0;

	midpoint_ref point(midpoint_ref p1, midpoint_ref p2) {
        midpoint_ref mid = new midpoint_ref();
		mid.x = (p1.x + p2.x) / 2;
		mid.y = (p1.y + p2.y) / 2;
        
        
        return mid;
	}

	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		midpoint_ref f1 = new midpoint_ref();
		midpoint_ref f2 = new midpoint_ref();
		

		
        System.out.println("Enter coordinates of point 1 (x y): ");
		f1.x = sc.nextDouble();
        f1.y = sc.nextDouble();
        System.out.println("Enter coordinates of point 2 (x y): ");
		f2.x = sc.nextDouble();
        f2.y = sc.nextDouble();
        
        
        midpoint_ref obj = new midpoint_ref();
        obj.point(f1, f2);
		System.out.println((obj.point(f1,f2)).x);
        System.out.println((obj.point(f1,f2)).y);
        
        sc.close();
	}
}