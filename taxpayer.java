


import java.util.*;
class taxpayer{
    
    int pan, tax_income;
    String name;
    float tax;
    int a =tax_income;
    
    void input(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the pan");
        pan = sc.nextInt();
        System.out.println("Enter the income");
        tax_income = sc.nextInt();
    }
    
    void computetax(){
        
        if(tax_income<=60000){
            tax = a;
        }
        
        else if(tax_income>60000 && tax_income<=150000){
            tax = (tax_income*(float)0.05);
        }
        
        else if(tax_income>150000 && tax_income<=500000){
            tax = (tax_income*(float)0.1);
        }
        else{
            tax = (tax_income*(float)0.15);
            }
    }
    
    void print(){
        System.out.print("PAN.NO"+"\t"+"\t"+"TAXPAYER"+"\t"+"TAXABLE INCOME"+"\t"+"\t"+"TAX PAYABLE");
        System.out.println();
        System.out.print(pan +"\t"+ name +"\t"+"\t"+tax_income+"\t"+"\t"+"\t"+tax);
        System.out.println();
    }
    
    public static void main(String args[]){
        taxpayer ob = new taxpayer();
        ob.input();
        ob.computetax();
        ob.print();
    }
}