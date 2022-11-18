package j15_Object클래스;

public class StringEquals {

    public static void main(String[] args) {
        String name1 = "김지향";
        String name2 = "김지향";
        String name3 = new String("김지향");
        String name4 = new String("김지향");

        System.out.println(name1 + ", " + name2 + ", " + name3);

        System.out.println(name1 == name2); // 문자를 비교
        System.out.println(name1 == name3);
        System.out.println(name3 == name4); // 주소 비교
        System.out.println(name1.equals(name3)); // 주소 비교가 아닌 값 비교
    }
}
