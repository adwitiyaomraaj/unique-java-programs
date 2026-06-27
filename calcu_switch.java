


import java.util.*;
class calcu_switch
{
    
    public static void main(String args[])
    {
        
        System.out.println(" 1- Area of triangle");
        System.out.println(" 2- Area of Rectangle");
        System.out.println(" 3- Area of Square");
        System.out.println(" 4- Addition");
        System.out.println(" 5- Subtraction");
        System.out.println(" enter the no. for the following methods"+" "+"like: input: 1  and output: Area of Triangle");    
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        switch (a){
        
            case 1: 
                System.out.println("Area of Triangle:");
                
                System.out.print("Enter the height=");
                double b= sc.nextDouble();
                System.out.print("Enter the base=");
                double c= sc.nextDouble();
                double d= (c/2)*b;
                System.out.println("Area of Triangle =" + " " + d);
            break;
            case 2:
                System.out.println("Area of Rectangle::");
                
                System.out.print("Enter the length=");
                double e= sc.nextDouble();
                System.out.print("Enter the width=");
                double f= sc.nextDouble();
                double g= (e*f);
                System.out.println("Area of Rectangle =" + " " + g);
            break;
            case 3:
                System.out.println("Area of Square:");
            
                System.out.print("Enter the side=");
                double h= sc.nextDouble();
                double i= (h*h);
                System.out.println("Area of Square =" + " " + i);
            break;
            case 4:
                System.out.println("Addition:");
            
                System.out.print("Enter the first value");
                double j= sc.nextDouble();
                System.out.print("Enter the second value");
                double k= sc.nextDouble();
                double l= (j+k);
                System.out.println("Sum =" + " " + l);
            break;
            default:
                System.out.println("Invalid no.");
         }
    }
}