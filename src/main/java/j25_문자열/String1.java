package j25_문자열;

public class String1 {
    public static void main(String[] args) {

        String filePath = "C:/Users/junil/java-study/src/main/java/String.java";
        String filePath2 = "C:/Users/junil/project/java-study2/src/main/java/Integer.java";

        /*
         subString() -> 문자열을 잘라준다
         indexOf() -> 내가 찾는 문자열의 위치 인덱스를 반환
         */

        String projectName = "java-study";
        String fileName = "String";
        String extension = ".java";

        System.out.println("프로젝트명: " +projectName);
        System.out.println("파일명: " + fileName);
        System.out.println("확장자명: " + extension);



        int index3 = filePath2.indexOf("/src");
        String projectName2 = filePath2.substring(0, index3);
        int index4 = projectName2.lastIndexOf("/");
        String projectName3 = projectName2.substring(index4 + 1);
        System.out.println(projectName3);


        int index = filePath2.lastIndexOf("/");
        String fileName2 = filePath2.substring(index + 1, filePath2.lastIndexOf("."));



        int index2 = filePath2.lastIndexOf(".");
        String extension2 = filePath2.substring(index2);

        System.out.println(fileName2);
        System.out.println(extension2);

        int srcIndex = filePath2.lastIndexOf("/src");
        String projectPath = filePath2.substring(0, srcIndex);

        String projectName5 = projectPath.substring(projectPath.lastIndexOf("/") + 1);
        String fileName5 = filePath2.substring(filePath2.lastIndexOf("/") + 1, filePath2.lastIndexOf("."));
        String extension5 = filePath2.substring(filePath2.lastIndexOf("."));

        System.out.println(projectName5);
        System.out.println(fileName5);
        System.out.println(extension5);




    }
}
