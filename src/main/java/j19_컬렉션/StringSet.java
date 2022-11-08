package j19_컬렉션;

import java.util.*;

public class StringSet {
    public static void main(String[] args) {
        // Hash : 자료를 일정한 식별 값으로 나타내기 위한 노력의 산물이다.
        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();
        strList.add("이동빈"); // list로 되어 있어도 hash의 자료구조를 따른다.
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일");

        // 값 추가
        strSet.add("김준일");   // set은 순서가 없기 때문에 add, addAll 밖에 없음
        strSet.add("장혜민");   // set은 중복제거용으로 쓰인다.
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");

        System.out.println(strSet);
        strSet.addAll(strList);
        System.out.println(strSet);

        // 값 조회
        String serachName = "김준일";

        /*
            strSet에 김준일이 있으면 true, 없으면 false
         */
        boolean isTrue = false;
        for(String name : strSet){
            if(name.equals(serachName)){
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);

        // 값 수정 : set에는 수정이 불가능 하므로 수정을 위해서는 해당 값 삭제한 후 추가해야 한다.
        /*
            송아셀 -> 남강석
         */
        serachName = "송아셀";
        for(String name : strSet){
            if(name.equals(serachName)){
                strSet.remove(serachName);
                strSet.add("남강석");
                break;
            }
        }
        System.out.println(strSet);

        // 값 조회
        serachName = "김준일";
        System.out.println(strSet.contains(serachName));

        // 값 수정
        if(strSet.contains(serachName)){
            strSet.remove(serachName);
            strSet.add("김준이");
        }
        System.out.println(strSet );
    }
}
