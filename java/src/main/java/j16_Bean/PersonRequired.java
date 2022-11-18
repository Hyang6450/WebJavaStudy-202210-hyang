package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // name만 초기화하는 생성자 생성
@AllArgsConstructor // nama, age 둘다
public class PersonRequired {
    // final => 초기화 필수 => NoArgsConstructor 있을 수가 없음.
    private final String name;  // 멤버변수에 final을 선언하면 필수값이 된다.
    private int age;

}
