package oca.exam12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Fortress fortress = new Fortress();
        fortress.addToList(10);
        fortress.addToList(20);

        fortress.printList();
        fortress.getList().add(30);
        fortress.getList().remove(0);
        fortress.getList().remove(0);
        fortress.getList().remove(0);
        fortress.printList();

    }
}
