


import java.util.*;
class courier
{
    
    String name, address, type;
    double weight, bill;
    
    void accept()
    {
        
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        weight = sc.nextDouble();
        sc.nextLine(); 
        address = sc.nextLine();
        type = sc.nextLine();
    }
    
    void calculate()
    {
        
        if (type.equals("I"))
        {
              bill = (weight <= 5)?weight*500:((weight>5 && weight<=10)?weight*700:weight*500);
              bill += 1500;
        }
        
        else if (type.equals("D"))
        {
             bill = (weight <= 5)?weight*500:((weight>5 && weight<=10)?weight*700:weight*500);
        }
        else
        {
            
            System.out.println("WRONG choice");
            System.exit(0);
        }
    }
    
    void print(){
             System.out.println(bill);
    }
    
    public static void main(String args[]){
        courier ob = new courier();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
