


import java.util.*;
public class InfiniteCalendar {
    
    public static boolean isLeapYear(long year) {
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                
                return (year % 400 == 0);
            } else {
                return true;
            }
        }
        return false;
    }
    
    public static long days(long month, long year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 0;
        }
    }
    
    public static long FirstDay(long month, long year) {
        long day = 1;
        long y = year - (14 - month) / 12;
        long m = month + 12 * ((14 - month) / 12) - 2;
        return (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
    }
    
    public static String MonthName(long month) {
        if (month == 1) return "January";
        
        else if (month == 2) return "February";
        
        else if (month == 3) return "March";
        
        else if (month == 4) return "April";
        
        else if (month == 5) return "May";
        
        else if (month == 6) return "June";
        
        else if (month == 7) return "July";
        
        else if (month == 8) return "August";
        
        else if (month == 9) return "September";
        
        else if (month == 10) return "October";
        
        else if (month == 11) return "November";
        
        else if (month == 12) return "December";
        else return "Invalid";
    }
    
    public static void printCalendar(long month, long year) {
        String monthName = MonthName(month);
        
        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        long d_m = days(month, year);
        long fd_w = FirstDay(month, year);
        
        for (long i = 0; i < fd_w; i++) {
            System.out.print("   ");
        }
        for (long day = 1; day <= d_m; day++) {
            System.out.printf("%2d ", day);
            if ((day + fd_w) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter month (1-12) or 0 to exit: ");
            Long month = sc.nextLong();
            if (month == 0) {
                break; 
            }
            System.out.print("Enter year: ");
            Long year = sc.nextLong();
            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
            } else {
                printCalendar(month, year);
            }
        }
        System.out.println("Exiting the calendar program.");
    }
}
