package j11_배열;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
         1. 10명의 학생이름을 담을 수 있는 studentNames 배열을 만든다.
         1. 정빈
         2. 김규민
         3. 박경효
         4. 김혜진
         5. 김지향
         6. 전병욱
         7. 윤도영
         8. 이성욱
         9. 홍성욱
         10. 박민화
*/

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[] studentNames = null;

        System.out.print("몇명의 학생을 등록하시겠습니까? ");
        count = sc.nextInt();
        sc.nextLine(); // nextLine()을 만나기 전에는 꼭 해준다.

        studentNames = new String[count];

//        studentNames[0] = "정빈";
//        studentNames[1] = "김규민";
//        studentNames[2] = "박경효";
//        studentNames[3] = "김혜진";
//        studentNames[4] = "김지향";
//        studentNames[5] = "전병욱";
//        studentNames[6] = "윤도영";
//        studentNames[7] = "이성욱";
//        studentNames[8] = "홍성욱";
//        studentNames[9] = "박민화";

        // studentNames.length => 해당 배열의 길이를 자동으로 할당받기 때문에 배열의 크기를 바꿔도 굳이 바꿔줄 필요가 없음.
        for(int i = 0; i < studentNames.length; i++){
            System.out.print((i + 1) + "번 학생이름: ");
            studentNames[i] = sc.nextLine();
        }
        System.out.println("[ 출력결과 ]");
        for(int i = 0; i < studentNames.length; i++){
            System.out.println((i+1) + ". " + studentNames[i]);
        }
    }
}
