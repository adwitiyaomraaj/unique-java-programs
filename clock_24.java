


import java.util.*;
class clock_24{
    
    public static void main(String [] args)throws InterruptedException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("remember input will be in 12 hr time clock:");
        
        int i=sc.nextInt()+12,j=sc.nextInt(),k=sc.nextInt();
        
        if(i==0)
          i-=12;
        
        for(i=i;i<=24;i++){
            if(i==24)
            i=00;
            
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
        }
        
    }
}