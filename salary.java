


import java.util.*;
class salary
{
    
    public static void main(String args[])
    {
        
        System.out.println("Salary of the employees");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("basic = ");
        int basic= sc.nextInt();
        float da=(float) (30*basic)/100;
        System.out.println("da salary = "+ da);
        float hra=(float)(12.5*basic)/100;
        System.out.println("hra salary = "+ hra);
        float pf=(float)(10*basic)/100;
        System.out.println("pf salary = "+ pf);
        float gross =(float) basic + da + hra;
        System.out.println("gross salary = "+ gross);
        float net =(float) gross - pf;
        System.out.println("net salary = "+ net);
    }
}