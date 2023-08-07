package ss15_text_file.bai_tap.CopyFile;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
public class CopyFileText {
    public static void main(String[] args) {
        String sourceFile = "src/ss15_text_file/bai_tap/CopyFile/Copy.txt";
        String targetFile = "src/ss15_text_file/bai_tap/CopyFile/TargetFIle.txt";

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(targetFile)) {

            int character;
            int characterCount = 0;

            while ((character = reader.read()) != -1) {
                writer.write(character);
                characterCount++;
            }

            System.out.println("File copied successfully.");
            System.out.println("Number of characters copied: " + characterCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
