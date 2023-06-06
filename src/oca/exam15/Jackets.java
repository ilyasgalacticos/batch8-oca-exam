package oca.exam15;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jackets {
    public static void main(String[] args) {
        ArrayList<String> steps = new ArrayList<>();
        steps.add("knead");
        steps.add("oil pan");
        steps.add("turn on oven");
        steps.add("roll");
        steps.add("turn on oven");
        steps.add("bake");
        steps.add("bake");
        steps.add("bake");
        steps.add("bake");
        System.out.println(steps);
    }
}
//[knead, oil pan, turn on oven, roll, turn on oven, bake]
