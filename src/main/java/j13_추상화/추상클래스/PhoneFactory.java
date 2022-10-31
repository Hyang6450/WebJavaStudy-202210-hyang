package j13_추상화.추상클래스;

// 추상 클래스를 상속 받을 때 구현 OR 해당 클래스도 추상 클래스이어야 함.
public class PhoneFactory extends Factory {
    // 선언부 {구현부} => 정의
    // 구현부 : 구체적인 내용을 구현한다.
    // 이 메소드는 꼭 구현을 해야하기 때문에 강제성을 띈다.

    public PhoneFactory(String name) {
        super(name);
    }


    @Override
    public void produce(String model){
        System.out.println("[ " + model + " ]모델 스마트폰을 생산합니다.");
    }

    @Override
    public void management() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
