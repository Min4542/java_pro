package day02;

public class Casting2 {
    public static void main(String[] args) {
        char c = 'B'; // 유니코드 A부터 65 ~ # 66
        int i = 2;
        System.out.println(c + i);
        System.out.println(10 + 3.5);

        char result1 = (char) (c + i);
//        66+2를 char로 문자열로 바꾸면 68 즉 유니코드 'D'가 나온다.
        System.out.println("result1 = " + result1);

//        float < double
        double result2 = 3.5F + 5.6;
        //크기가 다른 데이터끼리의 연산은 크기가 작은쪽이
        //큰 쪽으로 자동형변환 된 후 연산됨.
        System.out.println("result2 = " + result2);

        // int보다 작은(byte,short,char)의 연산은 결과값이
        // 자동으로 int로 형 변환됨.
        byte b1 = 100, b2 = 110;
//        byte b3 = b1 + b2;


        int n1 = 27, n2 = 5; // int / int = int
        double result3 = (double) n1 / n2; // 인트가 더블로 자동으로 변환되어 나눠짐
        System.out.println("result3 = " + result3);
    }
}
