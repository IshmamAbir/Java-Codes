package FilesPractise;

import java.io.File;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File file= new File("D:/PRACTISE CODE/Java (Intellij IDEA)/practise OOP/Test File/File create.txt");

            Scanner sc=new Scanner(file);

            while (sc.hasNext()){
                String id=sc.next();
                String id1=sc.next();
                String id2=sc.next();
                System.out.println(id+" "+id1+" "+id2);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
