import java.util.*;
class mix{
    String word;
    int len;
    mix(){
        word="";
        len=0;
    }
    void feedword(){
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        len = word.length();
    }
    void mix_word(mix P,mix Q){
        int l = Math.min(P.len,Q.len);
        for(int i=0; i<l;i++){
            word+=""+ P.word.charAt(i)+Q.word.charAt(i);
        }
        if(P.len>Q.len){
            word+=""+P.word.substring(l);
        }
        else{
            word+=""+Q.word.substring(l);
        }
    }
    void display(){
        System.out.println("new word= "+ word);
    }
    public static void main(String[] args){
        mix P = new mix();
        mix Q = new mix();
        mix ob = new mix();
        P.feedword();
        Q.feedword();
        ob.mix_word(P,Q);
        ob.display();
    }
}