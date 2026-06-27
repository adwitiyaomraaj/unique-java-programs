


import java.util.*; 
class niven_number {  
    
    public static void main(String[] args) {   
        
        Scanner sc = new Scanner(System.in); 
        int num= sc.nextInt();
        int p= num;
        int s=0;
        do{
            int d = num% 10;
            s= s+d;
            num = num/10;
        }
        
        while(num!=0);
        
        if(p%s==0)
        
        System.out.println("Niven");
        else
        System.out.println("not Niven");
        }  
}  
  