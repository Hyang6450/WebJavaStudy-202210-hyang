package j07_반복;

/*
while문
-if문인데 반복문
 */

public class Loop6 {
    public static void main(String[] args) {

        int n = 5;

        // for문 => 순차적으로 증가시킬 때 사용
        for(int i = 0; i < n; i++){
            System.out.println(i+1);
        }

        // while문 => 해당 조건이 되었을 때 멈춰라 할 때 사용
        int i = 0;  // while은 for문과 달리 조건쓰는 곳 안이 아닌 밖에 선언해줘야 함.

        while(i < n){
            System.out.println(i+1);
            i++;
        }


    }
}

