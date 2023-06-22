package oca.ab;

class B extends A{
    int a = 7;
    String doA(){
        return "b1";
    }
    public static String doA2(){
        return "b2";
    }
    void go(){
        A myA = new B();
        System.out.println(myA.doA() + myA.doA2() + myA.a); // b1a25
    }
    public static void main(String args[]){
        new B().go();
    }
}