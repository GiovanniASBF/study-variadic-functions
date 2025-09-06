public class SimpleLogger {
    // The '...' tells that the method can receive zero or more arguments of the Object type
    // Internally, 'args' will be an Object[]
    public static void log(String message, Object... args) {
        String formattedMessage;
        if (args == null || args.length == 0) {
            System.out.println(message);
        } else {
            // String.format replaces the placeholders (%s, %d, etc) with the arguments
            formattedMessage = String.format(message.replaceAll("\\{\\}", "%s"), args);
            System.out.println(formattedMessage);
        }
    }

    public static void main(String[] args) {
        String user;
        int transactionId;
        double amount;
    
        user = "Alice";
        transactionId = 42;
        amount = 99.95;
    
        log("Server started at 8080");
        log("User {} logged in.", user);
        log("New transaction {} for {} for the user {}.", transactionId, amount, user);
        // The type's security is assured. The compiler convert the types
        // (int, double) to their coresponding objects (Integer, Double)
        // and put them into 'args' array
    }
}
