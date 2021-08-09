package day09;

public class Parameter {

    //랜덤으로 음식명 하나를 리턴하는 메서드
    static String foodName() {
        String[] foods = {"짬뽕", "짜장", "볶음밥", "튀김", "족발", "보쌈", "국수"};
        return foods[(int) (Math.random() * foods.length)];
    }

    // 전달받은 n개의 정수의 합을 구해 리턴하는 메서드
    static int calcNumbersTotal(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    static int addTwo(int n1, int n2) {
     return n1+n2;
    }

    public static void main(String[] args) {

        System.out.println(foodName());
        System.out.println(addTwo(30,41));

        int[] nums = {10, 30, 40, 50, 60, 70};
        System.out.println(calcNumbersTotal(nums));
        
        int total2 = calcNumbersTotal(new int[]{50, 40, 20, 30});
        System.out.println("total2 = " + total2);
        

    }
}
