package day06;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {
        int newData = 40;
        int[] arr = {10, 20, 30, 100, 200};

        //1. 원본 배열보다 사이즈가 1개 더 큰 새 배열(임시배열)을 생성
        int[] temp = new int[arr.length +1];

        //2. 기존 배열 데이터를 복사해서 신규배열로 이동
        // 기존에 있던 배열의 수 만큼 반복
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        //3. 추가할 데이터를 맨 마지막 위치에 저장.
        temp[arr.length] = newData;

        //4. 주소값 이전
        arr = temp;
        temp = null;

        System.out.println("기존 배열 " + Arrays.toString(arr));
        System.out.println("신규 배열 " + Arrays.toString(temp));
    }
}
