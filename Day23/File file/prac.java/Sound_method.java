import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Sound_method{
    public static void main(String ar[]) throws UnsupportedAudioFileException,IOException,LineUnavailableException{
                                                         
        Scanner scanner =new Scanner(System.in);
        File file =new File("Shape_Of_You.wav");
        AudioInputStream audioStream =AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
       String response="";
        while(!response.equals("Q")){
            System.out.println("P=play, S=stop,R=reset,Q=quit");
            System.out.println("Enter your choice");
            response =scanner.next();
            response=response.toUpperCase();
            switch(response){
                case ("P"):clip.start();break;
                case ("S"): clip.stop();break;
                case ("R"):clip.setMicrosecondPosition(0);break;
                case("Q"):clip.close(); break;
                default: System.out.println("Not a valid response");
            }
       
        }
        System.out.println("Byee");
    } 
}