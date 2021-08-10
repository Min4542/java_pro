package day09;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;

public class TPJ_Food {


    public static void main(String[] args) {


        java.lang.String[][] user = {
                {"ID1", "ID2", "ID3"},
                {"PW1", "PW2", "PW3"},
                {"가", "나", "다"}
        };

        java.lang.String[][] market = {};

        Scanner sc = new Scanner(System.in);

        // 프로그램 실행 초기 화면
        System.out.println();
        System.out.println("ISEC 음식점 관리 프로그램을 실행합니다.");
        System.out.println("점주님들의 번창을 기원합니다.");
        System.out.println();
        int io = -1;
        int passNum = 0;
        int idx =0;

        String userName = "";
        while (true) {
            System.out.println("메뉴를 선택 해주세요.");
            System.out.println();
            System.out.println("1. 회원가입 진행");
            System.out.println("2. 로그인 진행");
            System.out.println();
            System.out.print(">> ");
            int registerNum = sc.nextInt();


            switch (registerNum) {

                // 회원가입
                case 1:
                    System.out.println();
                    System.out.println("사용자의 성함을 입력해주세요.");
                    System.out.print(">> ");
                    userName = sc.next();
                    System.out.println();
                    System.out.println("사용하실 아이디를 입력해주세요.");
                    while (true) {
                        passNum = 0;
                        System.out.print(">> ");
                        String newID = sc.next();


                        for (int i = 0; i < user.length; i++) {
                            if (user[0][i].equals(newID)) {
                                passNum = 1;
                                break;
                            } else passNum = 0;
                        }


                        if (passNum == 0) {
                            System.out.println();
                            System.out.println("사용 가능한 아이디입니다.");
                            System.out.println("가입을 계속 진행합니다.");
                            System.out.println();
                        } else {
                            System.out.println("중복된 ID 입니다.");
                            System.out.println("ID를 다시 입력해주세요.");
                        }


                        if (passNum == 0) {
                            System.out.println("");
                            System.out.println("사용하실 비밀번호를 입력해주세요.");
                            System.out.print(">> ");
                            String newPW = sc.next();
                            sc.nextLine();

                            System.out.println();
                            System.out.printf("사용자 이름: %s 사장님\n", userName);
                            System.out.printf("ID: %s\n", newID);
                            System.out.printf("PW: %s\n", newPW);
                            System.out.println();
                            System.out.println("회원가입이 성공적으로 완료되었습니다!\n");

                            String temp[][] = new String[user.length + 1][user.length + 1];
                            for (int i = 0; i < user.length; i++) {
                                temp[0][i] = user[0][i];
                                temp[1][i] = user[1][i];
                                temp[2][i] = user[2][i];
                            }

                            temp[0][user.length] = newID;
                            temp[1][user.length] = newPW;
                            temp[2][user.length] = userName;

                            user = temp;
                            temp = null;
                            break;
                        }
                    }
                    continue;
                    // continue; 추가


                case 2:
                    // 로그인
                    System.out.println();
                    System.out.println("아이디를 입력하세요.");

                    //아이디 알고리즘
                    while (true) {
                        System.out.print("ID >> ");
                        String ID = sc.next();

                        //서치 알고리즘
                        passNum = 0;
                        for (int i = 0; i < user.length; i++) {
                            if (user[0][i].equals(ID)) {
                                idx = i;
                                passNum = 1;
                                break;
                            } else passNum = 0;
                        }

                        //아이디 유무 확인
                        if (passNum == 1) {
                            break;
                        } else {
                            System.out.println("아이디를 다시 입력해주세요.");
                        } // end if

                    } // end while 1


                    System.out.println("비밀번호를 입력하세요.");
                    while (true) {
                        // 비밀번호를 통과시키기 위한 번호
                        int passPW = 0;
                        int nameNum = 0;
                        System.out.print("PW >> ");
                        String PW = sc.next();
                        for (int i = 0; i < user.length; i++) {
                            if (user[1][i].equals(PW)) {
                                passPW = 1;
                                nameNum = i;

                                break;
                            } else passPW = 0;
                        }

                        if (passPW == 1) {
                            System.out.println("로그인에 성공하였습니다.");
                            System.out.println(user[2][nameNum] + " 사장님 접속을 환영합니다.");
                            break;
                        } else {
                            System.out.println("비밀번호를 다시 입력해주세요.");
                        }
                    }
            }
            break;
        }


        // END LOGIN SYSTEM
        while (true) {
            System.out.println();
            System.out.println(">> 처리하실 업무를 선택하세요.");
            System.out.println();
            System.out.println(" 1. 신규 음식점 등록");
            System.out.println(" 2. 가게 관리");
            System.out.print(">> ");
            int menuNum = sc.nextInt();


            switch (menuNum) {
                case 1:
                    System.out.println("신규 음식점 이름을 입력해주세요.");
                    String newFoodMarket = sc.next();

                    String[][] temp = new String[market.length + 1][market.length + 1];
                    int i = 0;
                    for (i = 0; i < market.length; i++) {
                        temp[idx][idx] = market[idx][i];
                    }

                    temp[market.length][market.length] = newFoodMarket;

                    market = temp;
                    temp = null;

                    System.out.printf("%s님의 새로운 음식점:%s이 등록되었습니다.\n", user[2][idx], market[i][i]);
                    System.out.printf("축하드립니다!!!!\n");
                    break;

                case 2:
                    System.out.println("1. 매출 보기");
                    System.out.println("2. 메뉴 가격 변경");
                    System.out.println("3. 상호명 변경");
                    String SelectNum = sc.next();


            }
            continue;
        }


    } // end main
} // end class
