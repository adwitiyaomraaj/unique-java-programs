


import java.util.*;
class expression
{    
    
    public static void main(String args[])
    {
        
        System.out.println("Expression="+" "+"1/a^2 + 1/b^3 + 1/c^4");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        double d = (double)((1/(Math.pow(a,2)))+(1/(Math.pow(b,3)))+(1/(Math.pow(c,4))));
        System.out.println("Answer ="+d);
    }
}