


import java.util.*;
class fibonacci{
  
  public static void main( String [] args){
    
    Scanner sc = new Scanner(System.in);
    int a =0,b=1,s=0;
    
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    
    for(int i = 0;i<n;i++){
        s=a+b;
        a=b;
        System.out.print(a+",");
        b=s;
    }
    System.out.println();
  }
}