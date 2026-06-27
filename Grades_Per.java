


import java.util.*;
class Grades_Per
{
    
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        System. out. println("Note: Give marks out of 100");
        
        System.out.println("Enter marks of subject 1");
        int a= sc.nextInt();
        System.out.println("Enter marks of subject 2");
        int b= sc.nextInt();
        System.out.println("Enter marks of subject 3");
        int c= sc.nextInt();
        System.out.println("Enter marks of subject 4");
        int d= sc.nextInt();
        System.out.println("Enter marks of subject 5");
        int e= sc.nextInt();
        int f=a+b+c+d+e;
        int g=500;
        System.out.println("Marks Scored="+" "+f);
        System.out.println("Total Marks="+" "+g);
        double h=(double)(f/g)*100;
        System.out.println("Percentage="+" "+h+"%");
        char i=(h>=90)?'A':((h>=75 && h<90)?'B':((h>=60 && h<75)?'C':((h>=45 && h<60)?'D':((h>=35 && h<45)?'E':'F'))));
        System.out.println("Grade="+" "+i);
    }
} 