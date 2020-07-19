package FilesPractise.UsingFileOutputStream;

import java.io.*;
import java.util.ArrayList;

public class MAin {
    public static void main(String[] args) {
        File file =new File("text fule.txt");
        String ad=readFromFile("text fule.txt");
        System.out.println(ad);




        /*try {
            *//*FileOutputStream out= new FileOutputStream(file);
            out.write("Helululu".getBytes());
            out.close();*//*



           // String print =reader.readLine();
            System.out.println(out);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
    public static String readFromFile(String fileName){
        String out = "";
        String check="";
        BufferedReader reader=null;
        try {

            reader =new BufferedReader(new FileReader(new File(fileName)));
            //String out = "";

            while ((check=reader.readLine()) != null) {
                out+=check+"\n";

            }
            reader.close();
        }catch (Exception e){}
        finally {
            if (reader !=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return out;
    }
}
