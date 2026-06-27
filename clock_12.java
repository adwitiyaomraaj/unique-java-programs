


import java.util.*;
class clock_12{
    
    public static void main(String [] args)throws InterruptedException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input time according to 12 hr clock time");
        
        int i=sc.nextInt(),j=sc.nextInt(),k=sc.nextInt();
        
        for(i=i;i<=12;i++){
            
            
            
            for(j=j;j<60;j++){
                for(k=k;k<60;k++){
                    if(k<10&&j<10&&i<10){
                    System.out.println("0"+i+":"+"0"+j+":"+"0"+k);
                    Thread.sleep(1000);
                  }
                    System.out.println(i+":"+j+":"+k);
                    Thread.sleep(1000);
                }
                k=00;
            }
            j=00;
            if(i==12)
                i=1;
        }
        
    }
}