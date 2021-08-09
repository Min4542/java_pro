package day09;

public class MethodQuiz1 {

    //매소드 설정
    static int calcDivisor(int y) {
        System.out.printf("%d의 약수:", y);
        int total = 0;
        for (int i = 1; i <= y; i++) {
            if (y % i == 0) {
                System.out.printf("%s ", i);
                total += i;
            }
        }
        System.out.print("\ny의 약수 총합: ");
        return total;
    }
    public static void main(String[] args) {
        int num = calcDivisor(30);
        System.out.print(num);

    }
}
