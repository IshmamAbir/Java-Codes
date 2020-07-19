import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    Calculation calculation=new Calculation();
    List<String> studentList;
    String[] separate;



    public static void main(String[] args) {
        Main main=new Main();
        main.readFromFile();
        main.arramgeNumbers();
    }



    public void arramgeNumbers(){
        String[] name;
        for (String i:studentList){

            separate = i.split(",");
            new StudentDetails(Integer.parseInt(separate[0]),separate[1],new Subject(Integer.parseInt(separate[2]),Integer.parseInt(separate[3]),Integer.parseInt(separate[4]),Integer.parseInt(separate[5])));
        // write to file er kaj ekhane asbe
            writeFile(Integer.parseInt(separate[0]),separate[1],Integer.parseInt(separate[2]),Integer.parseInt(separate[3]),Integer.parseInt(separate[4]),Integer.parseInt(separate[5]));
        }
    }



    public void readFromFile(){
        try {
            File file = new File("Results.txt");
            BufferedReader reader =new BufferedReader(new FileReader(file));
            studentList =new ArrayList<>();
            String s;

            while ((s=reader.readLine()) != null){
                studentList.add(s);

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void writeFile(int id,String name,int bangla,int english,int math,int religion){
        File folder=new File("Individual Result");
        folder.mkdir();
        File result=new File(folder.getPath()+"/"+id+"-"+name+".txt");
            try {
                result.createNewFile();
                PrintWriter printWriter=new PrintWriter(result);
                printWriter.println("Student Name:   "+name);
                printWriter.println("Student Roll:   "+id);
                printWriter.println();
                printWriter.println("---------------------------------------------");
                printWriter.println("Subject   |  Marks  | Grade Point  | Grade  |");
                printWriter.println("---------------------------------------------");
                double banglaGradePoint=calculation.calculateGradePoint(bangla);
                printWriter.println("Bangla    | "+bangla+"      | "+banglaGradePoint+"            | "+calculation.showGrade(banglaGradePoint)+"    |");
                printWriter.println("---------------------------------------------");
                double englishGradePoint=calculation.calculateGradePoint(english);
                printWriter.println("English   | "+english+"      | "+englishGradePoint+"            | "+calculation.showGrade(englishGradePoint)+"   |");
                printWriter.println("---------------------------------------------");
                double mathGradePoint=calculation.calculateGradePoint(math);
                printWriter.println("Math      | "+math+"      | "+mathGradePoint+"            | "+calculation.showGrade(mathGradePoint)+"   |");
                printWriter.println("---------------------------------------------");
                double religionGradePoint=calculation.calculateGradePoint(religion);
                printWriter.println("Religion  | "+religion+"      | "+religionGradePoint+"            | "+calculation.showGrade(religionGradePoint)+"    |");
                printWriter.println("---------------------------------------------");
                double gpa=calculation.calculateGPA(banglaGradePoint,englishGradePoint,mathGradePoint,religionGradePoint);
                printWriter.println("              GPA     | "
                        +  gpa
                        +"         | "+calculation.finalGrade(gpa)+"      |");
                printWriter.println("---------------------------------------------");

                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

}
