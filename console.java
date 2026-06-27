


import java.util.*;
class console
{
    
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the Details");
        String s = sc.nextLine();
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The sum="+" "+c);
    }
}