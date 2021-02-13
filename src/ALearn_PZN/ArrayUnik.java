package ALearn_PZN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayUnik {
    public static void main(String[] args) {

        System.out.println("***List***");

        List arrList = new ArrayList();
        arrList.add("1");
        arrList.add("1");
        arrList.add("2");    ;

        for (int i = 0; i < arrList.size(); ++i) {
            System.out.println(arrList.get(i));
        }
        ////////////////////////////////////////////////////////////////////////////////////

        System.out.println("***Set***");

        Set arrSet = new HashSet();
        arrSet.add("1");
        arrSet.add("1");
        arrSet.add("2");

        Object[] arrFromSet = arrSet.toArray();

        for (int i = 0; i < arrFromSet.length; ++i) {
            System.out.println(arrFromSet[i]);
        }
        ////////////////////////////////////////////////////////////////////////////////////

        System.out.println("***Map***");

        HashMap arrMap = new HashMap();
        arrMap.put(0, "1");
        arrMap.put(1, "1");
        arrMap.put(2, "2");

        for (int i = 0; i < arrMap.size(); ++i) {
            System.out.println(arrMap.get(i));
        }
    }
}
