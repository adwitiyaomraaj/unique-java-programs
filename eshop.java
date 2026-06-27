


import java.util.*;
class eshop{
    
    String name, a; double price, b, c;
    
    void accept(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name and price of the item purchased");
        name=sc.nextLine();
        price=sc.nextDouble();
    }
    
    void calculate(){
        a = (price>1000&&price<=25000)?"Discount applied = 5.0%":((price>25001&&price<=57000)?"Discount applied = 7.5%":((price>57001&&price<=100000)?"Discount applied = 10.0%":((price>100000)?"Discount applied = 15.0%":"No discount is available for price less than Rs.1000")));
        b = (price>1000&&price<=25000)? (5*price)/100 :((price>25001&&price<=57000)?(7.5*price)/100:((price>57001&&price<=100000)?(10*price)/100:((price>100000)?(15*price)/100:0)));
        c = price - b;
    }
    
    void display(){
        System.out.println("Item purchased=" + name);
        System.out.println(a);
        System.out.println("Amount after discount applied="+c);
    }
    
    public static void main(String args[]){
        eshop ob = new eshop();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}