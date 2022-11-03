package j17_스태틱;

import lombok.Data;

@Data
public class Product {
    public static int autoIncrement = 2022000; // static : 정적변수(공유영역), 생성 될때마다 값이 유지

    // 멤버변수는 스태틱 메소드에서 사용할 수 없다
    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }

    public static void printInfo(){
        // System.out.println(productName); // static 메소드 안에서는 static 변수들만 사용가능 -> static은 클래스 생성되자마자 메모리가 할당(static이 아니면 생성이 되어야 메모리가 할당)

        Product product = new Product("product"); // 이런식으로 생성 후 사용 가능
        System.out.println(product.productName);
        System.out.println(autoIncrement);
    }


}
