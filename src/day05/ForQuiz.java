package day05;

public class ForQuiz {
    public static void main(String[] args) {
        int Num = (int) (Math.random() * 9) + 1;
        int i = 0;
        int total = 0;
        System.out.printf("랜덤 구구단 %d단\n", Num);
        for(i=1;i <= 9; i++) {
            total = Num * i;
            System.out.printf("%d X %d = %d\n", Num, i, total);
        }
    }
}
