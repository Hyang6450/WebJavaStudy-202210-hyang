package j09_클래스;

// ClassA라는 자료형
public class ClassA {

    int num;
    String name;
    double score;

    // 생성자 => 반환자료형이 없음. 클래스이름과 동일해야 함.
    // 항상 반환이 있음 주소값으로 반환함.
    // 메소드처럼 사용 가능함.
    // 다른 생성자로 오버로딩 해버리면 기본 생성자가 비활성화 됨.(둘다 쓰고싶으면 밑에처럼)
    ClassA(){
     //no argument constructor
    }
    ClassA(int a){
        System.out.println("a: " + a);
        System.out.println("ClassA를 생성합니다.");
    }

    // void라서 반환 불가 ex)System.out.println(a1.callName);불가
    void callName(){
        System.out.println(name + "을(를) 부릅니다.");
    }
}
