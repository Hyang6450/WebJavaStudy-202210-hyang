package j19_컬렉션;

import java.util.*;


public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>(); // list를 업캐스팅해서 사용
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        String searchName = "김규민";

        for(Student student : students){
            if(student.getName().equals(searchName)){
                System.out.println(searchName + " 학생의 학번 : " + student.getId() );
                break;
            }
        }

        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getName().equals(searchName)){
                System.out.println(searchName + " 학생의 학번 : " + student.getId());
                break;
            }
        }

        int serachId = 20220002;
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getId() == serachId){
                students.remove(i);
                break;
            }
        }

        for(Student student : students){
            if(student.getId() == serachId){
                students.remove(students.indexOf(student));
                break;
            }
        }
        System.out.println(students);


        /*
        id : 20220003인 학생을 찾아서 그 학생의 이름이 김규민이면
        이 학생의 이름을 김경민으로 바꿔라.
         */
        serachId = 20220003;
        for(Student student : students){
            if(student.getId() == serachId && student.getName().equals("김규민")) {
                student.setName("김경민");
                break;
            }
        }
        System.out.println(students);

        System.out.println("-----------------------------------------------");

        for(Student student : students){
            System.out.println(student);
        }
        System.out.println();

        /*
        박경효를 박창우로 변경
         */
        serachId = 20220004;
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getId() == serachId){
                student.setName("박창우");
                break;
            }
        }

//        serachId = 20220004;
//        Iterator<Student> iterator = students.iterator();
//        while(iterator.hasNext()){
//            if(iterator.next().getId() == serachId){ // next()를 하고 next()라서 값을 꺼낸 후 그 뒤에 값의 이름을 교체함.
//                iterator.next().setName("박창우");
//                break;
//            }
//        }
        System.out.println(students);

        // 값을 거꾸로 출력
        List<Student> reverseStudents = new ArrayList<Student>();

        for(int i = 0; i < students.size(); i++){
           reverseStudents.add(students.get(students.size() - 1 - i));
        }

        System.out.println(reverseStudents);

        for(Student student : students){
            reverseStudents.add(0, student);
        }

        System.out.println(reverseStudents);

        Collections.reverse(reverseStudents);
        System.out.println(reverseStudents);


        // id와 name을 배열에 저장하여 각자 출력
        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

        for(Student student : students){
            idList.add(student.getId());
            nameList.add(student.getName());
        }

        System.out.println(idList);
        System.out.println(nameList);

        students.clear();
        System.out.println(students);

        for(int i = 0; i < idList.size(); i++){
            students.add(new Student(idList.get(i), nameList.get(i)));
        }
        System.out.println(students);
    }
}
