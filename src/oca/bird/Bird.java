package oca.bird;

public class Bird extends Animal{

    public static void main(String[] args) {
        new Bird().go();
//        Animal.fly();
    }

    void go(){
        fly();
    }
    private void fly(){
        System.out.println("sh-bang ");
    }
}
