


import java.util.*;
class triangle
{
    
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the three angles");
        System.out.println("Enter the details");
        String a= sc.nextLine();
        System.out.println("Enter the angle 1");
        int A=sc.nextInt();
        System.out.println("Enter the angle 2");
        int B=sc.nextInt();
        System.out.println("Enter the angle 3");
        int C=sc.nextInt();
        String s =(A<90 && B<90 && C<90)?"it is an acute angled triangle":((A>90 && A<180 || B>90 && B<180 || C>90 && C<180)?"it is an obtuse angled triangle":((A==90 || B==90 || C==90)?"it is a right angled triangle":"triangle is not valid"));
        System.out.println(s);
        }
}

