


import java.util.*;
class even_ch{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SENTENCE: ");
        String a = sc.nextLine();
        String en_pass = "";
        int i = 0;
        
        while(i< a.length()){
            
            if(i%2==0){
               char cuChar = a.charAt(i);
               en_pass += cuChar;
           }
           i++;  
        }
        
        System.out.println("EVEN POSITION OF CHARACTERS: " + en_pass);
    }
}

