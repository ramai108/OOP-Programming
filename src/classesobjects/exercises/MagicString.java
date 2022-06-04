package classesobjects.exercises;

public class MagicString {

    private String s1;
    private String s2;
    private String s3;
    private String out;

    public String getString() {
        return out;
    }

    public MagicString(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void concatenate() {
        out = s1 + " " + s2 + " " + s3;
    }

    public String getFirstChar() {
        return Character.toString(out.charAt(0));
    }

    public String get42chars() {
        return out.substring(0, 43);
    }

    public boolean isTriple() {
        return out.equals("424242");
    }

    public boolean doesitexist(String in) {
        return out.contains(in);
    }

    public static void main(String[] args) {

        MagicString ms = new MagicString("Erik", "Lehnsherr", "Magneto");
        ms.concatenate();
        System.out.println(ms.getString());
        System.out.println(ms.getFirstChar());
        System.out.println(ms.doesitexist("42"));
        System.out.println(ms.get42chars());
    }

}
