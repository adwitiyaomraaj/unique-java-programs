


import java.io.*;
import java.util.*;

public class DeleteAboveSpecificLine {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        
        System.out.print("Enter the line number to start keeping content: ");
        int lineToKeepFrom = scanner.nextInt();

        
        List<String> lines = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int currentLine = 1;
            
            while ((line = reader.readLine()) != null) {
                
                if (currentLine >= lineToKeepFrom) {
                    lines.add(line);
                }
                currentLine++;
            }
        } catch (IOException e) {
            
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            
            return;
        }

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        scanner.close();
    }
}
