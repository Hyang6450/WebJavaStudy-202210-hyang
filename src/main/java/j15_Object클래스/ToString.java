package j15_Object클래스;


public class ToString {
    public static void main(String[] args) {
        ObjectTest objectTest   = new ObjectTest("김지향", "부산");

        System.out.println(objectTest); //toString 오버라이드 해서 멤버변수들의 상태값 확인하기 위해 사용
        System.out.println(objectTest.toString());

        String str = objectTest.toString(); // String str = objectTest는 안된다. 안에 있는 스트링을 쓰고싶을땐 이렇게만 사용 가능
        System.out.println(str);
        System.out.println(objectTest.showInfo());

        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준이", "부산교육대학원");

        System.out.println(teacher1);
        System.out.println(teacher2);
    }

}
