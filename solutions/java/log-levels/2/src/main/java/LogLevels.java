public class LogLevels {
    public static String message(String logLine) {
        int start = logLine.indexOf(":");
        return logLine.substring(start + 1).strip();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        return logLine.substring(start + 1, end).toLowerCase();
    }

    public static String reformat(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        return message(logLine) + " " + "(" + logLevel(logLine) + ")";
    }
}
