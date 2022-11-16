package j17_스태틱.빌더;

import lombok.Builder;
import lombok.ToString;

@Builder    // 빌더 패턴을 쓰지않으면 넣고 싶지 않은 변수에도 기입을 해줘야하지만 빌더 패턴은 알아서 null을 넣어준다.
@ToString
public class User2 {
    private String username;
    private String password;
    private String email;
    private String name;

    // User2안에 각각의 값들을 to메소드를 통해 User를 생성한 후 User의 객체의 값에 옮긴다.
    public User to(){
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
