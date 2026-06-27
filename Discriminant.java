


import java.util.*;
 class Discriminant
 {
        
        public static void main(String[] args) 
        {
          
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the coefficient a: ");
          double a = sc.nextDouble();
          System.out.print("Enter the coefficient b: ");
          double b = sc.nextDouble();
          System.out.print("Enter the coefficient c: ");
          double c = sc.nextDouble();
          double d =  Math.pow(b, 2) - (4 * a * c);
          
          System.out.println("The discriminant is=" + d);
    }
}