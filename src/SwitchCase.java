public class SwitchCase {
    public static void main(String[] args) {
        String grade = "C";

        switch (grade) {
            case "A":
                System.out.println("Lulus dengan nilai sangat baik");
                break;
            case "B":
                System.out.println("Lulus dengan nilai baik");
                break;
            case "C":
                System.out.println("Lulus dengan nilai cukup");
                break;
            default:
                System.out.println("Anda tidak lulus");
        }
    }
}
