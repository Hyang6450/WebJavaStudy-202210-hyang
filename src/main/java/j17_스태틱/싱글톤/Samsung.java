package j17_스태틱.싱글톤;

import lombok.Getter;


public class Samsung {


    @Getter // company get 생성
    private String company;
    private int serialNumber;

    private static  Samsung instance = null; // static 메소드에서 사용하기 위해 static으로 선언

    private  Samsung(){ // 생성자를 private
        company = getClass().getSimpleName(); // 클래스 명 가져오기 -> 클래스는 오브젝트를 상속받고 있기 때문에 가능
        serialNumber = 20220000;
    }

    public static Samsung getInstance(){
        if(instance == null){
           instance  = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model){
        return model + " _" + ++serialNumber;
    }

}
