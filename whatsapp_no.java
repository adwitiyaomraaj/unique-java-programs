/*
 * by entering a phone number it would take you to whatsapp chat of that number
 */
import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;
class whatsapp_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number with country code (no +, no spaces):");
        String number = sc.nextLine();
        try {
            String link = "https://wa.me/" + number;
            Desktop.getDesktop().browse(new URI(link));
            System.out.println("Opening WhatsApp chat for: " + number);
        } catch (Exception e) {
            System.out.println("Error opening WhatsApp. Copy and paste this link manually:");
            System.out.println("https://wa.me/" + number);
        }
    }
}