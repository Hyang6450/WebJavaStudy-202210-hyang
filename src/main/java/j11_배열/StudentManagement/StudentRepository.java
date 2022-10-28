package j11_배열.StudentManagement;

public class StudentRepository {

    private Student[] students;

    public StudentRepository() {
        students = new Student[0];
    }

    public void addStudent(Student student) {
        int index = indexOfEmpty(); // 비어있는 공간을 가져옴.

        if(index == -1){
            index = increaseArray(); // 배열을 증가시키겠다. 배열 증가시키는 메소드로 간다.
        }

        students[index] = student; // 비어있는 공간에 받은 student가 들어감.

    }

    private int indexOfEmpty(){
        for(int i = 0; i < students.length; i++){
            if(students[i] == null){
                return i; // return을 만나면 반복을 빠져나감.
            }
        }
        return -1; // 빈 공간이 없다.
    }

    // 베열을 늘리는 메소드
    private int increaseArray(){
        Student[] tempArray = new Student[students.length + 1]; // 원래 쓰던 배열에 공간이 없어 만들어 줘야함.
        for(int i = 0; i < students.length; i++){
            tempArray[i] = students[i]; // 임시공간 tempArray가 기존의 배열보다 하나가 많으니 마지막 하나는 남는다.
        }
        students = tempArray; // 새롭게 공간이 하나 늘어남.

        return students.length - 1;
    }
    public Student[] getStudents(){
        return students;
    }

    public int findStudentByName(String name){
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                if(students[i].getName().equals(name)){
                    return i;
                }
            }
        }
        return -1;
    }
    public Student getStudents(int index){
        return students[index];
    }

    public Student removeStudent(int index){
        Student student = students[index];
        students[index] = null; // 학생 지우는 법
        return student;
    }

    public Student updateStudent(int index, Student updatestudent){
        Student student = students[index];
        student.updateStudent(updatestudent);

        return student;
    }
}
