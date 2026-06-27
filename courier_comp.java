


import java.util.*;
class courier_comp
{
    
    public static void main (String args[])
    {
        
        System.out.println("Enter the Wt. of parcel=");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Wt. of parcel="+" "+a+"gm");
        int O = (a<=100)?80:((a>=101&&a<=500)?150:((a>=501&&a<=1000)?210:250));
        System.out.println("For Ordinary booking="+" "+"Rs."+O);
        int E = (a<=100)?100:((a>=101&&a<=500)?200:((a>=501&&a<=1000)?250:300));
        System.out.println("For Express booking="+" "+"Rs."+E);
    }
}
