


import java.util.*;
class movieMagic{
     
     int year;String title;float rating;
     movieMagic(){
        year =0;
        title ="";
        rating =0.0f;
     }
     
     void accept(){
         
         Scanner sc =new Scanner(System.in);
         
         System.out.println("Enter the title of movie");
         title = sc.nextLine();
         System.out.println("Enter the year");
         year = sc.nextInt();
         System.out.println("Enter the rating for movie(please rate between 0.0 - 5.0)");
         rating = sc.nextFloat();
     }
     
     void display(){
         
         if(rating>=0.0f && rating<=2.0f)
              System.out.println("Movie is flopped");
         
         else if(rating>=2.1f && rating<=3.4f)
              System.out.println("Movie is Semi-HIT");
         
         else if(rating>=3.5f && rating<=4.4f)
              System.out.println("Movie is HIT");
         
         else if(rating>=4.5f && rating<=5.0f)
              System.out.println("Movie is Super-HIT");
     }
     
     public static void main(String args[]){
         movieMagic ob = new movieMagic();
         ob.accept();
         ob.display();
     }
}