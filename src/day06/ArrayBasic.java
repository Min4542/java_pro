package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //1. 배열 변수 선언
        int[] points;
        
        //2. 배열 객체 생성
        // 주소값으로 저장이 된다.
        points = new int[5];

        //3. 배열 값 초기화
        points[0] = 87;
        points[1] = 95;
        points[2] = points[0] +4; //91;
        points[3] = (int)33.154;
        points[4] = 100;
        // points[5] = 55; 지정된 배열의 수를 벗어나면 에러 발생

        //4. 배열의 길이 확인
        System.out.println("배열의 총 요소 수: " + points.length);

        //5. 배열의 반복문 처리
        System.out.println("==============================");

        for(int i=0; i < points.length; i++) {
            System.out.print(points[i] + " ");
        } // end for

        //enhanced for : 향상된 for문
        // of 대신 : # 오른쪽에 배열 # 왼쪽에는 꺼냈을 때 담을 변수
        System.out.println("\n==============================");
        for ( int n : points ) {
            System.out.print(n +" ");
        } // end for

        //points배열의 숫자 총합
        int total = 0;
        //단축키 iter ( 향상된 for문 ) art + enter 기능 ## !!!!!
        // end for
        for (int n : points) total += n;
        System.out.println("\n총합: " + total);

        //값 목록으로 배열 생성

        // 배열의 선언과 생성을 동시에 가능
        double[] dArr = new double[4];
        String[] foods = new String[] {"짜장면", "탕수육", "볶음밥"};


        // 배열의 선언시에만 new type을 생략 가능
        String[] fruits = {"포도", "배", "사과"}; // String만 가능

        //배열 내부 값 문자열로 보기
        System.out.println(Arrays.toString(foods));
        System.out.println(Arrays.toString(fruits));
        boolean[] bArr = new boolean[5];
        System.out.println(Arrays.toString(bArr));

        // 배열 복사
        System.out.println("================================");
        int[] iArr = {1, 3, 5, 7, 9};

        // 배열 복사 X, 주소값 복사 O
//        int[] copyArr = iArr;
//        System.out.println("copyArr " + Arrays.toString(copyArr));
//        System.out.println("copyArr " + Arrays.toString(iArr));


        //배열 복사 알고리즘
        //1. 원본배열과 크기가 같은 배열하나를 더 생성함
        int[] copyArr = new int[iArr.length];

        //2. 원본 배열의 값들을 복사배열로 값 복사
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = iArr[i];
        }

        System.out.println("copyArr " + Arrays.toString(copyArr));
        System.out.println("iArr " + Arrays.toString(iArr));
    }
}
