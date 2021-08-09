package day08;

import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");


        int n = sc.nextInt();
        // sc.nextLine을 미리 적어두는 이유는 초기화의 목적이다.
        // 아래쪽 nextLine이 적용이 안되기 때문이다.
        sc.nextLine();
        System.out.println("n = " + n);

        System.out.print("문자: ");
        String str = sc.nextLine();
        System.out.println("str = " + str);

        System.out.println("입력 종료!");
        sc.close();
    }
}
