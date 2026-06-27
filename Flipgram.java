import java.util.*;
class Flipgram{
    String word;
    Flipgram(String S){
        word = S.toUpperCase();
    }
    boolean ishetro(){
        int c[] = new int[26];
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            int d = ch - 65;
            c[d]++;
            if(c[d] > 1){
                return false;
            }
        }
        return true;
    }
    String flip(){
        int l = word.length();
        String b= "";
        int a = l / 2;
        if(l % 2 == 0){
            b = b + word.charAt(a);
        }
        for(int i = a + 1; i<l; i++){
            b = b+ word.charAt(i);
        }
        if(l % 2 != 0){
            b = b + word.charAt(a);
        }
        for(int i = 0; i < a; i++){
            b = b + word.charAt(i);
        }
        return b;
    }
    void display(){
        System.out.println("Word : " + word);
        if(ishetro()==true){
            System.out.println("It is a HETEROGRAM");
        }
        else{
            System.out.println("flipped word: " + flip());
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String S = sc.nextLine();
        Flipgram ob = new Flipgram(S);
        ob.display();
    }
}