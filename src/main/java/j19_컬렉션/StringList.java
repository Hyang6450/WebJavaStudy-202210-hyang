package j19_컬렉션;

import j17_스태틱.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class StringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // list는 인터페이스라 생성 불가능 list로 구현되어 있는 ArrayList 클래스로 생성함. 형식은 제네릭이다.
        printCollection(list);

        // 값 추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");
        printCollection(list);

        list.add(1, "문자열5");
        printCollection(list);

        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list);
        addAllList.addAll(2, list);
        printCollection(addAllList);

        // 값 조회
        String str1 = list.get(0);
        System.out.println("str1 : " + str1);

        // for문
        for(int i = 0; i < list.size(); i++){
            System.out.println("일반 for문 str : " + list.get(i));
        }
        // 반복을 사용한 값 조회(forEach문)
        for(String str : list){
            System.out.println("forEach문 str : " + str);
        }
        // iterator를 사용한 반복문
        Iterator<String> iterator = list.iterator();
        System.out.println("iterator 첫 생성시 : " + iterator.next());
        while(iterator.hasNext()){
            System.out.println("iterator를 사용한 반복문 : " + iterator.next());
        }

       //  System.out.println("iterator 끝 : " + iterator.next());

        // 값 수정
        list.set(1, "문자열6");
        printCollection(list);

        // 값 삭제
        list.remove(0);
        printCollection(list);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals("문자열3")){
                list.remove(i);
                break; // 지운 후 크기가 줄어들기 때문에 break가 없으면 오류가 난다. break 필수
            }
        }
        list.add("문자열2");
        printCollection(list);

        // 값의 위치 찾기
        int index = list.indexOf("문자열2");
        System.out.println("문자열2의 위치 : " + index);


        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열2의 위치 : " + lastIndex);

        // 값을 포함하고 있는지 여부 조회
        boolean isTrue = list.contains("문자열2");
        System.out.println("list에 문자열2가 포함되어 있는가? " + isTrue);

        // 리스트를 배열로 변환
        Object[] objects = list.toArray(); // return 타입이 object 배열이라 object로 해야함.
        System.out.println(objects[0]);
        System.out.println();
        for(Object object : objects){
            System.out.println(object);
        }
    }

    public static void printCollection(Collection collection){
        System.out.println(collection);
        System.out.println();
    }
}
