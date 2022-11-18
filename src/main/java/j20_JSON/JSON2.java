package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@AllArgsConstructor
@Data
class User{
    private String username;
    private String password;
    private String email;
    private String name;
}

public class JSON2 {
    public static void main(String[] args) {
        // Gson으로 변환할 수 있는 객체의 종류
        // JsonObject, Object, Map

        // 두개 동일하다. GsonBuilder-> 뒤에 속성들을 담아줄 수가 있다.
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        // Object(객체) -> JSON
        User user = new User("hyang", "1234", "s1422@naver.com","김지향");
        System.out.println(gson.toJson(user));
        System.out.println(gsonBuilder.toJson(user));
        userJson = gsonBuilder.toJson(user);

        // toJson -> 반환타입 String
        System.out.println(gson.toJson(user));
        System.out.println(gsonBuilder.toJson(user));

        // JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode","20220001");
        jsonObject.addProperty("studentName","김지향");
        jsonObject.addProperty("studentYear","2");

        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);

        // Map -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "P-20220001");
        map.put("productName", "삼성 노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);

        //JSON -> Map
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);

        // JSON -> JsonObject
        JsonObject jsonobj = convertJsonToJsonObject(userJson);
        System.out.println(jsonobj);

        jsonobj = convertJsonToJsonObject(studentJson);
        System.out.println(jsonobj);

        jsonobj = convertJsonToJsonObject(productJson);
        System.out.println(jsonobj);

        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);
    }

    public static Map convertJsonToMap(String json){
        Gson gson = new Gson();
        // fromJson (json, 내가 변환하고자 하는 것)
        return gson.fromJson(json, Map.class);
    }

    public static JsonObject convertJsonToJsonObject(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);
    }

    public static User convertJsonToUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }
}