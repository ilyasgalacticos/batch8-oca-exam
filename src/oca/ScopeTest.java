package oca;

public class ScopeTest {
    int z;

    public static void main(String[] args) {
        ScopeTest myScope = new ScopeTest();
        int z = 6;
        System.out.println(z); //6
        myScope.doStuff(); //5
        System.out.println(z); //6
        System.out.println(myScope.z); //4
    }

    void doStuff(){
        int z = 5;
        doStuff2(); // global z = 4
        System.out.println(z); // 5
    }

    void doStuff2(){
        z = 4;
    }

}
