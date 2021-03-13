package ALearn_PZN;

import java.util.*;

public class ArrayUnik {
    public static void main(String[] args) {

        System.out.println("***List***");

        List arrList = new ArrayList();

        arrList.add("1");
        arrList.add("2");
        arrList.add("3");

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        ////////////////////////////////////////////////////////////////////////////////////

        System.out.println("***Set***");

        Set arrSet = new HashSet();

        arrSet.add("1");
        arrSet.add("2");
        arrSet.add("2");
        arrSet.add("3");
        arrSet.add("3");

        Object[] setToArray = arrSet.toArray();

        for (int i = 0; i < setToArray.length; i++) {
            System.out.println(setToArray[i]);
        }

        ////////////////////////////////////////////////////////////////////////////////////

        System.out.println("***Map***");

        HashMap arrMap = new HashMap();

        arrMap.put(0,"1");
        arrMap.put(1,"2");
        arrMap.put(2,"2");

        System.out.println(arrMap);

        for (int i = 0; i < arrMap.size(); i++) {
            System.out.println(arrMap.get(i));
        }
    }
}
