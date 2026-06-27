


import java.util.*;
class factorial{
    
    public int fact(int x){
        int f=1,i;
        
        for(i=1;i<=x;i++)
        f*=i;
        
        return(f);
    }
    
    public static void main(String args){
        factorial ob= new factorial();
        int n= 5,m=8;
        int p = ob.fact(n);
        
        System.out.println("Fact. of"+n+"is"+p);
        int q = ob.fact(m);
        System.out.println("Fact. of"+m+"is"+q); 
        
    
        
    }
}