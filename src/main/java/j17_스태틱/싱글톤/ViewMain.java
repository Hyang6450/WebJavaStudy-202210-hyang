package j17_스태틱.싱글톤;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ViewMain {
    public static void main(String[] args) {
       // ProductView main = new ProductView(); ProductView가 private라서 생성안됨.
        ProductView productView = ProductView.getInstance();
        productView.showMainView();
        productView.showOrderView();

        System.out.println("--------위와 동일한 구문----------");

        ProductView.getInstance().showMainView();
        ProductView.getInstance().showOrderView();


    }
}
