package day04;


import java.util.Scanner;

public class WhileQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ~~ 부터
        System.out.print("정수 1: ");
        int Num1 = sc.nextInt();

        System.out.print("정수 2: ");
        // ~~ 까지
        int Num2 = sc.nextInt();

        // 총 합이 나타날 변수
        int total = 0;

        // 5~9라고 생각하면 +6,+7 ... 의 덧셈을 하기 위한 변수
        int n = Num1;

//      for (int n=Num1; n<=Num2; n++) for문으로 변경시
        while (n <= Num2 ){
            n++;
            total += n;
        } // end while
        System.out.printf("%d", total);
        sc.close();
    } // end main
} // end class
