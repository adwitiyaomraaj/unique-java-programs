import java.util.*;
class triangular_num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
            if(sum > n){
                break; 
            }
            if(sum >= 3){
                System.out.print(sum + " ");
            }
        }
        System.out.println();
    }
}