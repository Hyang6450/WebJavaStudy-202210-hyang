package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {


        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "junil");
        jsonObject.addProperty("password", "1234");
        jsonObject.addProperty("email", "s1422@naver.com");
        jsonObject.addProperty("name", "김지향");
        jsonObject.addProperty("age", "23");

        System.out.println(jsonObject);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(jsonObject);
        System.out.println(gson);
    }
}