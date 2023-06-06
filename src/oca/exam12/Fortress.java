package oca.exam12;

import java.util.ArrayList;

public class Fortress{
    private String name;
    private ArrayList<Integer> list;
    Fortress(){
        list = new ArrayList<Integer>();
    }
    String getName(){
        return name;
    }
    void addToList(int x){
        list.add(x);
    }
    ArrayList getList(){
        return (ArrayList<Integer>) list.clone();
    }
    public void printList(){
        System.out.println(list);
    }
}
