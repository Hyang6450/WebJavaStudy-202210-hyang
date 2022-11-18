package j07_반복;

public class Star {
    public static void main(String[] args) {
        // i는 줄을 반복문
        for(int i = 0 ; i < 10; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i = 0; i <10; i++){
            for(int j = 0; j < 10 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10 - i -1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 10; i++){
            for(int k = 0; k < i ; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < 10 - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
