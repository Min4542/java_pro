package day02;

public class Bitoperator {
    public static void main(String[] args) {
        //비트 연산
        byte a = 5; // 00000101
        byte b = 3; // 00000011

        //비트곱: 각 자리수를 곱하세요.
        System.out.println(a & b); // 00000001 => 1

        //비트합: 각 자리수를 더하세요. 단 1 + 1은 1로 처리하세요.
        System.out.println(a | b); // 00000111 => 7

        //배타적논리합: 다르면 1 같으면 0 (OR)
        System.out.println( a ^ b ); // 00000110 => 6

        //비트 이동 연산
        int x = 192;
        // 00000000 00000000 00000000 11000000
        // 00000000 00000000 00000011 00000000
        // << 3 = 3자리를 올려라. 이동숫자 제곱만큼 곱셈
        System.out.println(x << 3);

        // 00000000 00000000 00000000 00110000
        // >> 2 = 2자리를 내려라. (-) 이동숫자 제곱만큼 나눗셈
        System.out.println(x >> 2);

        //비트 반전
        int y = 8;
        // 00001000
        // 11110111
        // 00001000 + 1
        // (1)부호기호 0001001 + 1
        // 10001001 = -9
        System.out.println(~y);
    }
}
