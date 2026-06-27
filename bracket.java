/*
 * *Accept a sentence terminated by ., ?, or !. The sentence may contain any of the brackets (), {}, [] plus letters/spaces.
 It must not contain any special characters — if it does, display “invalid output”.

 Tasks:
 A. Check if the brackets are balanced
 B. Print the maximum nesting depth of brackets 
 C. If unbalanced, print the index of the first error 

A mismatch / extra closing bracket is an error. 
If the brackets are incomplete at the terminator, the first error is the index of the first bracket that cannot be matched.
 */
import java.util.*;
class bracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char p=a.charAt(a.length()-1);
        if(p!='.'&&p!='?'&&p!='!'){
            System.out.println("Invalid sentence. It must end with '.', '?' or '!'");
            System.exit(0);
        }
        int b=0,c=0,d=0,m=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch=='('||ch=='{'||ch=='['||ch==')'||ch=='}'||ch==']')
               m++;
            if(ch=='(')
               b++;
            if(ch==')')
               b--;
            if(ch=='{')
               c++;
            if(ch=='}')
               c--;
            if(ch=='[')
               d++;
            if(ch==']')
               d--;
            if(b<0||c<0||d<0){
                System.out.println("error at index "+i);
                System.exit(0);
            }
        }
        if(b==0&&c==0&&d==0){
            System.out.println("balanced - yes");
            System.out.println("max depth : "+m/2);
        }
        else{ 
            System.out.println("unbalanced - brackets missing");
        }
    }
}