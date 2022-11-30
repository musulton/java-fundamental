import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void blabla(List<String> args) {
        for (var i = 0; i < args.toArray().length; i++) {
            System.out.println(args.toArray()[i]);
        }

        System.out.println(args.get(0));
    }


    public static void main(String[] args) {
//        String[] arrayString = {
//                "Muhammad", "Sulton", "Fatih"
//        };
//
//        String[] arrayString2 = new String[3];
//
//        arrayString2[0] = "Muhammad";
//        arrayString2[1] = "Sulton";
//        arrayString2[2] = "Fatih";
//
//        arrayString2[2] = "Al Fatih";
//
//        int numberOne = 1;
//
//        System.out.println(numberOne++);
//        System.out.println(numberOne);

    }
}
