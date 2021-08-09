package day02;

public class Casting1 {
    public static void main(String[] args) {

        //묵시적 형변환(promotion, upcasting)
        byte a = 100;
        int b = a;  // a가 byte타입에서 int로 승격됨. // 정수
        
        double c = b; // b가 int타입에서 double로 승격됨. // double = 실수
        System.out.println("a = " + a); // byte 100
        System.out.println("b = " + b); // int 100
        System.out.println("c = " + c); // double 100

        //명시적 형변환 (downcasting)
        int n = 1000;
        byte m = (byte)n;
        System.out.println("m = " + m);

        double d = 500.1234; // 실수
        int i = (int)d; // = 500 ## 소수점이 모두 날라감
        System.out.println("i = " + i);

 // 작은 데이터에서 큰 데이터는 자동으로 변환되지만,
 // 큰 데이터에서 작은 데이터는 명시적으로 처리 해줘야한다.

 char r = 'A'; // 유니코드 A = 65
 int o = r;
 short p = (byte)o;
        System.out.println("p = " + p);
        
    }
}
