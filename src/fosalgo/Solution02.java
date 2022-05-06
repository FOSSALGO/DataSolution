package fosalgo;

import java.util.Arrays;
import java.util.Vector;

public class Solution02 {

    public static void main(String[] args) {
        Vector<Vector<Integer>> data01 = new Vector<>();
        int nBaris = 4;
        int nKolom = 4;

        Vector<Integer> vectorBaris0 = new Vector<>();
        vectorBaris0.add(1);
        vectorBaris0.add(7);
        vectorBaris0.add(0);
        vectorBaris0.add(6);
        data01.add(vectorBaris0);

        Vector<Integer> vectorBaris1 = new Vector<>();
        vectorBaris1.add(2);
        vectorBaris1.add(0);
        vectorBaris1.add(0);
        vectorBaris1.add(9);
        data01.add(vectorBaris1);

        Vector<Integer> vectorBaris2 = new Vector<>();
        vectorBaris2.add(24);
        vectorBaris2.add(5);
        vectorBaris2.add(8);
        vectorBaris2.add(6);
        data01.add(vectorBaris2);

        Vector<Integer> vectorBaris3 = new Vector<>();
        vectorBaris3.add(29);
        vectorBaris3.add(5);
        vectorBaris3.add(8);
        vectorBaris3.add(8);
        data01.add(vectorBaris3);

        //cetak data
        System.out.println("PRINT_01--------------------------");
        for (Vector v : data01) {
            System.out.println(v);
        }

        //cetak data
        System.out.println("PRINT_02--------------------------");
        for (int i = 0; i < nBaris; i++) {
            Vector<Integer> vBaris = data01.get(i);
            for (int j = 0; j < nKolom; j++) {
                System.out.print(vBaris.get(j) + "\t");
            }
            System.out.println();
        }

        //Array 1D
        int[] data02 = new int[nBaris * nKolom];
        int k = 0;
        for (int i = 0; i < nBaris; i++) {
            Vector<Integer> vBaris = data01.get(i);
            for (int j = 0; j < nKolom; j++) {
                data02[k] = vBaris.get(j);
                k++;
            }
        }

        //cetak array 1D
        System.out.println(Arrays.toString(data02));

        //sorting
        Arrays.sort(data02);

        //cetak array 1D
        System.out.println(Arrays.toString(data02));

        //cetak data
        System.out.println("PRINT_03--------------------------");
        k = 0;
        for (int i = 0; i < nBaris; i++) {
            for (int j = 0; j < nKolom; j++) {
                System.out.print(data02[k] + "\t");
                k++;
            }
            System.out.println();
        }

        //cetak data
        System.out.println("PRINT_04--------------------------");
        k = 0;
        for (int j = 0; j < nKolom; j++) {
            for (int i = 0; i < nBaris; i++) {
                System.out.print(data02[k] + "\t");
                k++;
            }
            System.out.println();
        }

    }
}
