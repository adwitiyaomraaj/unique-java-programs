


import java.util.*;
class S_I__CON_TYPE
{
    
    public static void main (String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the details");
        String s= sc.nextLine();
        System.out.println("PRINCIPAL:");
        int P= sc.nextInt();
        System.out.println("RATE:");
        float R= sc.nextFloat();
        System.out.println("TIME:");
        int T= sc.nextInt();
        double A= (double)(P*R*T)/100;
        System.out.println("S.I.="+" "+"Rs."+A);
        double B= (double)P+A;
        System.out.println("AMOUNT="+" "+"Rs."+B);
    }
}