


import java.util.*;
class change{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String s,w="",s1="";
        int i,l;
        char c;
        
        System.out.println("Enter a sentence");
        s= sc.nextLine();
        s=s+" ";
        l=s.length();
        
        for(i=0;i<1;i++){
            c=s.charAt(i);
            
            if(c!=' ')
            w=w+c;
            else{
                if(w.equalsIgnoreCase("15"))
                w="26";
                
                else if(w.equalsIgnoreCase("August"))
                w="January";
                
                else if(w.equalsIgnoreCase("Independence"))
                w="Republic";
                s1=s1+" "+w;
                w="";
               }
               System.out.println("the changed sentence is=");
        System.out.println(s1);
            }
        
    }
}