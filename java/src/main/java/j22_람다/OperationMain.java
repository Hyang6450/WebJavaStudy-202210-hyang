package j22_람다;

public class OperationMain {

    public static void main(String[] args) {
        int a = 10, b = 20;

        Operation add = new Operation() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };

        Operation add2 = (x, y) -> x + y;

        Operation sub = (x, y) -> x - y;

        Operation multi = (x, y) -> x * y;

        Operation div = (x, y) -> x / y;

        System.out.println(sub.resultToString(sub.calc(b, a)));
        System.out.println(add.resultToString(multi.calc(b, a)));
        System.out.println(add.resultToString(div.calc(b, a)));



        int addResult = add.calc(a, b);
        System.out.println(a + " + " + b + " = " + addResult);

        int addResult2 = add.calc(a, b);
        System.out.println(a + " + " + b + " = " + addResult2);

    }
}
