


import java.util.*;
class Discounts
{
    
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Discounts given to some costs");
        System.out.println("Enter the cost of item:");
        int a=sc.nextInt();
        int b=(a<=2000)? 5:((a>=2001 && a<=5000)? 10:((a>=5001 && a<10000)?15:20));
        String e=(a<=2000)?"your festive gift is a:\t CALCULATOR":((a>=2001 && a<=5000)? "your festive gift is a:\t SCHOOL BAG":((a>=5001 && a<10000)?"your festive gift is a:\t WALL CLOCK":"your festive gift is a:\t WRIST WATCH"));
        System.out.println(e);
        System.out.println("Discount applied="+" "+b+"%");
        double c=(double)(a*b)/100;
        System.out.println("Discount Amount="+" "+"RS."+c);
        double d=(double)a-c;
        System.out.println("Final Amount="+" "+"RS."+d);
    }
}