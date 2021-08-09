package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySeachQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //변경 전 정보
        String[] name = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        while (true) {
            //정보 수정
            System.out.println(" ");
            System.out.println("변경 전 정보: " + Arrays.toString(name));
            System.out.println("# 수정 할 멤버의 이름을 입력하세요.");
            System.out.print("> ");

            // 찾을 이름
            String target = sc.next();
            // 찾을 idx의 번호 저장
            // 못찾았으면 -1의 값은 변하지 않는다.
            int idx = -1;

            for (int i = 0; i < name.length; i++) {
                if (name[i].equals(target)) {
                    idx = i;
                    break;
                }
            } // end if


            if (idx != -1) {
                System.out.printf("%s의 이름을 변경합니다!\n", target);
                System.out.print("변경하실 이름: ");
                String edit = sc.next();
                name[idx] = edit;
                System.out.println("변경 후 정보: " + Arrays.toString(name));
                sc.close();
                break;
            } else {
                System.out.printf("%s은(는) 존재하지 않는 이름입니다.\n", target);
            }
        } // end for

    }
}

