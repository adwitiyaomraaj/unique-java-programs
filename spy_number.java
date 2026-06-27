


import java.util.*;
class spy_number
{
    
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a no. to check");
        int num= sc.nextInt();
        System.out.println("Enter the number of digits in the number provided");
        int digits=sc.nextInt();
        int counter=1;
        int remainder,quotient, product=1, sum=0;
        
        while(digits>=counter)
        {
          remainder=num%10;
          quotient=num/10;
          product*=remainder;
          sum+=remainder;
          num=quotient;
          ++counter;
        }
        
        if(product==sum)
              System.out.println("Given number is a spy number.");
        else
              System.out.println("Given number is not a spy number.");
    }
}