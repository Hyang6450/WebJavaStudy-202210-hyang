package j17_스태틱.싱글톤;

// singleton : 객체를 유일하게 하나만 생성 and 리턴
public class ProductView {

    // 싱글톤 공식 => 클래스 명 빼고는 다 동일하다. 변수명 instance로 고정
    private static ProductView instance = null;

    private ProductView() {}

    public static ProductView getInstance() {
        if(instance == null) {
            instance = new ProductView();
        }
        return instance;
    }
    // 여기까지

    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 화면");
    }
}
