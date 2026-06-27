import java.util.*;
class remove_index{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        String b = sc.nextLine();
        String[] no = b.split(" ");
        String[] word = a.split(" ");
        for(int i=0;i<no.length;i++){
            String c = no[i];
            for(int j=0;j<c.length();j++){
                char n =c.charAt(j);
                if(!Character.isDigit(n))
                    System.exit(0);
            }
            int d = Integer.parseInt(c);
            if (d >= 1 && d <= word.length) {
                word[d - 1] = ""; 
            }
        }
        for (int i = 0; i < word.length; i++) {
            if (!word[i].equals("")) {
                System.out.print(word[i] + " ");
            }
        }
        System.out.println();
    }
}