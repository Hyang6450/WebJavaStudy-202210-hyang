package j25_문자열;

import java.util.UUID;

public class UUIDString {
    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();

        System.out.println(uuid.replaceAll("-", ""));

        String replaceUUID = uuid.replaceAll("-", "");
        String leftUUID = replaceUUID.substring(0, replaceUUID.length()/2);
        String rightUUID = replaceUUID.substring(replaceUUID.length()/2);

        System.out.println("leftUUID: " + leftUUID);
        System.out.println("rightUUID: " + rightUUID);

    }
}
