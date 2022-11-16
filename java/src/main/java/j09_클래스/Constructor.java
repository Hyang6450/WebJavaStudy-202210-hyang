package j09_클래스;

public class Constructor {

    int num; // 전역변수
    String name;

    // ex) 아무런 옵션이 없는 차
    Constructor(){
        System.out.println("NoArgsConstructor(기본 생성자)");
    }

    // 지역변수 num => java에서는 전역보다 지역이 우선순위가 높음.
    // 생성하면서 값 주입.
    Constructor(int num){
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로하는 생성자)");
        this.num = num;
    }
    Constructor(String name){
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로하는 생성자)");
        this.name = name;
    }
    Constructor(int num, String name){
        System.out.println("AllArgsConstructor(전체 생성자)");
        this.num = num;
        this.name = name;
    }

    // this 쓸 필요 없음 => 지역변수가 선언되어 있지 않아서
    void showInfo(){
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }

}
