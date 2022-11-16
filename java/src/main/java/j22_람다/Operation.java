package j22_람다;

@FunctionalInterface // 추상메소드 두개를 선언할 수 없게 방지를 해준다.
public interface Operation {
    public int calc(int x, int y);

    public default String resultToString(int result){
        return "결과: " + result;
    }
}
