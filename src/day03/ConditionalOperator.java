package day03;


import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("- 금액을 입력해주세요: ");
        int money = sc.nextInt();
        sc.close();
//        money가 5천원 넘으면 김치찌개 2500넘으면 라면 아니면 굶어 ( 3항연산자 )
        String food = money >= 5000 ? "김치찌개"
                    : money >= 2500 ? "라면" : "굶어";
        System.out.println("오늘의 메뉴: " + food);
    }
}
