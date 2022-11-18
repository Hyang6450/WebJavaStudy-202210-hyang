package j11_배열;

public class ArrayTest1 {
    public static void main(String[] args) {
        int [] numArray = new int[10]; // 하나의 배열로 여러개를 묶어놈.

        int index = 9;

        numArray[index] = 10; // = numArray[9] = 10과 동일, 메모리 공간에 접근하면서 그 공간에 10을 넣음.

        for(int i = 0; i < 10; i++) {
            System.out.println(numArray[i]);
        }
    }
}
