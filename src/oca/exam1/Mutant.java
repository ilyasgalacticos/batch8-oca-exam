package oca.exam1;

public class Mutant{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        String s = "abc";
        sb.reverse().append("d"); // sb-> "cba".append("d")-> "cbad"
        s.toUpperCase().concat("d"); // "ABCd", but we didn't overwrite our String s
        System.out.println("." + sb + ". ." + s + ".");

        //.cbad. .ABCd. -> ANS: D, B
    }
}