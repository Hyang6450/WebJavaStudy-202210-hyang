package j17_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String username;
    private String password;
    private String email;
    private String name;


    // 이 클래스는 여기 클래스에서만 사용 가능
    public static class UserBuilder {
        private String username;
        private String password;
        private String email;
        private String name;

        public UserBuilder username(String username){
            this.username = username;
            return this;
        }
        public UserBuilder password(String password){
            this.password = password;
            return this;
        }
        public UserBuilder email(String email){
            this.email = email;
            return this;
        }
        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public User build(){
            return new User(username, password, email, name);
        }
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }
     //자료형이 같아서 할 수 없음 => 이러한 문제때문에 빌더를 사용
//    public User(String username){
//        this.username = username;
//    }
//
//    public User(String email){
//        this.email = email;
//    }
}
