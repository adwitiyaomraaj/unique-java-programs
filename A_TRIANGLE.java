


import java.util.*;
class A_TRIANGLE
{
    
    public static void main(String args[])
    {
        
        System.out.println("Find the area of triangle");
        System.out.println("Side c= base");
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Side a");
        double a=sc.nextDouble();
        System.out.println("Enter the Side b");
        double b=sc.nextDouble();
        System.out.println("Enter the Side c");
        double c=sc.nextDouble();
        String d = (a==b && b==c && c==a)?"It is an equilateral triangle":((a==b||b==c||c==a)?"It is an isoceles triangle":"It is a scalene triangle");
        System.out.println(d);
        double S =(double)(a+b+c)/2;
        double e = (a==b && b==c && c==a)? (Math.sqrt(3))/4*(a*a) :((a==b||b==c||c==a)? (c/4*Math.sqrt((4*a*a)*(b*b))) :(Math.sqrt(S*(S-a)*(S-b)*(S-c))));
        System.out.println("Area of triangle = "+e);
    }
}