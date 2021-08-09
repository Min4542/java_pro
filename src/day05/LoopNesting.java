package day05;

public class LoopNesting {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("outer # " + i);
            for (int j = 0; j < 2; j++) {
                System.out.println("inner ## " + j);
                for (int k = 0; k < 4 ; k++) {
                    System.out.println("inner__2 ## " + k);
                } // end k
            } // end j
        } // end i
    }
}
