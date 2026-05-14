package OtherProjects.hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class NoGarbage {
    public static void main(String args[]){
        String filename = "F:\\HUST\\IT3100E Object-Oriented Programming\\lab01\\OOP-Lab---761925---202417146---Nguyen-Dinh-Khoi\\OtherProjects\\hust\\soict\\globalict\\garbage\\test.txt";
        byte [] inputBytes = {};
        long startTime, endTime;
        String outputString = "";
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        };
        System.out.println("Reading...");
        startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes){
            outputStringBuilder.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(outputString);
    }
}
