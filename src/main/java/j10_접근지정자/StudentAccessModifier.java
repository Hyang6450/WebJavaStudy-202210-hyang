package j10_접근지정자;

//접근 지정자
//
//같은 패키지 or 다른 패키지 안에 있는 것들에 대해 접근을 제한할 수 있다.
//
//public(공개) - 어디서나 접근 허용
//default - 동일 패키지 내, 아무것도 입력 안했을 시엔 default로 잡힘.
//protected - 동일 패키지와 상속 받은 클래스 내부
//private(비공개) - 동일 클래스 내, 외부 접근 불가능

// 메소드는 대부분 public
public class StudentAccessModifier {
    private int code; // 멤버변수들은 무조건 private
    private String name;

    // 외부로 부터 생성자가 값을 대신 받아서 값을 전달함.
    public StudentAccessModifier(int code, String name) {
        this.code = code;
        this.name = name;
    }
    // alt+insert 눌러서 get.set 자동 추가 가능
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("학번: " +code);
        System.out.println("이름: " +name);
    }
}
