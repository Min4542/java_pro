package day05;

import java.util.Scanner;

public class LoppQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("난이도를 선택해주세요.");
        System.out.println("[상, 중, 하]");
        System.out.print("> ");
        String Level = sc.next();
        // 정 오답 횟수 카운트
        int tCount = 0;
        int fCount = 0;

        //문제 번호
        int textNumber = 0;


        while (true) {
            // 랜덤으로 부여될 정수
            int Num1 = 0;
            int Num2 = 0;
            textNumber ++;

            // 난이도 설정
            switch (Level) {
                case "상":
                    Num1 = (int) (Math.random() * 1000) + 1;
                    Num2 = (int) (Math.random() * 1000) + 1;
                    break;
                case "중":
                    Num1 = (int) (Math.random() * 100) + 1;
                    Num2 = (int) (Math.random() * 100) + 1;
                    break;
                case "하":
                    Num1 = (int) (Math.random() * 10) + 1;
                    Num2 = (int) (Math.random() * 10) + 1;
                    break;
                default:
                    System.out.printf("%s은(는) 없는 난이도 입니다. 게임이(상) 난이도로 시작됩니다.", Level);
                    Num1 = (int) (Math.random() * 1000) + 1;
                    Num2 = (int) (Math.random() * 1000) + 1;
            } // end switch


            // 랜덤 사칙연산 ( X, -, +) 랜덤 설정
            int ri = (int) (Math.random() * 3) + 1;
            int total = 0;
            String A = "";
            if (ri == 2 && Num1 < Num2) {
                total = Num2 - Num1;
                A = "-";
            } else if (ri == 1) {
                total = Num1 + Num2;
                A = "+";
            } else if (ri == 2) {
                total = Num1 - Num2;
                A = "-";
            } else {
                total = Num1 * Num2;
                A = "X";
            } // end ri if

            // 뒷 숫자가 앞 숫자보다 큰 빼기를 할 때의 출력 메세지 설정
            if (ri == 2 && Num1 < Num2) {
                System.out.println(" ");
                System.out.printf("%d. [ %d %s %d ]의 정답을 입력하세요!\n", textNumber, Num2, A, Num1);
            } else {
                System.out.println(" ");
                System.out.printf("%d. [ %d %s %d ]의 정답을 입력하세요!\n", textNumber, Num1, A, Num2);
            System.out.print(">  "); }

            // 정답 입력
            int Num3 = sc.nextInt();


            // 정 오답 판별 if문
            if ( total == 0) {
                tCount++;
                System.out.println("## 정답입니다!");
                System.out.printf("[ 정답 횟수: %d 오답 횟수: %d ]\n", tCount, fCount);
            }
            else if ( Num3 == 0 ) {
                System.out.println(" ");
                System.out.println("게임을 종료합니다. 고생하셨습니다.");
                System.out.printf("## 최종 점수 %d점! 게임이 종료되었습니다. [정답 수: %d 오답 수: %d]\n",tCount-fCount ,tCount , fCount);
                break;
            } else if (Num3 != total) {
                fCount++;
                System.out.printf("!! 오답입니다. (정답: %d)\n", total);
                System.out.printf("[ 정답 횟수: %d 오답 횟수: %d ]\n", tCount, fCount);

            } else if (Num3 == total) {
                tCount++;
                System.out.println("## 정답입니다!");
                System.out.printf("[ 정답 횟수: %d 오답 횟수: %d ]\n", tCount, fCount);
            } // end if
        } // end while
        sc.close();
    } // end main
} // end class
