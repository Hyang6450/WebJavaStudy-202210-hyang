package j22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Runnable 리턴이 없어서 중괄호를 열어줘야 함. 쓰레드에서 가장 많이 쓰임
        Runnable runnable1 = () -> {
            System.out.println("첫번째 프로그램을 실행합니다.");
        };
        Runnable runnable2 = () -> {
            System.out.println("두번째 프로그램을 실행합니다.");
        };

        runnable1.run();
        runnable2.run();

        // 쓰레드는 순서에 상관없이 동시에 같이 돈다.
        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 100; i++){
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드1: " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 100; i++){
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드2: " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //thread1.start();
        //thread2.start();

        Supplier<String> supplier = () -> "공급";
        System.out.println(supplier.get());

        // 매개변수가 하나인 경우 괄호 생략 가능 (name) => name
        Consumer<String> consumer = name -> {
            System.out.println("이름: " + name);
        };

        consumer.accept("홍길동");

        Function<Integer, String> function = age -> "나이: " + age;
        System.out.println(function.apply(23));
        Predicate<Integer> leapMonth = year -> year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(leapMonth.test(2000));
    }
}
