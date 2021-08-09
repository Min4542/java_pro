package day03;

import java.util.Scanner;

// 스캐너 api를 불러오기
public class StdInput {

    public static void main(String[] args) {

        //2. 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        //3. 스캐너가 제공하는 함수들로 입력을 처리
        // next(), nextLine(): 문자열 입력처리, next()는 공백입력 불가!
        // nextInt(), nextDouble(): 각각 정수, 실수 입력처리
        System.out.println("#정보를 입력하세요!");
        System.out.print("- 이름: ");
        String name = sc.next(); //입력 커서를 만들고 입력된 데이터를 리턴

        System.out.print("- 나이: ");
        int age = sc.nextInt();

        System.out.println("========================");
        System.out.printf("입력된 이름은 %s이고, 나이는%d세입니다. \n" ,name, age);

        //4. 스캐너 자원 메모리 해제
        sc.close();

    }
}
