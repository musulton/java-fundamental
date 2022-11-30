public class Method {

    public static String getName(String name) {
        return "Halo nama saya " + name;
    }

    public static String getName(String firstName, String lastName) {
        return "Halo nama saya " + firstName + " dan " + lastName;
    }

    public static void printWithVariableArgument(String... names) {
        for (var name: names) {
            System.out.println(name);
        }
    }

    public static void printWithoutVariableArgument(String[] names) {
        for (var name: names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        var name = getName("Sulton");
        var name1 = getName("Muhammad", "Sulton");
        System.out.println(name);
        System.out.println(name1);
//        String[] names = {
//          "Muhammad", "Sulton", "Fatih"
//        };
//        printWithoutVariableArgument(names);
    }
}
