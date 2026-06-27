import java.util.*;
class unique_digits{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        if(m>=n || m>=30000 || n>=30000){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("The Unique-Digit integers are:");
        int c = 0;
        String r = "";
        for(int i=m;i<=n;i++){
            int temp = i;
            int flag = 0;
            int count[] = new int[10]; 
            while(temp!=0){
                int digit = temp%10;
                count[digit]++; 
                if(count[digit]>1){
                    flag = 1;
                    break;
                }
                temp = temp/10;
            }
            if(flag==0){
                if(c==0){
                    r += i;
                }
                else{
                    r += ", " + i;
                }
                c++;
            }
        }
        System.out.println(r);
        System.out.println("Frequency of unique-digit integers is: " + c);
    }
}