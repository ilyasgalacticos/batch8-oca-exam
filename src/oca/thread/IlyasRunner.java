package oca.thread;

public class IlyasRunner implements Runnable{

    String name;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("I am "+name+" running " + i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
