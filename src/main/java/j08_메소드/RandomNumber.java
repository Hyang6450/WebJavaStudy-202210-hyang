package j08_메소드;

import java.util.Random;

public class RandomNumber {

    //함수 정의할 때 int의 자료형을 썼기 때문에 return할 때 줄 수 있는 값은 int뿐 => 반환 자료형
    public static int calcRandom(int m){
        Random random = new Random();

        int result = random.nextInt(10) * 1000 + m;

        return result;
    }

    public static void main(String[] args) {
        //Random random = new Random();

        int money = 5000;

        /*int a = random.nextInt(10) * 1000 + money;
        System.out.println(a);
        int b = random.nextInt(10) * 1000 + money;
        System.out.println(b);
        int c = random.nextInt(10) * 1000 + money;
        System.out.println(c);
        int d = random.nextInt(10) * 1000 + money;
        System.out.println(d);

             for(int i = 0; i < 10; i++){
            int randNum = random.nextInt(100) + 100; // 100~199
            System.out.println(randNum);
        }*/

        // 메소드 정의(반복할 함수를 지정해놓고 불러와서 쓰기만 하면 됨)
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int r = calcRandom(money); // 위에 메소드 정의할 때 int로 하였기 때문에 int에 넣을 수 있다
        System.out.println(r + 100);
        System.out.println(r + 1000);
        System.out.println(r + 10000);


    }
}
