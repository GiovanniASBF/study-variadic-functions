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
}
