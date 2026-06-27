


import java.util.Scanner;
import javax.sound.sampled.*;
import java.io.File;

public class TimerAudio {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter hours: ");
        int hours = sc.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();

        
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        try {
            
            for (int i = totalSeconds; i > 0; i--) {
                int h = i / 3600;
                int m = (i % 3600) / 60;
                int s = i % 60;
                System.out.printf("Time left: %02d:%02d:%02d\n", h, m, s);
                Thread.sleep(1000); 
            }

            
            System.out.println("Time is up! Playing sound...");

            
            File file = new File("alarm.wav"); 
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}