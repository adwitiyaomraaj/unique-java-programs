


import java.util.*;
class sum_ref{
    
    int a=0,b=0,c=0;
    
    sum_ref sum(sum_ref n){
        sum_ref s= new sum_ref();
        s.c=n.a+n.b;
        
        return s;
    }
    
    public static void main(){
        
        Scanner sc = new Scanner(System.in);
        sum_ref n = new sum_ref();
        sum_ref ob = new sum_ref();
        n.a= sc.nextInt();
        n.b= sc.nextInt();
        ob.sum(n);
        
        System.out.println((ob.sum(n)).c);
    }
}