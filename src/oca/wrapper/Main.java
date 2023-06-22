package oca.wrapper;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("Hi");
        vector.add("Java");

        System.out.println(vector.get(1));

        for(String s : vector){
            System.out.println(s);
        }

    }
}

//0
//2
//5
//9
//14
