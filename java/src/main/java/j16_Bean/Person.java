package j16_Bean;

public class Person {
    // final => 초기화 필수 => NoArgsConstructor 있을 수가 없음.
    private final String name;  // 멤버변수에 final을 선언하면 필수값이 된다.
    private int age;

    // public Person(){}  <- NoArgsConstructor는 RequiredArgsConstructor와 함께 쓸 수 없다.

    // RequiredArgsConstructor
    public Person(String name) {
        this.name = name;
    }

    // AllArgsConstructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
