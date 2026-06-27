


import java.util.*;
class Even_Odd
{
    
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the details");
        String a= sc.nextLine();
        System.out.println("Enter the number");
        int b= sc.nextInt();
        String c= (b%2==0)?"The no. is Even":"The no. is Odd";
        System.out.println(c);
    }
}