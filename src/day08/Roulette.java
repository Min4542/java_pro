package day08;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Roulette {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("게임 인원은 최소 2명에서 4명까지 입력 하세요.");
        System.out.print(">> ");
        //총 참여 인원 수
        int playerNum = sc.nextInt();

        //인원 수의 범위가 적당한지 확인
        if (playerNum < 2 || playerNum > 4) {
            System.out.println("인원수가 올바르지 않습니다. GAME OVER!");
            return;
        }

        //플레이어의 이름들을 저장할 배열
        //배열의 크기는 참여인원만큼 설정
        String[] players = new String[playerNum];

        //참여 인원 수대로 이름을 반복 입력 받은 후 배열에 저장
        System.out.println("\n플레이어 이름을 등록합니다.");
        for (int i = 0; i < players.length; i++) {
            System.out.printf("%d번 플레이어 이름: ", i + 1);
            players[i] = sc.next();
        }
        //참여 인원 이름 출력
        System.out.println(Arrays.toString(players) + "님이 참가 하셨습니다.");

        System.out.println("\n실탄 개수는 6개 미만으로 설정 하세요.");
        System.out.print(">> ");
        int bulletNum = sc.nextInt();
        sc.nextLine();

        //탄창 배열을 생성 (공간 6개)
        boolean[] magazine = new boolean[6];

        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
        //입력된 실탄 수만큼 배열의 내부값을 true로 랜덤하게 바꿔줌
        int successCount = 0; //정확히 총알을 장전한 횟수
        while (successCount < bulletNum) {
            int position = (int) (Math.random() * 6);
            if (!magazine[position]) {//탄창이 빈 곳만
                magazine[position] = true; //장전해라
                successCount++; //성공시 카운트 증가
            }
            //if (bulletNum == successCount) break;
        }
        //System.out.println("탄창: " + Arrays.toString(magazine));


        //=============게임 시작 로직 ===============//
        //선턴 플레이어 랜덤 결정
        //랜덤 인덱스 생성 (플레이어 수에 따라 변경)
        int turn = (int) (Math.random() * playerNum);
        System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[turn]);

        //한 턴 내에서 해야 할 일
        /*
            1. 탄창을 돌린다: 0~5 사이의 인덱스를 랜덤 결정한다.
            2. 격발한다: 위에서 나온 인덱스를 통해 탄창을 조회하여 실탄이 있는지 확인
            3. 사망 판정: 실탄이 있었다면 사망처리, 없었다면 다음 턴으로 넘어감.
         */

        int life = playerNum; // 살아있는 사람들 카운트
        int bulletCount = 6; // 총알 개수


        while (true) {
            // life를 playerNum에 맞춰 생존자의 숫자를 판단한다.
            if (bulletCount == 0) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("    총알이 모두 소모되어 게임을 종료합니다.");
                System.out.printf("     생존자 명단: ");
                System.out.printf(Arrays.toString(players));
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;
            }
            ;
            if (life == 1) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("    우승자가 결정되어 게임을 종료합니다.");
                System.out.printf("     최종 우승자는 [%s]님 축하드립니다!!", players);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;
            }
            System.out.printf("\n[%s님의 턴!] 실린더를 돌립니다.\n", players[turn]);
            int bulletPosition = (int) (Math.random() * magazine.length);

            System.out.println("# 엔터를 누르면 격발합니다.");
            sc.nextLine();
            bulletCount--; // 총알 소모 카운트 감소

            //사망 판정
            if (magazine[bulletPosition]) {
                System.out.printf("\n빵!! [%s]님 사망....\n", players[turn]);
                life--;
                magazine[bulletPosition] = false;

//                ## 사망자 명단 제거
                // 사망자
                String target = players[turn];

                // 사망자 제거를 위한 idx
                int idx = -1;
                for (int i = 0; i < players.length; i++) {
                    if (players[i].equals(target)) {
                        idx = i;
                        break;
                    } // end if

                } //end for

                // 배열을 한 칸씩 당겨준다.
                if (idx != -1) {
                    for (int i = idx; i < players.length - 1; i++) {
                        players[i] = players[i + 1];
                    }
                    // ArrayPop
                    String[] temp = new String[players.length - 1];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = players[i];
                    }
                    players = temp;
                    temp = null;
                    System.out.print("생존자 명단: ");
                    System.out.println(Arrays.toString(players));

                    //사망한 플레이어가 마지막 턴일 때
                    if (turn == players.length) {
                        turn = 0;
                    }
                    continue;
                }
            } else {
                //생존한 경우: 턴을 넘김
                System.out.println("휴.... 살았습니다.");
                if (turn == players.length - 1) {
                    //마지막 플레이어는 턴을 첫번째로 돌려놓는다.
                    turn = 0;
                } else {
                    turn++;
                }
            }
        }
    }
}