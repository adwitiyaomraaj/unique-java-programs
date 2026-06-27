import java.util.*;
class FiboString
{
    String x, y, z;
    int n;
    String ar[];
    FiboString(){
        x = "a";
        y = "b";
        z="";
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        ar =new String[n];
    }
    void generate(){
        if(n<3){
            if(n==1)
              System.out.println(x+",");
            else
              System.out.println(x+","+y);
            System.exit(0);
        }
        ar[0] = x;
        ar[1] = y;
        System.out.print(x+","+y);
        for(int i = 2; i < n; i++){
            ar[i]=ar[i-1]+ar[i-2];
            z=ar[i];
            System.out.print(","+z);
            z="";
        }
        System.out.println();
    }
    public static void main(String[] args){
        FiboString ob =new FiboString();
        ob.accept();
        ob.generate();
    }
}