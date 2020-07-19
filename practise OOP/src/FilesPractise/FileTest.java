package FilesPractise;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file =new File("Test File");
        file.mkdir();
        String location= file.getAbsolutePath();

        System.out.println(location);
        System.out.println(file.getName());
        System.out.println();

        File file1=new File(location+"/File create.txt");
        File file2=new File(location+"/Another File create.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("files created");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Error in creating file");
        }
        file2.delete();

        if (file2.exists())
            System.out.println("file exists");
        else
            System.out.println("File not Exist");

    }
}
