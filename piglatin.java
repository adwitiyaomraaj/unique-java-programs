


import java.util.*;
class piglatin{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" check whether the word is piglatin or not");
        String a = sc.nextLine();
        a = a.toLowerCase();
        int l = a.length();
        boolean flag = false;
        
        for(int i = 0;i<l;i++){
            char c = a.charAt(i);
            
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
                System.out.println(a.substring(i) + a.substring(0,i) + "ay");
                flag = true;
                break;
            }
        }
        if(flag== false)
            System.out.println("not piglatin");
    }
}