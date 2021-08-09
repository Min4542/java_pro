package day02;

public class PlusMinousOperator {
    public static void main(String[] args) {

//        ++과 --는 후위연산자이다. (나중에 계산)
//        ex) ++x (먼저계산) y--(나중계산)
        int x = 3; // y = 4 // z = 5
        int y = ++x +5 *3; // ++x = 4 => 5*3 = 15 => 15+4 = 19 # x = 4
        int z = 5* y-- + x++ - --y;
        // 5*y = 95 => y-- y = 18 => 18+4 = 22
        // => --y = 17 => 4 - 17 = 13 => x++ x =5 => 95-13 => 82
//
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
