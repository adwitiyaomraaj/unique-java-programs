import java.util.*;
class pali_boolean{
    String a="",b="",rev="";
    Scanner sc = new Scanner(System.in);
    void accept(){
        a=sc.nextLine(); 
    }
    boolean check(){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=' ')
               b+=a.charAt(i);
        }
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)!=' ')
               rev+=a.charAt(i);
        }
        if(rev.equalsIgnoreCase(b))
            return true;
        else
            return false;
    }
    void display(){
        if(check()==true)
           System.out.println("It is a palindrome");
        else
           System.out.println("It is not a palindrome");
    }
    public static void main(String[] args){
        pali_boolean ob = new pali_boolean();
        ob.accept();
        ob.display();
    }
}