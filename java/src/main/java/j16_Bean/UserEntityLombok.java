package j16_Bean;

import lombok.*;

import java.util.Objects;

// Entity Class : 정보를 담는 객체
/*
    Entity Class 정의하는 순서

    멤버변수 선언
    생성자 정의
    Getters and Setters 정의
    Equals and HashCode 정의
    toString 정의
*/
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 전체 생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data // @Getter + @Setter + @EqualsAndHashCode + @ToString
public class UserEntityLombok {

    private String username;
    private String password;
    private String email;
    private String name;


}
