
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

import javax.swing.text.Document;

public class OpenISBNLookup {

    
    public static void checkISBN(String isbn) {
        try {
            
            String urlString = "https://www.openisbn.com/isbn/" + isbn + "/";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            
            int status = connection.getResponseCode();
            
            if (status != 200) {
                
                System.out.println("Error: Unable to fetch data for ISBN " + isbn);
                
                return;
            }

            
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            
            String html = response.toString();
            Document doc = Jsoup.parse(html);

            
            String title = ((Object) doc).select("h1").text();
            String author = doc.select("p:contains(Author)").text();
            String publisher = doc.select("p:contains(Publisher)").text();

            
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Publisher: " + publisher);

        } catch (Exception e) {
            System.out.println("An error occurred while checking the ISBN: " + e.getMessage());
        }
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a isbn");
        
        String isbn = sc.nextLine();  

        checkISBN(isbn);
    }
}
