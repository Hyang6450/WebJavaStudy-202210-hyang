package j07_반복;


public class Loop5 {
    public static void main(String[] args) {

        // 선언은 초기화되기 때문에 상관없음.
        for(int i = 0; i < 8; i++) {

            int dan = i + 2;

            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + " X " + num + " = " + (dan * num));
            }
        }


        // 2단부터 9단까지 출력
        for(int i = 2; i < 10; i++){
           for(int j = 1; j < 10; j++){
               System.out.println(i + " X " + j + " = " + (i * j));
           }
            System.out.println();
        }
    }
}

