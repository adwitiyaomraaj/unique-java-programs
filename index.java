import java.util.*;
class index{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        if(a.length()!=11){
            System.out.println("Invalid input");
            System.exit(0);
        }
        if(a.charAt(7)!='/'){
            System.out.println("Invalid input");
            System.exit(0);
        }
        if(a.charAt(0)=='1')
            System.out.println("EXAM: ICSE");
        else if(a.charAt(0)=='2')
            System.out.println("EXAM: ISC");
        else{
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.println("YEAR: "+a.substring(1,3));
        System.out.println("CENTER: "+a.substring(3,7));
        System.out.println("INDEX NO. : "+a.substring(8));
    }
}