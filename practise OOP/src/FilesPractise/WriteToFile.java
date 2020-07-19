package FilesPractise;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriteToFile {
    public static void main(String[] args) {
        try {

            Formatter formatter=new Formatter("D:/PRACTISE CODE/Java (Intellij IDEA)/practise OOP/Test File/File create.txt");
            formatter.format("%s","Ishmam Abir\r\nCSE");


            formatter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
