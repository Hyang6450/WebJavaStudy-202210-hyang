package j11_배열.StudentManagement;

public class StudentRepository {

    private Student[] students;

    public StudentRepository() {
        students = new Student[0];
    }

    public void addStudent(Student student) {
        int index = indexOfEmpty(); // 비어있는 공간을 가져옴.

        if(index == -1){
            index = increaseArray();
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
            tempArray[i] = students[i]; // tempArray가 기존의 배열보다 하나가 많으니 마지막 하나는 남는다.
        }
        students = tempArray; // 새롭게 공간이 하나 늘어남.

        return tempArray.length - 1;
    }
}
