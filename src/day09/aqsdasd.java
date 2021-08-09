package day09;

import java.util.function.Function;

public class aqsdasd {
//    함수 제작 가능
        /*
         1. 자바의 메서드는 클래스 내부, 메서드 외부에 선언합니다.
         2. 메서드는 메서드 안에서만 호출할 수 있습니다.
         */

    // 1부터 X까지의 총합을 구해서 리턴하는 함수 정의
    // function A = int A return되는 type을 앞에 붙혀준다.

    // 1. (int x) = 매개변수 (parameter)
    // 2. (x:10) = 인수,인자 (argument)
    //

    static int calcTotal(int X) {
        System.out.println("calcTotal 호출됨!");
        int total = 0;
        for (int i = 0; i <= X; i++) {
            total += i;
        }
        return total;
    } // end calcTotal

    public static void main(String[] args) {

    int result = calcTotal(30);
    System.out.println("result = " + result);

    int result2 = calcTotal(100);
    System.out.println("result2 = " + result2);

    } // end main

    // 함수 제작 가능

} // end class
