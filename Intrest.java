

public class Intrest 
{
    
    public static void main(String args[])
    {
        int p,r,t;
        double si=0.0, amt=0.0;
        p=8000; r=10; t=3;
        si=(p*r*t)/100.0;
        amt=p+si;
        
        System.out.println("Simple Intrest = Rs."+si);
        System.out.println("Amount = Rs."+amt);
    }
}    
