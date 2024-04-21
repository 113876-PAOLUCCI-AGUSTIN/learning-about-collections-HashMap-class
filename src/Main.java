import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Agustin", "+54-351-6133688");
        phoneBook.put("Carlos Horacio","+54-3541-502035");
        phoneBook.put("Maria Victoria", "+54-3541-162852");

        for (String key : phoneBook.keySet()) {
            System.out.println(key + " : " + phoneBook.get(key));
        }


    }
}