


import java.util.*;
class Avg_5marks
{
    
    public static void main (String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("NOTE: Enter the marks out of 100");
        System.out.println("Enter the details");
        String a= sc.nextLine();
        System.out.println("Name the subject 1");
        String b= sc.nextLine();
        System.out.println("ENTER MARKS:");
        int A= sc.nextInt();
        System.out.println("Name the subject 2");
        String c= sc.nextLine();
        System.out.println("ENTER MARKS:");
        int B= sc.nextInt();
        System.out.println("Name the subject 3");
        String d= sc.nextLine();
        System.out.println("ENTER MARKS:");
        int C= sc.nextInt();
        System.out.println("Name the subject 4");
        String e= sc.nextLine();
        System.out.println("ENTER MARKS:");
        int D= sc.nextInt();
        System.out.println("Name the subject 5");
        String f= sc.nextLine();
        System.out.println("ENTER MARKS:");
        int E= sc.nextInt();
        int total= A+B+C+D+E;
        System.out.println("Total="+" "+total);
        double F= (double)total/5;
        System.out.println("AVG.="+" "+F);
    }
}