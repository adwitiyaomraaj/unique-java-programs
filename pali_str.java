import java.util.*;
class pali_str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        String b="",rev="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=' ')
                b+=a.charAt(i);
        }
        b=b.trim();
        for(int i= b.length()-1;i>=0;i--){
            rev+=b.charAt(i);
        }
        if(rev.equalsIgnoreCase(b)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
        String[] word =a.split(" ");
        for(int i=0;i<word.length;i++){
            int c=1;
            if(word[i].equals(" "))
               continue;
            for(int j=i+1;j<word.length;j++){
                if(word[i].equalsIgnoreCase(word[j])){
                    c++;
                    word[j]=" ";
                }
            }
            if(c>1){
                System.out.println("repeated words: ");
                System.out.println(word[i]+"= "+c );
            }
        }
    }
}