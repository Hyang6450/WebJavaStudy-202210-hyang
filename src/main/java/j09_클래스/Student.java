package j09_클래스;

public class Student {
    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void increaseStudentYear(){
        if(studentYear < 5){
            studentYear+= 1;
        }
        else{
            System.out.println("현재 학생은 5학년입니다.");
        }
    }

    void showStudentInfo(){
        System.out.println(schoolName + "\n" + studentCode + "\n" + studentYear + "\n" + name);
        System.out.println();
    }
}
