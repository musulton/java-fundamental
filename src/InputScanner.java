import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int a = input.nextInt();
            if (a >= 8 && a <= 12 || a >= 14 && a <= 17){
                System.out.println("JAM BELAJAR");
            } else if (a > 0 && a <= 8 || a > 17 || a > 12 && a < 14){
                System.out.println("JAM ISTIRAHAT");
            } else if (a < 0 || a > 24) {
                System.out.println("WAKTU HANYA 24 JAM");
            }
        } catch (Exception e) {
            System.out.println("INPUTAN TIDAK BENAR");
        }
    }
}
