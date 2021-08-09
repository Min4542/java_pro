package day03;

import java.util.Scanner;

public class ScannerQuiz1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //3. 스캐너가 제공하는 함수들로 입력을 처리
        // next(), nextLine(): 문자열 입력처리, next()는 공백입력 불가!
        // nextInt(), nextDouble(): 각각 정수, 실수 입력처리


        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.print("- 상품의 가격: ");
        int price = sc.nextInt();
        System.out.print("- 상품의 수량: ");
        int n = sc.nextInt();
        System.out.println("========================");
        System.out.printf("상품 재고 총액: %d원", price*n);

    }
}
