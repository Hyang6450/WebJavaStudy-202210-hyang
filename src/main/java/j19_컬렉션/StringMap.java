package j19_컬렉션;

import java.util.*;

public class StringMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();

        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println(list);
        System.out.println(list.get(3));

        map.put("kor2022000-j", "김준일");
        map.put("kor2022000-l", "이동빈");
        map.put("kor2022000-d", "도정민");
        map.put("kor2022000-c", "최해혁");
        map.put("kor2022000-j2", "김준일");

        System.out.println(map);
        System.out.println(map.get("kor2022000-d"));

        /*
            kor2022000-c 학번의 학생의 이름을 김완준으로 바꿔라.
        */
        String serachId = "kor2022000-c";

        // put을 사용하여 값 변경
        map.put("kor2022000-c", "김완준"); // key값 중복 불가
        System.out.println(map);

        // 값 수정
        map.replace(serachId, "이성욱"); // list set() 와 동일하다.
        System.out.println(map);

        // 값 삭제
        map.remove(serachId);
        System.out.println(map);

        // 값이 들어있는지 확인하는 것
        boolean serachSuccess = map.containsKey(serachId);
        System.out.println(serachSuccess);

        boolean searchSuccess = map.containsValue("김지향");
        System.out.println(searchSuccess);

        // Entry는 Map과 동일하게 key, value로 이루어져있음.
        Set<Map.Entry<String, String>> entry = map.entrySet();
        List<Map.Entry<String, String>> entries = new ArrayList<Map.Entry<String, String>>();

        entries.addAll(entry);

        System.out.println("entry 리스트 : " + entries);

        Iterator<Map.Entry<String, String>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> e = iterator.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keySet = map.keySet();

        System.out.println("keySet >>>> " + keySet);

        Collection<String> values = map.values();

        System.out.println("values >>>> " + values);
    }
}
