package j25_문자열;

public class String5 {

    public static void main(String[] args) {


        //toUpperCase -> 대문자로 바꿔라.
        //toLowerCase -> 소문자로 바꿔라.
        //equalsIgnoreCase -> 영문자를 대소문 구분없이 비교해라.
        String httpMethod = "Get";

        if(httpMethod.equalsIgnoreCase("GEt")){
            System.out.println("get요청입니다.");
        }else{
            System.out.println("get요청이 아닙니다.");
        }

    }
}
