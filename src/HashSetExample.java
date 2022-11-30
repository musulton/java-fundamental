import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> days = new HashSet<>();

        days.add("Senin");
        days.add("Selasa");
        days.add("Rabu");

        System.out.println(days.toArray()[1]);

        for (var item: days) {
            System.out.println(item);
        }

        for(var i = 0; i < days.toArray().length; i++) {
            System.out.println(days.toArray()[i]);
        }
//
//        System.out.println(days);
    }
}
