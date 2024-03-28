package WrapperClassDemo;

public class Wrapper1 {

    public static void main(String[] args) {

        int i = 5;
        System.out.println("i="+i);
        Integer ii = new Integer(i); // boxing / wrapping
        System.out.println("ii="+ii);

        Integer ii1 = 5;
        Integer ii2 = i; // auto boxing / auto wrapping
        System.out.println("ii1="+ii1);
        System.out.println("ii2="+ii2);

    }
}
