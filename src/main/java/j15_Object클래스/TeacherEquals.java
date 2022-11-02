package j15_Object클래스;

public class TeacherEquals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        j15_Object클래스.equals.Teacher teacher2
                = new j15_Object클래스.equals.Teacher("김준일", "코리아아이티");


        // System.out.println(teacher1 == teacher2); -> 자료형 자체가 달라서 안됨.

        System.out.println(teacher1.equals(teacher2)); // 기본적으로 주소 비교 -> equals 오버라이드 해놔서 ㄱㅊ
                                                       // 클래스 자체가 달라서 false
        System.out.println(teacher1.hashCode() == teacher2.hashCode()); // hashCode는 동일한 주소를 만들어 주기 때문에 값만 같으면 True


    }
}
