package oca.example1;

public class Example2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va"); //Java
        System.out.println("Java" == "Java"); //true
        System.out.println(s1.equals(s2)); // true
        System.out.println(sb1.toString() == s1); //false
        System.out.println(sb1.toString().equals(s1)); //true
    }
}
