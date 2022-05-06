package fosalgo;

import java.util.Arrays;

public class Solution01 {

    public static void main(String[] args) {
        int[][] data01 = {
            {1, 7, 0, 6},
            {2, 0, 0, 9},
            {24, 5, 8, 6},
            {29, 5, 8, 8}
        };

        System.out.println("----------------------------");
        System.out.println("PRINT-01");
        for (int i = 0; i < data01.length; i++) {
            for (int j = 0; j < data01[i].length; j++) {
                System.out.print(data01[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("----------------------------");
        System.out.println("PRINT-02");
        for (int i = 0; i < data01.length; i++) {
            System.out.println(Arrays.toString(data01[i]));
        }

        int numBaris = data01.length;
        int numKolom = data01[0].length;
        int size = numBaris * numKolom;

        int[] data02 = new int[size];
        int k = 0;
        for (int i = 0; i < numBaris; i++) {
            for (int j = 0; j < numKolom; j++) {
                data02[k] = data01[i][j];
                k++;
            }
        }

        System.out.println("----------------------------");
        System.out.println("Data 1D");
        System.out.println(Arrays.toString(data02));

        //sorting menggunakan class Arrays
        Arrays.sort(data02);

        System.out.println("----------------------------");
        System.out.println("Data 1D setelah sorting");
        System.out.println(Arrays.toString(data02));

        //susun base on kolom
        int[] data03 = new int[size];
        k = 0;
        for (int j = 0; j < numKolom; j++) {
            for (int i = 0; i < numBaris; i++) {
                data03[k] = data01[i][j];
                k++;
            }
        }
        System.out.println("----------------------------");
        System.out.println("Data 1D_2");
        System.out.println(Arrays.toString(data03));

        //sorting menggunakan class Arrays
        Arrays.sort(data03);

        System.out.println("----------------------------");
        System.out.println("Data 1D_2 setelah sorting");
        System.out.println(Arrays.toString(data03));

        //array 2D lagi
        int[][] data04 = new int[numBaris][numKolom];
        k = 0;
        for (int i = 0; i < numBaris; i++) {
            for (int j = 0; j < numKolom; j++) {
                data04[i][j] = data03[k];
                k++;
            }
        }

        //cetak Data 2D baru
        System.out.println("----------------------------");
        System.out.println("PRINT-Data04");
        for (int i = 0; i < numBaris; i++) {
            System.out.println(Arrays.toString(data04[i]));
        }

        //array 2D lagi dan lagi
        int[][] data05 = new int[numBaris][numKolom];
        k = 0;
        for (int j = 0; j < numKolom; j++) {
            for (int i = 0; i < numBaris; i++) {
                data05[i][j] = data03[k];
                k++;
            }
        }

        //cetak Data 2D baru
        System.out.println("----------------------------");
        System.out.println("PRINT-Data05");
        for (int i = 0; i < numBaris; i++) {
            System.out.println(Arrays.toString(data05[i]));
        }

    }
}
