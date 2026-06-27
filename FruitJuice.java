


import java.util.*;
class FruitJuice{
    
    int product_code,pack_size,product_price;
    String flavour, pack_type;
    FruitJuice(){
        product_code=0;
        pack_size=0;
        product_price=0;
        flavour="";
        pack_type="";
    }
    
    void Input(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the product code");
        product_code = sc.nextInt();
        System.out.println("Enter the flavour of Juice");
        flavour = sc.nextLine();
        System.out.println("Enter the pack type");
        pack_type = sc.nextLine();
        System.out.println("Enter the pack size");
        pack_size = sc.nextInt();
        System.out.println("Enter the product price");
        product_price = sc.nextInt();
    }
    
    void discount(){
        product_price = product_price - 10;
    }
    
    void display(){
        System.out.println("PRODUCT CODE:"+" "+product_code);
        System.out.println("FLAVOUR:"+" "+flavour);
        System.out.println("PACK TYPE:"+" "+pack_type);
        System.out.println("PACK SIZE:"+" "+pack_size);
        System.out.println("PRODUCT PRICE AFTER APPLYING DISCOUNT:"+" "+product_price);
    }
    
    public static void main(String[] args){
        FruitJuice ob = new FruitJuice();
        ob.Input();
        ob.discount();
        ob.display();
    }
}