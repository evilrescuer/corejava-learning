package mark;

public class CodePoint {
    public static void main(String[] args) {
        String sentence = "¢Very good!";
        int cp = sentence.codePointAt(0);
        System.out.println(cp);
    }
}
