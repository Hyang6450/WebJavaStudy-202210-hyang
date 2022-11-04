package j17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args){
        User user = User.builder()
                .email("s1422@naver.com")
                .username("hyang")
                .build();

        System.out.println(user);

        User2 user2 = User2.builder()
                .name("김지향")
                .build();

        System.out.println(user2);

        User u = user2.to();
        System.out.println(u);

    }
}
