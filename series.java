


import java.util.*;
class series
{
    
    public static void main(String args[])
    {
     
     Scanner sc = new Scanner(System.in);
     int a;
     double c= 0;
     
     System.out.println("Enter the value of n");
     int b= sc.nextInt();
     
     for(a=1;a<=b;a++)
     c= c+1.0/Math.pow(2,a);
     System.out.println("The sum of series="+" "+c);
    }
}
