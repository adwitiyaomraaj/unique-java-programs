


import java.io.*;
import java.util.*;
public class DeleteLinesFromFile {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER THE FILE PATH (start one line below)");
        String filePath = sc.nextLine();

        try {
            
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            
            File tempFile = new File("temp.txt");
            FileWriter fileWriter = new FileWriter(tempFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter line number to start deleting from: ");
            int startLine = Integer.parseInt(reader.readLine());

            
            int lineNumber = 1;
            String line;

            
            while ((line = bufferedReader.readLine()) != null) {
                
                if (lineNumber >= startLine) {
                    break;
                }
                bufferedWriter.write(line + "\n");
                lineNumber++;
            }

            
            bufferedReader.close();
            bufferedWriter.flush();
            bufferedWriter.close();
            fileReader.close();
            fileWriter.close();

            
            File originalFile = new File(filePath);
            if (originalFile.delete()) {
                
                if (!tempFile.renameTo(originalFile)) {
                    System.out.println("Error renaming temp file to original file");
                }
                System.out.println("Lines deleted successfully.");
            } else {
                System.out.println("Error deleting original file.");
            }

        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for line number.");
        }
    }
}
