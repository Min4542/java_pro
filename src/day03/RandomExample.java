package day03;

public class RandomExample {

    public static void main(String[] args) {

        //Math.random(): 0.0이상 1.0미만의 실수 난수 생성
        double rn = Math.random();
        System.out.println("랜덤값: " + rn);

        //double ri = (Math.random() * 10) + 1; = 1.0 ~ 10.0으로 나타난다.
        int ri = (int) (Math.random() * 10) + 1;
        System.out.println("ri = " + ri);

        /*
            - 랜덤 정수 생성방법
            # 1이상 10이하의 랜덤 정수 생성

            Math.random()         ->   0.0 <= ~ < 1.0
            Math.random() * 10    ->   0.0 <= ~ < 10.0
           (int)(Math.random() * 10)  ->  0 <= ~ < 10
           double(실수)을 int(정수)로 형 변환 소수점 탈락.
           (int)(Math.random() * 10) +1  ->  0 <= ~ < 11 ( 1 <= ~ < 11 ) ( 10 )

           #공식 x이상 y이하의 랜덤정수
           (int) (Math.random() * (y-x+1)) + x

         */
    }
}
