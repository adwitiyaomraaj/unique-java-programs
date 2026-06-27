


import java.util.*;
class contents{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the sentence to know its contents");
        String S = sc.nextLine();
        int a = 0;
        int b = 0;
        int c = 0;
        int i = 0;
        
        while(i < S.length()){
            char e = S.charAt(i);
            
            if((e>='A' && e<='Z')||(e>='a' && e<='z'))
                a++;
            
            else if(e>='0' && e<='9')
                b++;
            else
                c++;
            i++;
        }
        System.out.println("Number of Digits-"+" "+b);
        System.out.println("Number of Alphabets-"+" "+a);
        System.out.println("Number of Special Characters-"+" "+c);
    }
}