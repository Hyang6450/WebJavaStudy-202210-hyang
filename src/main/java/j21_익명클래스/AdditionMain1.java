package j21_익명클래스;

public class AdditionMain1 {
    public static void main(String[] args) {
        // 인터페이스는 생성할 수 없으니 implements로 인터페이스 구현클래스 만들어줘야함.
        Addition<String> stringAddition = new AdditionImpl<String>();

        String str = stringAddition.add("문자열");
        System.out.println(str);

        // 임시 클래스를 정의함과 동시에 생성.(일회용 틀)
        Addition<Integer> integerAddition = new Addition<Integer>() {
            @Override
            public Integer add(Integer values) {
                return null;
            }
        };
    }
}
