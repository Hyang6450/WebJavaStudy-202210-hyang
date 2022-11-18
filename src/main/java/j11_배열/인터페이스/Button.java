package j11_배열.인터페이스;

public abstract class Button implements Press, Up, Down {
    @Override
    public void onDown() {}

    @Override
    public void onPressed() {}

    @Override
    public void onUp() {}
}
