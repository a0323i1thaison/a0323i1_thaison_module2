package ss16_binary_file_Serialization;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class CopyFileBinary {
        public static void main(String[] args) {
            String sourceFile = "src/ss16_binary_file_Serialization/QLySanPham.csv";
            String targetFile = "src/ss16_binary_file_Serialization/CopyFileBinary.csv";

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
