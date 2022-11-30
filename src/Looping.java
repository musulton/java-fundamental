public class Looping {
    public static void main(String[] args) {
//        String[] arr = {
//                "Muhammad", "Sulton", "Fatih"
//        };

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

//        String destination = "Sukabumi";
//        while (destination != "Jakarta") {
//            System.out.println("Anda berada di " + destination);
//
//            if (destination == "Sukabumi") {
//                destination = "Ciawi";
//            } else if (destination == "Ciawi") {
//                destination = "Bogor";
//            } else if (destination == "Bogor") {
//                destination = "Depok";
//            } else if (destination == "Depok") {
//                destination = "Jakarta";
//            }
//        }
//
//        System.out.println("Anda sudah sampai di " + destination);

//        int number = 0;
//        while (number < 5) {
//            number++;
//            if (number == 2) {
//                continue;
//            }
//            System.out.println(number);
//        }

//        System.out.println("Luar looping " + number1);

        int number2 = 1;
        do {
            number2++;
            if (number2 == 2) {
                continue;
            }
            System.out.println(number2);
        } while (number2 <= 5);

    }
}
