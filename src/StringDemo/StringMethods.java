package StringDemo;

public class StringMethods {

    public static void main(String[] args) {

        String str = "I can now earn 6 lac per year";

        System.out.println(str.endsWith("rt"));
        System.out.println(str.startsWith("I"));
        System.out.println(str.startsWith("Ican"));
        System.out.println(str.contains("can"));
    }
}
