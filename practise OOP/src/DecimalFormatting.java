import java.text.DecimalFormat;

public class DecimalFormatting {
    public static void main(String[] args) {
        double d= 4.44345533;
        DecimalFormat ds=new DecimalFormat("0.00");
        System.out.println(ds.format(d));
    }
}
