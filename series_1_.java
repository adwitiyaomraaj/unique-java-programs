


import java.util.*;
class series_1_{
    
    void s(){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double a = 0.0;
        
        for(int i = 0; i<n;i++){
            for(int j =0;j<=i;j++){
                a += Math.pow(10,j);
            }
            System.out.print((int)a+", ");
            a=0.0;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args){
        series_1_ ob = new series_1_();
        ob.s();
    }
}