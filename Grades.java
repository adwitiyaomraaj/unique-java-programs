


import java.util.*;

class Grades {
    
    public static void main (String args[]) {
        
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Grade obtained by student in their results according to their percentage");
        System.out.println("Enter the percentage:");

        
        float a = sc.nextFloat();

        
        String b = (a >= 80) ? "Distinction"
                : (a >= 60 && a < 80) ? "First Division"
                : (a >= 45 && a < 60) ? "Second Division"
                : (a >= 40 && a < 45) ? "Pass"
                : "Promotion Not Granted";

        
        System.out.println("Grade= " + b);

        
        sc.close();
    }
}