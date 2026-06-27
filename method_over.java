


import java.util.*;
class method_over {
    
    int add(int a , int b){
        
        return a+b;
    } 
    
    int divide(int a, int b){
        int c =a/b;
        return c;
    }
    
    double letter(String a, String b){
        int c = a.length();
        int d = b.length();
        int e =c+d;
        return e;
    }
    
    public static void main(){
        
        Scanner sc = new Scanner(System.in);
        method_over ob = new method_over();
        ob.add(sc.nextInt(),sc.nextInt());
        ob.divide(sc.nextInt(), sc.nextInt());
        ob.letter(sc.nextLine(), sc.nextLine());
    }
}