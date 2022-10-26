package j09_클래스;

public class ClassAMain {
    public static void main(String[] args) {
        // 생성자 호출이 먼저 된 후 주소값 출력
        System.out.println(new ClassA()); // new ClassA() => 메소드, 어디에 있는지에 대한 주소를 나타냄.
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());

        //자료형     변수명
        ClassA a1 = new ClassA(); // 동적 메모리 할당
        ClassA a2 = new ClassA();

        // . => 주소참조
        a1.name = "김지향";
        System.out.println(a1.name);
        a2.name = "김지현";
        System.out.println(a1.name);
        System.out.println(a2.name);


        // 생성한 메소드
        a1.callName();
        a2.callName();

        /*메모리 스택, 힙
            스택 => 메모리를 알아서 필요한 공간만 할당, 정적 메모리 할당
                    ex) 학생을 추가한다했을 때 다시 할당해야함 => 유동적이지 못함
            힙 => 남아있는 공간을 빌리는 것, 동적 메모리 할당
         */
    }
}
