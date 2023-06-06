package oca.exam8;

public class Theory {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1; //"abc"
        s1 += "d"; // "abcd"
        System.out.println(s1 + " " + s2 + " " + (s1 == s2));
        //abcd abc false
        StringBuilder sb1 = new StringBuilder("abc"); // abc
        StringBuilder sb2 = sb1; // abcd
        sb1.append("d"); //abcd
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
        //abcd abcd true
    }
}