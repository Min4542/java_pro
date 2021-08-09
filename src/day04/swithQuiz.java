package day04;

import java.util.Scanner;

public class swithQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("조회하실 직급을 입력해주세요.");
        System.out.println("[사원, 대리, 과장, 차장, 부장]");
        System.out.print("> ");
        String Level = sc.next();

        switch (Level) {
            case "사원":
                System.out.printf("%s의 급여는 200만원 입니다.\n", Level);
                break;
            case "대리":
                System.out.printf("%s의 급여는 300만원 입니다.\n", Level);
                break;
            case "과장":
                System.out.printf("%s의 급여는 400만원 입니다.\n", Level);
                break;
            case "차장":
                System.out.printf("%s의 급여는 500만원 입니다.\n", Level);
                break;
            case "부장":
                System.out.printf("%s의 급여는 600만원 입니다.\n", Level);
                break;
            default:
                System.out.printf("%s은(는) 없는 직급입니다. 다시 입력해주세요.", Level);
        } //end switch
        sc.close();
    } // end main
} // end class
