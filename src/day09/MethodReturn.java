package day09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodReturn {

    //리턴값이 없는 메서드 :
    // 메서드가 코드만 실행하고 호출부로 값을 전달하지 않는 경우

    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static void showMultiply(int n1, int n2) {
        System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
    }

    static void sayHello(String name) {
        if (name.length() > 5) {
            System.out.println(name + "님 하이");
        }
    }

    // 모든 메서드의 리턴값은 오직 한개!
    // 두 개의 정수를 전달받아 덧셈,뺄셈,곱셈,나눗셈의 결과를 리턴
    static int[] operateAll(int n1, int n2) {
        return new int[]{n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }

    public static void main(String[] args) {

        //return값이 없는 void타입 메서드는 단독호출해서 사용
        showMultiply(5, 8);
        showMultiply(add(5, 5), add(3, 3));

        System.out.println();
        sayHello("홍길동");

        System.out.println();
        // operateAll의 반환 값은 배열임으로 배열로 받아준다.
        int[] operateAll = operateAll(10, 5);

        System.out.println("10과 5의 산수 값들");
        System.out.println("덧셈 값: " + operateAll[0]);
        System.out.println("곱셈 값: " + operateAll[1]);
        System.out.println("뺄셈 값: " + operateAll[2]);
        System.out.println("나눗셈 값: " + operateAll[3]);



    }
}
