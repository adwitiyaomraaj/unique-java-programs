


import java.util.*;
class DD_MM_YYYY {
    
    DD_MM_YYYY(long a){
        
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
        String result = (month >= 1 && month <= 12 && day >= 1 && day <= maxDays) ?
            "The date is: " + dayStr + "/" + monthStr + "/" + yearStr : "Invalid date.";
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER IN WHICH SERIES DO YOU WANT SEE THE DATE, LIKE: 1800, 1900, 2000, etc.");
        cons_over ob4 = new cons_over(sc.nextLong());
    }
}
