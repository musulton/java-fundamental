import com.enigmacamp.mobilelegend.Heroes;

import java.util.ArrayList;
import java.util.Set;

public class ArrList {
    public static void main(String[] args) {
        Heroes gatot = new Heroes("Gatot", 100, 100, 50, 30);
        Heroes gusion = new Heroes("Gusion", 100, 100, 50, 30);

        ArrayList<String> days = new ArrayList<>();

//        days.add("Senin"); // 0
//        days.add("Selasa"); // 1
//        days.add("Rabu"); // 2
//        days.add("Kamis"); // 3
//        days.add("Jumat"); // 4
//        days.add("Sabtu"); // 5
//        days.add("Minggu"); // 6

        for (var item: days) {
            System.out.println(item);
        }

        System.out.println("Panjang " + days.size());

//        ArrayList<Heroes> arr = new ArrayList<>();
//        arr.add(gatot);
//        arr.add(gusion);
//
//        Heroes[] example =  {
//               gatot, gusion
//        };
//
//        System.out.println(arr);
//        System.out.println(example[0]);
    }
}
