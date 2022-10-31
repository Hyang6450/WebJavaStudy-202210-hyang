package j13_추상화.추상클래스;

/*
   abstract : 추상적인

   추상클래스 (= 설계도)
   1. 추상메소드가 클래스 안에 하나라도 포함되면 해당 클래스는 추상클래스로 정의되어야 한다.
   2. 추상 클래스는 생성할 수 없다. => 추상 메소드는 구현부가 존재하지 않아 실행할 수 없으니 추상 클래스는 생성해서 쓸 수 없다.
   3. 그 외의 다른 특징은 일반 클래스와 동일하다.
*/
public abstract class Factory {

    private  String name;

    // 생성자 정의는 가능하나 호출은 불가능하다.
    public Factory(String name) {
        this.name = name;
    }

    public abstract void produce(String model);
    public abstract void management();

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    // 일반 메소드 => 추상 클래스 안에 일반 메소드 들어가도 됨.
    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름: " + name);
    }

}
