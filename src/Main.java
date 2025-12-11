import javax.sound.sampled.*;
import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        /*
        ***********************************************8
        Scanner scanner=new Scanner(System.in);
ArrayList<String>L=new ArrayList<>();


        System.out.print("Enter the number of foods you want:");
        int num=scanner.nextInt();
        scanner.nextLine();
        String foods;

        for(int i=0;i<num;i++){
            System.out.println("Enter the food you want");
             foods=scanner.nextLine();
            L.add(foods);
        }for(int i=0;i<num;i++){
            System.out.println(L);
        }


        scanner.close();
    ***********************************************
           //File writer
        try( FileWriter writer=new FileWriter("C:\\Users\\hp\\Desktop\\test.txt");){
            writer.write("""
                    I am starting to like coding
                    it is very fun to code
                    I will code every time
                    """);
            System.out.println("File has been written");
        }
      catch (FileNotFoundException e){
          System.out.println("FIle not Found");
      }
        catch (IOException e){
            System.out.println("Could not write file");
        }
     ************************************
              //BufferedReader + File Reader

        String filepath="C:\\Users\\hp\\Desktop\\myText.txt";
     try(   BufferedReader reader=new BufferedReader(new FileReader(filepath))){
         //System.out.println("FIle read successfully");
         String line;
         while((line=reader.readLine())!=null){
             System.out.println(line);
         }

     }
     catch(FileNotFoundException e){
         System.out.println("File not found");
     }
     catch(IOException e){
         System.out.println("could not read file!");
     }
     *************************************************
*/
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
