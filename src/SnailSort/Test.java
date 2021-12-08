package SnailSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int a[][] = {{}};
        int b[][] = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        int c[][] = {{1, 2, 3, 4, 5, 6},{7, 8, 9, 10, 11, 12},{13, 14, 15, 16, 17, 18}};
        System.out.println(Arrays.toString(new Snail().snail(a)));
        System.out.println(Arrays.toString(new Snail().snail(b)));
        System.out.println(Arrays.toString(new Snail().snail(c)));
    }
}
