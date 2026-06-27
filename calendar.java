import java.util.*;
class calendar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input year: ");
        int year = sc.nextInt();
        System.out.println("Input month: ");
        String m = sc.next().toUpperCase();
        System.out.println("Input first day of the month: ");
        String  fd = sc.next().toUpperCase();
        int d=0;
        if(m.equals("FEBRUARY")){
            if(year%4==0 && year%100!=0 || year%400==0){
                d=29;
            }
            else{
                d=28;
            }
        }
        else if(m.equals("JANUARY") || m.equals("MARCH") || m.equals("MAY") || m.equals("JULY") || m.equals("AUGUST") || m.equals("OCTOBER") || m.equals("DECEMBER")){
            d=31;
        }
        else if(m.equals("APRIL") || m.equals("JUNE") || m.equals("SEPTEMBER") || m.equals("NOVEMBER")){
            d=30;
        }
        String [] days= {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        int c=0;
        for(int i=0;i<7;i++){
            if(fd.equals(days[i])){
                c=i;
                break;
            }
        }
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(int i=0;i<c;i++){
            System.out.print("\t");
        }
        for(int i=1;i<=d;i++){
            System.out.print(i+"\t");
            c++;
            if(c%7==0){
                System.out.println();
            }
        }
        System.out.println();
    }
}