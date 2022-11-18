package j12_상속;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    @Override   // ctrl + o 누르고 오버라이드 할 수 있음.
    public void move() {
        super.move();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
