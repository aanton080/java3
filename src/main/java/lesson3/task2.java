package lesson3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class task2 {
    public static void main(String[] args) throws IOException {
        ArrayList<InputStream> ali = new ArrayList<>();
        ali.add(new FileInputStream("files/1"));
        ali.add(new FileInputStream("files/2"));
        ali.add(new FileInputStream("files/3"));

        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(ali));
        int x;
        while ((x = in.read()) != -1) {
            System.out.print((char)x);
        }
        in.close();

    }
}
