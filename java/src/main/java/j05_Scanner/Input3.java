package j05_Scanner;

import java.util.Scanner;

public class Input3 {

    /*
        이름 : 김지향            name
        나이 : 23살             age
        주소 : 부산 동구 범일동   address
        연락처 : 010 4825 6450  phone

        사용자의 이름은 김지향이고 나이는 23살입니다.
        주소는 부산 동구 범일동이며 연락처는 010 4825 6450입니다.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String address = null;
        String phone = null;

        System.out.print("이름: ");
        name = scanner.next();

         System.out.print("나이: ");
         age = scanner.nextInt();
         scanner.nextLine();

         System.out.print("주소: ");
         address = scanner.nextLine();


         System.out.print("연락처: ");
         phone = scanner.nextLine();

        System.out.println("사용자의 이름은 " + name + "이고 나이는 " +age + "살입니다.\n주소는 " + address + "이며 연락처는" + phone + "입니다.");

    }
}
