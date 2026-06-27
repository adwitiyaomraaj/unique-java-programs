import java.util.*;
class Composite {
    int arr[][] ;
    int m, n;
    Composite(int mm, int nn){
        m = mm;
        n = nn;
        arr = new int[m][n];
    }
    int isComposite(int p){
        int c = 0;
        for(int i = 1; i <= p; i++){
            if(p%i == 0){
                c++;
            }
        }
        if(c > 2){
            return 1;
        }
        return 0;
    }
    void fill(){
        int num = 1; 
        for(int c = 0; c < n; c++){ 
            for(int r = 0; r < m; r++){
                while(isComposite(num)==0){
                   num++;
                } 
                arr[r][c] = num;
                num++; 
            }
        }
    } 
    void display(){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int mm = sc.nextInt();
        int nn = sc.nextInt();
        if(mm>=20||nn>=20){
            System.out.println("Max limit is 20");
            System.exit(0);
        }
        Composite ob = new Composite(mm, nn);
        ob.fill();
        ob.display();
    }
}