package j25_문자열;

public class String2 {
    public static void main(String[] args) {
        String phoneNumber = "010-9988-1916";

        int firstHyphenIndex = phoneNumber.indexOf("-"); // indexOf -> -여기서 부터
        int LastHyphenindex = phoneNumber.lastIndexOf("-"); // lastIndexOf -> - 뒤에서 부터


        System.out.println("index: " + LastHyphenindex);

        String subStringLastNumber = phoneNumber.substring(LastHyphenindex + 1);
        String subStringmidNumber = phoneNumber.substring(firstHyphenIndex + 1 ,LastHyphenindex);


        System.out.println(subStringLastNumber);
        System.out.println(subStringmidNumber);


    }
}
