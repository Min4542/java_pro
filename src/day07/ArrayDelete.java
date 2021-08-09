package day07;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제 전: " + Arrays.toString(arr));

        // 삭제 인덱스
        int delIdx = 4;

        // 배열을 한칸씩 땡겨준다.
        for (int i = delIdx; i < arr.length-1; i++){
            arr[i] = arr[i + 1];
        } //end for

        // ArrayPop
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        } // end for

        arr = temp;
        temp = null;
        System.out.println(" ");
        System.out.println("삭제 후: " + Arrays.toString(arr));

    }
}
