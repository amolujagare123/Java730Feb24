package StringDemo;

public class StringSubstringDemo2 {

    public static void main(String[] args) {
        String str = "I can now earn 6 lac per year !";
        // "ow earn 6 lac per y"
        System.out.println(str.substring(7,22));

        // It returns the string starting with beginIndex
        // character till the endIndex character.
        //Note: (1) The beginIndex character is inclusive
        //(2) The endIndex character is not inclusive
    }
}
