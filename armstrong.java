

class armstrong{
    
    public static void main(int n){
        int a,num;
        double s=0;
        num=n;
        
        while(n>0)
        {
            a=n%10;
            s=s+Math.pow(a,3);
            n=n/10;
        }
        
        if(num==s)
        
        System.out.println("tis");
        else
        System.out.println("tis not");
    }
}