package j12_상속;

public class Animal {
    private String name;// 변수를 상속한다는 건 -> getter,setter

    public Animal(String name) {
        System.out.println("Animal 생성");
        this.name = name;
    }

    public void move(){
        System.out.println("움직입니다.");
    }

    // alt + insert => getter,setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
