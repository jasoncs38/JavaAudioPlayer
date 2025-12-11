import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //how to play audio with java

        String filepath1="src\\Mission - Anno Domini Beats.wav";
        String filepath2="src\\good for the ghost - Alge.wav";
        File file =new File(filepath2);

      try(Scanner scanner=new Scanner(System.in);
          AudioInputStream audioStream= AudioSystem.getAudioInputStream(file)){
          System.out.println("Welcome to Java Audio Payer");
           Clip clip=AudioSystem.getClip();
           clip.open(audioStream);

          String response=" ";

          while(! response.equals("Q")){
              System.out.println("P=Play▶️");
              System.out.println("S=Stop⏸️");
              System.out.println("R=Reset🔁");
              System.out.println("Q=Quit❌");
              System.out.print("Enter your choice: ");
              response=scanner.nextLine().toUpperCase();
              switch (response){
                  case "P"->clip.start();
                  case "S"->clip.stop();
                  case "R"->clip.setMicrosecondPosition(0);
                  case "Q"->clip.close();
                  default -> System.out.println("Invalid choice");
              }
          }
     }
      catch(FileNotFoundException e){
          System.out.println("File not found");
      }
      catch(LineUnavailableException e){
            System.out.println("Unable to access audio file");
      }
      catch(UnsupportedAudioFileException e){
           System.out.println("Unsupported Format");
     }
      catch(IOException e){
           System.out.println("Something went wrong");
      }
      finally {
          System.out.println("Bye!😊");
      }
    }
}
