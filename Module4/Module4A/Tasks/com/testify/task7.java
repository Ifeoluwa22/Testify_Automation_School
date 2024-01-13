package com.testify;
import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        //create a two dimensional array with 4 rows and 3 columns. Fill only the first column with any fruits of ur choice

        String [][] table = new String[4] [3];
        table[0] [0] = "apples";
        table[1] [0] = "pineapples";
        table[2] [0] = "oranges";
        table[3] [0] = "kiwis";

        System.out.println(Arrays.deepToString(table));
    }
}
