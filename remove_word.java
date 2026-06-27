import java.util.*;
class remove_word{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.next();
        String[] word = a.split(" ");
        System.out.print("index removed:");
        for(int i=0;i<word.length;i++){
            if(b.equalsIgnoreCase(word[i])){
                word[i]="";
                System.out.print((i+1)+" ");
            }
        }
        System.out.println();
        for(int i=0;i<word.length;i++){
            if(!word[i].equals(""))
                System.out.print(word[i]+" ");
        }
        System.out.println();
    }
}