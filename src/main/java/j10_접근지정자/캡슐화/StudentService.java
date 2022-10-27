package j10_접근지정자.캡슐화;

public class StudentService {
    // doubleCheckStudent 메소드는 registerStudent를 호출해야 사용가능이며 이 클래스 내부에서만 사용가능
    public void registerStudent(){

        System.out.println("[ 학생 정보 등록 메뉴 ]");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("김지향");
        System.out.println("학생정보를 등록합니다.");
    }

    // 캡슐화 : get.set 이고 다른 사람이 건들면 안되는 메소드
    private boolean doubleCheckStudent(String studentName){
        // 문자열 비교 equals
        if(studentName.equals("김지향") ){
            return false;
        }

        return true;
    }

}
