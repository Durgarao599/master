public class PatternMatching {
    public static void main(String[] args) {
        Object obj = "123";
        String result = switch (obj) {
            case Integer i -> "This is Integer Pattern: " + i;
            case String s -> "This is String Pattern : " + s;
            case Double d -> "This is Double Pattern : " + d;
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}
