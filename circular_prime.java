import java.util.*;
class circular_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int b=n, c=0, a=0, d=0;
        while(b!=0){
            int r = b%10;
            b=b/10;
            c++;
        }
        b=n;
        int x = (int)Math.pow(10,c-1);
        for(int i=0;i<c;i++){
            a=0;
            for(int j=1;j<=n;j++){
                if(n%j==0){
                    a++;
                }
            }
            if(a==2){
                d++;
                System.out.println(n);
            }
            else{
                System.out.println(n+" is not a circular prime");
                System.exit(0);
            }
            int r = b%x;
            b=b/x;
            n=r*10+b;
            b=n;
        }
        if(d==c){
            System.out.println(n+" is a circular prime");
        }
    }
}