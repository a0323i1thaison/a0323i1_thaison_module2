package ss15_text_file.bai_tap.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFileCSV {
        public static void main(String[] args) {
            String filePath = "src/ss15_text_file/bai_tap/ReadFile/File.csv";

            try {
                File file = new File(filePath);
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] fields = line.split(",");

                    if (fields.length >= 3) {
                        int id = Integer.parseInt(fields[0].trim());
                        String code = fields[1].trim();
                        String name = fields[2].trim();

                        System.out.println("ID: " + id);
                        System.out.println("Code: " + code);
                        System.out.println("Name: " + name);
                        System.out.println();
                    }
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
