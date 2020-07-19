package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(34);
        list.add(3);
        list.add(2,335);

        Collections.sort(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if (integer<t1)
                    return -1;
                else
                    return 1;
            }
        });

        System.out.println(list);



        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }

}
