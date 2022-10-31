package j12_상속;

/* 상속
    extends : 확장한다
*/
public class Human extends Animal{
    public Human(String name){
       // super(); // 부모의 주소, 기본적으로 생략되어 있음, 상속받았을 때 부모가 먼저 호출, 항상 부모생성자가 제일 위에 존재해야함.
        super(name);
        System.out.println("Human 생성");
    }

    /*
    메소드 오버라이딩(오버라이드)
    [ 재정의 ]
    상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시 정의하는 행위
     */
    @Override   // @ => 어노테이션
                // 오버라이딩 했을 경우 메소드 위에 @Override써줘야함. => 해당 메소드가 상위 객체로부터 재정의된 메소드입니다를 표기하기 위해서
    public void move(){
        super.move();   // 재정의 한 후 상위 메소드를 쓰고 싶으면 super.move();해야함.
        //  move(); 재귀함수 => 자기 함수를 계속 호출이므로 무한 루프에 빠짐.
       System.out.println("두 발로 걷습니다.");
    }

}
