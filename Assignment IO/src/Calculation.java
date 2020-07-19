public class Calculation {

    Subject  subject;


    public String showGrade(double point){
        double value=point;
        if (value==5.00)
            return "A+";
        else if (value>=4.5 && value<5.0)
            return "A";
        else if (value>=4.0 && value<4.5)
            return "A-";
        else if (value>=3.0 && value<4)
            return "B";
        else if (value>=2.0 && value<3.0)
            return "C";
        else if (value>=1.0 && value<2.00)
            return "D";
        else
            return "F";

    }


    public double calculateGradePoint(int mark){
        if (mark<=100 && mark>=0){
            if (mark>=80)
                return 5.00;
            else if (mark>=70)
                return 4.5;
            else if (mark>=60)
                return 4.00;
            else if (mark>=50)
                return 3.00;
            else if (mark>=40)
                return 2.00;
            else if (mark>=33)
                return 1.00;
            else
                return 0.00;
        }
        else{
            return 0;
        }
    }

    public double calculateGPA(double bangla,double english,double math,double religion){
         return  (bangla+english+math+religion)/4;
    }
    public String finalGrade(double gpa){
        return showGrade(gpa);
    }


}
