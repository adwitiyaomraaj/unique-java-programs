


import java.util.*;
class CloudStorage{
    
    int acno=0,space=0;
    double bill=0.0;
    
    void accept(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account number");
        acno = sc.nextInt();
        System.out.println("Enter storage space(in GB)");
        space = sc.nextInt();
    }
    
    void calculate(){
        
        if(space<=15)
          bill= space*15;
        
        else if(space>15 && space<=30)
          bill= space*13;
        else
          bill= space*11;
    }
    
    void display(){
        System.out.println("account number:"+" "+acno);
        System.out.println("storage space:"+" "+space);
        System.out.println("bill:"+" "+bill);
    }
    
    public static void main(String[] args){
        CloudStorage ob = new CloudStorage();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}