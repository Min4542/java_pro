package day09;

import java.util.Scanner;

public class Food_TPJ {
    String[][] users = {};

   static void ArrayPush(){

   };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        System.out.println("*** 음식점 관리 프로그램 ***");
        System.out.println("점주님들의 번창을 기원합니다.");

        System.out.println("\n 메뉴를 선택해주세요.");
        System.out.println("1. 로그인 하기 ");
        System.out.println("2. 회원가입 하기 ");
        System.out.print(">>");
        String Select = sc.next();

        switch (Select) {
            case "로그인":
                String Id = sc.next();
                ArrayPush();
                break;

            case "회원가입":

                break;
        }


    }
}
