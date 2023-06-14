package oca;

import java.util.ArrayList;
import java.util.List;

public final class Test {

    public static void main(String[] args) {

        int[] array = {6, 9, 8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]); // add 6 to ArrayList
        list.add(array[2]); // add 8 to ArrayList - [6, 8]
        list.set(1, array[1]); // set 9 instead of 8 - [6, 9]
        list.remove(0); // remove 6 - [9]
        System.out.println(list); // [9]

    }

}
