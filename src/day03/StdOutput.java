package day03;

public class StdOutput {

    public static void main(String[] args) {
        String dog = "멍멍이";
        String cat = "야옹이";

        System.out.println(dog);
    // 경로는 (\)백슬래시 두 번으로 한다.
        String filePath = "D:\\temp\\new.jpg";
        System.out.println(filePath);


    // 백슬래시를 사용해 강조문을 나눠준다.
        String msg = "He said \"warning\" to me";
        System.out.println("msg = " + msg);

        int month = 7;
        int day = 17;
        String anni = "제헌절";
//        %d정수, %s 문자열
        System.out.println(month + "월" + day + "일은" + anni + "입니다.");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
        System.out.println("안녕");

//        %f 실수 언제나 소수점 6째 자리까지 표현합니다.
//        %.2f = 소수점 2번째 자리까지만 보여집니다.
        double saleRate = 0.2512;
        System.out.printf("오늘의 할인율은 %.2f입니다.\n", saleRate);
//        %.2f = 소수점 2번째 자리, %% = %를 나타내기 위한 %사용 ( %% = % )
        System.out.printf("오늘의 할인율은 %.2f%%입니다.", saleRate*100);



    }
}
