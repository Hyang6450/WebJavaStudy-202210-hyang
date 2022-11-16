package j10_접근지정자;

public class AccessModifierMain {
    public static void main (String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(19120012,"김지향");


        sam.showInfo();
        sam.setName("김지현");
        sam.showInfo();

        System.out.println(sam.getCode());

    }
}
