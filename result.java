

class result
{
    
    public static void main(String args[])
    {
        int a=10, b=20, c=30;
        double d=(double)(a++/b++ * --c);
        
        System.out.println(d);
    }
}