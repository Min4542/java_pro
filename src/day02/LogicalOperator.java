package day02;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int x1 = 10, y1 = 20;
        // false & true = false                    (AND 1 == 2 = true)
        // true | false = true                     (OR 1==2 = false)
        boolean result1 = (x != 10) & (++y == 21);
        boolean result2 = (x == 10) | (++y == 21);

        // result1,2는 AND 혹은 OR의 조건에 맞지 않아도 뒤 연산을 실행한다.
        // 하지만 &&,||는 연산의 앞 조건이 맞지 않으면 뒤 연산을 실행하지 않는다.
        boolean result3 = (x1 != 10) && (++y1 == 21);
        boolean result4 = (x1 == 10) || (++y1 == 21);


        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);
    }
}
