import java.util.*;
class adam {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting value: ");
        int n = sc.nextInt();
        System.out.print("Enter ending value: ");
        int m = sc.nextInt();
        System.out.println("Adam Prime numbers between " + n + " and " + m + " are:");
        for (int num = n; num <= m; num++) {
            int rev = 0, a=0, b = num;
            while (b!=0) {
                a = b % 10;
                rev = rev * 10 + a;
                b = b / 10;
            }
            int c1 = 0, c2 = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    c1++;
            }
            for (int i = 1; i <= rev; i++) {
                if (rev % i == 0)
                    c2++;
            }
            int sq1 = (int)Math.pow(num,2);
            int sq2 = (int)Math.pow(rev,2);
            int d = 0;
            b=sq1;
            while (b!=0) {
                a = b % 10;
                d = d* 10+ a;
                b = b / 10;
            }
            if (c1 == 2 && c2 == 2 && d == sq2)
                System.out.print(num+",");
        }
        System.out.println();
    }
}
