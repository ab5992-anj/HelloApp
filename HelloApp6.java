public class HelloApp {

    public static void main(String[] args) {

        // Case when no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Add all names with comma
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing comma and space
            String result = nameBuilder.substring(0, nameBuilder.length() - 2);

            // Final output
            System.out.println("Hello, " + result + "!");
        }
    }
}
