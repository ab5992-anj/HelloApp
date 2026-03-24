public class HelloApp {
    public static void main(String[] args) {
        String greeting;
        
        if (args.length == 0) {
            // No names provided - default greeting
            greeting = "Hello, World!";
        } else {
            // Build greeting with all provided names
            StringBuilder nameBuilder = new StringBuilder();
            
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                // Add comma and space between names, but not after the last one
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            
            greeting = "Hello, " + nameBuilder.toString() + "!";
        }
        
        System.out.println(greeting);
    }
}
