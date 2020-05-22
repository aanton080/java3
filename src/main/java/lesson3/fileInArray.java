package lesson3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class fileInArray {
    //задание1:

    public static void main(String[] args) throws IOException {
        File file = new File("files/oblako");
        file.mkdirs();



        byte[] fileInArray = new byte[(int)file.length()];
        FileInputStream f = new FileInputStream("files/oblako/text.txt");
        f.read(fileInArray);
        while (f.available () > 0) {
            System.out.print ((char) f.read ());
        }
        System.out.println ();

    }
}
