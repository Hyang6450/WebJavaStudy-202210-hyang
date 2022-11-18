package j15_Object클래스;

public class Main {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김지향", "부산");

        int hashcode = objectTest.hashCode();

        System.out.println(hashcode); // hashcode 해당 객체의 실제 주소값
        System.out.println(Integer.toHexString(hashcode)); // integer를 16진수(toHexString)로 바꿔라

        System.out.println(objectTest);
    }
}
