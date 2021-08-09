package day01;

public class Datatype {
    public static void main(String[] args) {
        // 정수형
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        // 리터럴 (147483647)값이 어딘가에 저장이 될 때 int여서 끝에 L을 붙혀 타입을 변환해야한다.
        long d = 147483647L;

        //실수형
        float f1 = 3.84848484848F; // 4byte
        double d1 = 3.848484848484848; //8byte

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);

        double n = 0.0;
        for (int i = 0; i < 100; i++) {
            n += 0.1;
        } // end for
        System.out.println("0.1을 100번 더한 결과: " + n);

        // 논리형
        boolean b1 = true;
        boolean b2 = false;
        // 자바의 논리형은 js처럼 falsy값이 존재하지 않는다.
//        boolean b3 = 0;++
//        boolean b4 = null;
//        boolean b5 = "true";
//        boolean b6 = False;

        // 문자형
//        char: 단일문자를 저장, 홑따옴표 사용
        char c1 = 'A'; // 쌍따옴표 X, 한글자만 가능 (AA = X)
//        String: 문자열을 저장, 겹따옴표 사용 (대문자)
        String s1 = "abasdasd";
//              ctrl + d = 복사
        System.out.println("100" + "200");
        // 숫자와 문자열의 덧셈은 문자열 덧셈처리
        System.out.println(100 + "200");

//        System.out.println("200" - 100);

    }
}
