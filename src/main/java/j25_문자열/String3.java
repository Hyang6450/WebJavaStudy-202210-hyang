package j25_문자열;

public class String3 {
    public static void main(String[] args) {
        String phoneNumber = "010-1234-4321";


        // replaceAll 해당 문자열을 찾아서 띄어쓰기로 바꿔라
        String replacePhoneNumber = phoneNumber.replaceAll("-", " ");
        System.out.println(replacePhoneNumber);

        String replacePhoneNumber1 = phoneNumber.replaceFirst("-", " ");
        System.out.println(replacePhoneNumber1);

        String replacePhoneNumber2 =
                phoneNumber.replaceAll("-", "")
                        .replaceAll("/", "")
                        .replaceAll("_", "")
                        .replaceAll(" ", "");
    }
}
