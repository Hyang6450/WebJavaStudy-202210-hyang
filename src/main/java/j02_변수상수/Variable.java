package j02_변수상수;

/*변수*/
public class Variable {
    public static void main(String[] args) {

        // 논리자료형 변수
        System.out.println("논리자료형 변수");
        boolean checkFlag = false;
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);
        System.out.println();

        // 문자자료형 변수
        System.out.println("문자자료형 변수");
        char name1 = '김';
        char name2 = '지';
        char name3 = '향';
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("" + name1 + name2 + name3); // "" 문자열로 바꿔서 출력
        System.out.println('가' + 0);
        System.out.println();

        // 문자열자료형 변수
        System.out.println("문자열자료형 변수");
        String name = "김지향";
        String name4 = "노국신";
        String name5 = name + name4;

        System.out.println(name);
        System.out.println(name5);
        System.out.println();

        // 정수자료형 변수
        System.out.println("정수자료형 변수");
        int width = 100;
        int width2 = 200;
        String width3 = "300";
        String width4 = "400";
        int widthResult = width + width2;
        String widthResult2 = width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis();
        System.out.println(time);

        long time2 = 1666178885589L;
        System.out.println(time2);
        System.out.println();

        // 실수자료형 변수
        System.out.println("실수자료형 변수");
        double pi = 30000000.1415926535999999;
        System.out.println(pi);
        System.out.println();

        final String FILE_PATH = "C:/Users/junil";
//        FILE_PATH = "D:/Users/aaa"; final 변수는 변경 불가능
        System.out.println(FILE_PATH);




    }
}
