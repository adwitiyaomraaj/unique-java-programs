import java.util.*;
class word_potential {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine().trim();
        char last = s.charAt(s.length() - 1);
        if(last == '.' || last == ',' || last == '?' || last == '!') {
            s = s.substring(0, s.length() - 1);
        }
        else{
            System.out.println("Invalid Input. Sentence must end with a punctuation mark.");
            System.exit(0);
        }
        String[] words = s.split(" ");
        int n = words.length;
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            int sum = 0;
            String w = words[i];
            for(int j=0;j<w.length();j++){
                sum += (int)w.charAt(j); 
            }   
            p[i] = sum;
            System.out.println(words[i] + "---" + p[i]);
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(p[j] > p[j+1]){
                    int t = p[j];
                    p[j] = p[j+1];
                    p[j+1] = t;
                    String tempWord = words[j];
                    words[j] = words[j+1];
                    words[j+1] = tempWord;
                }
            }
        }
        String r = "";
        for(int i=0;i<n;i++){
            r += words[i] + " ";
        }
        System.out.println(r);
    }
}