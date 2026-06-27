


import java.util.*;
class sw_pt {
       
       public static void main(String args[]) {
           
           Scanner sc = new Scanner(System.in);
           
           System.out.println(" 1. To display ABCDE Pattern");
           System.out.println(" 2. To display Word Pattern");
           System.out.println("Enter your choice:");
           int ch= sc.nextInt();
           
           switch(ch) {
                 case 1:
                 
                 for (char i='E'; i>='A'; i--) {
                    for(char j='A';j<=i;j++){
                        System.out.print(j);
                      }
                    System.out.println();
                    }
                 break;
                 case 2:
                 String a = "BLUE";
                 for (int i=0; i < a.length();i++) {
                     for(int j=0; j<=i; j++) {
                         System.out.print(a.charAt(i));
                      }
                      System.out.println();
                    }
                 break;
                 default:
                 System.out.println("Invalid Input");
            }
        }
    }