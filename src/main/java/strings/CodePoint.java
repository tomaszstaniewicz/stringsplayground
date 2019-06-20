package strings;

public class CodePoint {

    public static void main(String[] args) {
        
        String stringWithUnicodeSignOverFFFF = "Ma\uD800\uDC00lice";

        int codePoint2 = stringWithUnicodeSignOverFFFF.codePointAt(2);
        System.out.println( Character.isSupplementaryCodePoint(codePoint2));

        char char3 = stringWithUnicodeSignOverFFFF.charAt(3);
        System.out.println( Character.isSurrogate(char3));

        char char4 = stringWithUnicodeSignOverFFFF.charAt(4);
        System.out.println( Character.isSurrogate(char4));

        char[] chars = Character.toChars(codePoint2);
        System.out.println(chars);

        System.out.println("------------------");
        stringWithUnicodeSignOverFFFF.codePoints().forEach(System.out::println);
    }
}
