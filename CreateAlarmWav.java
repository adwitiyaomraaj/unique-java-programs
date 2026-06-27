


import javax.sound.sampled.*;
import java.io.*;

public class CreateAlarmWav {
    
    public static void main(String[] args) {
        try {
            int duration = 3; 
            float sampleRate = 44100;
            int numSamples = (int) (duration * sampleRate);
            byte[] buffer = new byte[2 * numSamples];

            double frequency = 1000; 
            
            for (int i = 0; i < numSamples; i++) {
                double angle = 2.0 * Math.PI * i * frequency / sampleRate;
                short value = (short) (Math.sin(angle) * Short.MAX_VALUE);
                buffer[2 * i] = (byte) (value & 0xff);
                buffer[2 * i + 1] = (byte) ((value >> 8) & 0xff);
            }

            
            AudioFormat format = new AudioFormat(sampleRate, 16, 1, true, false);
            ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
            AudioInputStream audioInputStream = new AudioInputStream(bais, format, numSamples);

            File file = new File("alarm.wav");
            AudioSystem.write(audioInputStream, AudioFileFormat.Type.WAVE, file);

            
            System.out.println("alarm.wav created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

