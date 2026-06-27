


import java.util.*;
class sda{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String email[] = new String[10];
        
        System.out.println("Enter 10 email ids");
        
        for(int a =0; a<10; a++){
            email[a] = sc.nextLine();
        }
        String password[] = new String[10];
        System.out.println("Enter 10 passwords of given email id in sequence");
        for(int b =0; b<10; b++){
            password[b] = sc.nextLine();
        }
        String country[] = new String[10];
        System.out.println("Enter any 10 countries");
        for(int c =0; c<10; c++){
            country[c] = sc.nextLine();
        }
        String capital[] = new String[10];
        System.out.println("Enter 10 capitals of given countries in sequence");
        for(int d =0; d<10; d++){
            capital[d] = sc.nextLine();
        }
        System.out.println("Enter a number");
        int e = sc.nextInt();
        sc.nextLine();
        int f = 0;
        int g = 3;
        int h = 0;
        
        if(e%2==0){{
            do{
                System.out.println("Enter the email id");
                String i =sc.nextLine();
                System.out.println("Enter the password");
                String j =sc.nextLine();
                for(int k=0;k<email.length;k++)
                    if(email[k].equalsIgnoreCase(i) && password[k].equalsIgnoreCase(j))
                       f++;
                if(f>0){
                    System.out.println("Login successful");
                    break;
                }
                else{
                    System.out.println("Login unsuccessful");
                    h++;
                    do{
                       int l =f--;
                       if(l != 0)
                           System.out.println("program will be terminated after"+" "+l+" "+"more chances");
                       else
                           System.out.println("-----Program Terminated-----");
                       break;
                      
                      }while(h<=3);
                    }
                }while(h<=3);
          }
        }
        else{
            System.out.println("Enter the country or capital");
            String m = sc.nextLine();
            int n = 0;
            int o;
            for(o=0;o<country.length;o++){
                if(country[o].equalsIgnoreCase(m)){
                System.out.println("Capital of " +" "+country[o]+" "+"is:"+" "+capital[o]);
                n++;
              }
              
              else if(capital[o].equalsIgnoreCase(m)){
                System.out.println(capital[o]+" "+"is the Capital of:" +" "+country[o]);       
                n++;
              }
            }
            if(n==0){
                System.out.println("Country or capital not found.");
            }
        }
    }
}