package j17_스태틱;

import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {
    private String name;

    public static void main(String[] args) {
        Product[] products = new Product[5];
        /*
           1. serialNumber = 2022001, productName ="스타벅스 블랙 텀블러1"
           2. serialNumber = 2022001, productName ="스타벅스 블랙 텀블러2"
           3. serialNumber = 2022001, productName ="스타벅스 블랙 텀블러3"
           4. serialNumber = 2022001, productName ="스타벅스 블랙 텀블러4"
           5. serialNumber = 2022001, productName ="스타벅스 블랙 텀블러5"

            serialNumber는 자동 증가
       */
//        for(int i = 0; i < products.length; i++) {
//            products[i] = new Product("스타벅스 블랙 텀블러" + (i + 1));
//        }

//        products[0] = new Product("스타벅스 블랙 텀블러" + 1);
//        products[1] = new Product("스타벅스 블랙 텀블러" + 2);
//        products[2] = new Product("스타벅스 블랙 텀블러" + 3);
//        products[3] = new Product("스타벅스 블랙 텀블러" + 4);
//        products[4] = new Product("스타벅스 블랙 텀블러" + 5);
//
//
//        for(int i = 0; i < products.length; i++) {
//            System.out.println(products[i]);
//        }
        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);  // 힙 메모리가 아니고 스태틱 영역의 메모리 -> 그 공간안에 AutoIncrement가 들어가있음
        System.out.println(Product.autoIncrement);
        Product.autoIncrement++;
        System.out.println(Product.getAutoIncrement());

        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        Product p2 = new Product("p1");
        Product p3 = new Product("p1");
        Product p4 = new Product("p1");
        System.out.println(p2.getAutoIncrement());
        System.out.println(p3.getAutoIncrement());
        System.out.println(p4.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());

        System.out.println(PathRepository.PRODUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);

        Product.printInfo();    // 메소드 static이라면 생성없이 사용 가능

       ProductMain productMain = new ProductMain();
       productMain.setName("테스트");
       System.out.println(productMain.getName());

        Method1.main(new String[]{});
        Method1.call1();
    }
}
