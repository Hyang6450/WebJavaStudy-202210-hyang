package j09_클래스;

//ClassName : Student
//
// Properties(속성) - (멤버)변수
// schoolName
// studentCode
// studentYear
// name
//
// Funtion(기능) - (멤버)메소드
// increaseStudentYear() - 호출시에 현재 학년을 1학년 증가 (최대 5학년)
// showStudentInfo() - 학생 정보 출력
//
// 부산대학교
// 20220001
// 2
// 김준일
//
// increaseStudentYear();
// showStudentInfo();
//
// 부산대학교
// 20220001
// 3
// 김준일


public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.schoolName ="부산대학교";
        student1.studentCode = 20220001;
        student1.studentYear = 2;
        student1.name = "김준일";

        student2.schoolName ="동명대학교";
        student2.studentCode = 19120012;
        student2.studentYear = 5;
        student2.name = "김지향";

        student1.increaseStudentYear();
        student1.showStudentInfo();


        student2.increaseStudentYear();
        student2.showStudentInfo();
    }

}
