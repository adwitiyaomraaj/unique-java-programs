


import java.util.*;
class max
{
    
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the values of A,B,C");
        int A=sc. nextInt();
        int B=sc. nextInt();
        int C=sc. nextInt();
        String d=(A>B && A>C)?"1st no. is greater":((B>A && B>C)?"2nd no. is greater":"3rd no. is greater");
        System.out.println(d);
    }
}