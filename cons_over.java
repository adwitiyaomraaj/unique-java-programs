


import java.util.*;
class cons_over{
    
    cons_over(int a, int b){
        int c1 = 0;
        int c2 = 0;
        
        for (int i = 1; i <= a; i++) {
            
            if (a % i == 0) {
                c1++;
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                c2++;
            }
        }
        if (c1 == 2 && c2 == 2 && Math.abs(a - b) == 2) {
            
            System.out.println(a + " and " + b + " are twin primes.");
        } else {
            System.out.println(a + " and " + b + " are not twin primes.");
        }
    }
    cons_over(short num1, short num2){
        int min =(int) Math.min(num1, num2);
        int x = 1;
        int i = 1;
           
           while ( i <= min) {
            if (num1 % i == 0 && num2 % i == 0) {
                x = i;
            }
            i++;
        }
           if (x == 1) {
            System.out.println(num1 + " and " + num2 + " are co-prime numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not co-prime numbers.");
        }
    }
    cons_over(short a) {
        int b = a * a;
        String c = Integer.toString(a);
        String d = Integer.toString(b);
        if (d.endsWith(c)) {
            System.out.println(a + " is an Automorphic number.");
        } else {
            System.out.println(a + " is not an Automorphic number.");
        }
    }
    cons_over(int num){
          String a = Integer.toString(num);
          int l = a.length();
          if (l == 1){
              if(num/7==1||num%7==0)
                System.out.println("It is a buzz no.");
                else
                System.out.println("It is not a buzz no.");
          }
          
          else if(l == 2){
                int e= num%10;
                if(num%7==0||e==7)
                System.out.println("It is a buzz no.");
                else
                System.out.println("It is not a buzz no."); 
          }
          
          else if(l == 3){
                int g= num/10;
                int h= g/10;
                int i= h%10;
                if(num%7==0||i==7)
                System.out.println("It is a buzz no.");
                else
                System.out.println("It is not a buzz no.");
          }
          
          else if(l == 4){
                int k= num/10;
                int v= k/10;
                int m= v/10;
                int n= m%10;
                if(num%7==0||n==7)
                System.out.println("It is a buzz no.");
                else
                System.out.println("It is not a buzz no.");
          }
          
          else if(l == 5){
                int p= num/10;
                int q= p/10;
                int r= q/10;
                int s= r/10;
                int t= s%10;
                if(num%7==0||t==7)
                System.out.println("It is a buzz no.");
                else
                System.out.println("It is not a buzz no.");
          }
          
          else if(l>=6){
              System.out.println("THE NUMBER IS MORE THAN 5 DIGITS");
          }
    }
    cons_over(long a){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIX DIGIT NUMBER TO GET THE DATE OF FORMAT DD/MM/YYYY ");
        long num = sc.nextLong();
        long day = num / 10000;
        long month = (num / 100) % 100;
        long year = num % 100;
        year += a;
        int maxDays = (month == 2) ?((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28) : (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
        String dayStr = (day < 10) ? "0" + day : Long.toString(day);
        String monthStr = (month < 10) ? "0" + month : Long.toString(month);
        String yearStr = Long.toString(year);
        if(month >= 1 && month <= 12 && day >= 1 && day <= maxDays) 
           System.out.println("The date is: " + dayStr + "/" + monthStr + "/" + yearStr);
        else
           System.out.println("Invalid date.");
    }
    cons_over(String b) {
        String en_pass = "";    
        int i = 0;
        while(i< b.length()){
            char cuChar = b.charAt(i);
            char enChar = (char) (cuChar - 2);
            en_pass += enChar;
            i++;
        }
        System.out.println("New password: " + en_pass);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        crypto ob = new crypto(sc.nextLine());
        System.out.println("ENTER THE NUMBERS TO CHECK WHETHER THE NUMBERS ARE TWIN PRIME NUMBERS OR NOT ");
        TwinPrime ob1 = new TwinPrime(sc.nextInt(),sc.nextInt());
        System.out.println("ENTER THE NUMBERS TO CHECK WHETHER THE NUMBERS ARE CO PRIME NUMBERS OR NOT ");
        CoPrime ob2 = new CoPrime(sc.nextShort(),sc.nextShort());
        System.out.println("ENTER THE NUMBER TO CHECK WHETHER THE NUMBER IS AUTOMORPHIC OR NOT");
        automorphic ob3 = new automorphic(sc.nextShort());
        System.out.println("ENTER THE NUMBER TO CHECK WHETHER THE NUMBER IS BUZZ NUMBER OR NOT");
        System.out.println("The max digit is till 5");
        buzz_no ob4 = new buzz_no(sc.nextInt());
        System.out.println("ENTER IN WHICH SERIES DO YOU WANT SEE THE DATE, LIKE: 1800, 1900, 2000, etc.");
        DD_MM_YYYY ob5 = new DD_MM_YYYY(sc.nextLong());
    } 
} 
