package oca.exam4;

public class Dims {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[] b = (int[]) a[1]; // {3,4}
        Object o1 = a; // {{1,2}, {3,4}};
        int[][] a2 = (int[][]) o1;// {{1,2}, {3,4}};
        int[] b2 = (int[]) o1;
        System.out.println(b[1]); //4
    }
}
