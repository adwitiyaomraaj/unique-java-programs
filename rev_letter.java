import java.util.*;
class rev_letter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] word = a.split(" ");
        for(int i=0;i<word.length;i++){
            String b = word[i];
            int x=0;
            if(b.length()%2!=0)
               x=b.length()-1;
            else
               x=b.length();
            for(int j=0;j<x;j+=2){
                System.out.print(b.charAt(j+1));
                System.out.print(b.charAt(j));
            }
            if(b.length()%2!=0)
               System.out.print(b.charAt(b.length()-1));
            System.out.print(" ");
        }
        System.out.println();
    }
}