package day08;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {


        // 2차원 배열 
        // length = 3
        int[][] arr2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("arr2d.length = " + arr2d.length);
        System.out.println(Arrays.toString(arr2d[1]));
        System.out.println(arr2d[2][1]);

        arr2d[1][2] = 100;

        arr2d[2] = new int[]{10, 20, 30};

        System.out.println("=========================");

        // arr2d의 0, 1, 2 배열이 arr에 들어오게 된다. arr = (1,2,3) (4,5,6) (7,8,9)
        for (int[] arr : arr2d) {
            // arr에 들어온 배열안의 데이터를 다시 n에 담아준다.
            for (int n : arr) {
                // ( 1, 2, 3, - - - )
                System.out.print(n + " ");
            } //end for
            System.out.println();
        } // end for

        System.out.println();
        System.out.println("=== 3행 5열 ===");

        // 배열 생성문으로 생성하기
        // 3행 5열짜리 배열
        int[][] testArr = new int[3][5];
        testArr[0] = new int[]{10, 20, 30, 40, 50};
        testArr[1] = new int[]{100, 200, 300, 400, 500};
        testArr[2] = new int[]{1000, 2000, 3000, 4000, 5000};

        for (int[] ints : testArr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        // 3차원 배열
        int[][][] arr3d = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
        };
        System.out.println(); // 여백
        System.out.println(arr3d[0][1][2]);

        int[][][] arr3dtest = arr3d; // 2장의 4행 3열
        for (int[][] ints2 : arr3dtest) {
            for (int[] anInt2 : ints2) {
                for (int i2 : anInt2) {
                    System.out.println("i2 = " + i2);
                } // end for
            } // end for
        } // end for


    } // end main
} // end class
