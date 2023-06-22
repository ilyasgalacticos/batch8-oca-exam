package oca.thread;

public class Main {
    public static void main(String[] args) {
        IlyasRunner r1 = new IlyasRunner();
        r1.name = "Ilyas";
        IlyasRunner r2 = new IlyasRunner();
        r2.name = "Cankut";
        IlyasRunner r3 = new IlyasRunner();
        r3.name = "Ozgur";

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

//        NotIlyasRunner r1 = new NotIlyasRunner();
//        r1.name = "Ilyas";
//        NotIlyasRunner r2 = new NotIlyasRunner();
//        r2.name = "Cankut";
//        NotIlyasRunner r3 = new NotIlyasRunner();
//        r3.name = "Ozgur";
//
//        r1.run();
//        r2.run();
//        r3.run();
    }
}
