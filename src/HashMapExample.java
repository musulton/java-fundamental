import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> ibuKota = new HashMap<>();
        ibuKota.put("Indonesia", "Jakarta");
        ibuKota.put("Malaysia", "Kuala Lumpur");

//        for (var item: ibuKota.values()) {
//            System.out.println(item);
//        }

        for (var item: ibuKota.entrySet()) {
            System.out.println("Key = " + item.getKey());
            System.out.println("Value = " + item.getValue());
        }

//        System.out.println(ibuKota);
    }
}
