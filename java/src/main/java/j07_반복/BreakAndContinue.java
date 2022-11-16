package j07_반복;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i = 0;

        while(true){
            if(i > 9){
                break;
            }
            System.out.println(i);
            i++;
        }

        for(int j = 0; j < 10; j++){
            if(j == 7){
                System.out.println("7을 만났습니다.");
                break;
            }
            System.out.println(j);
        }
        System.out.println("<<<<<<<<<<<<Continue>>>>>>>>>>>>");

        for(int j = 0; j < 100; j++){
            if(j % 5 != 0 || j == 0){
                continue;   // 이 후에 나오는 코드들은  무시하고 다음 반복으로 넘어가라.(밑에 있는 코드들 무시하고 반복)
            }
            System.out.println(j);
        }
    }
}
