package loops;

public class EvenOddDemo {

    // print 1 to 10 numbers & also print if they are even or odd

    public static void main(String[] args) {
        for (int i=1;i<=10 ;i++)
        {
            if( i % 2 == 0 )
              System.out.println(i + " Even");
            else
                System.out.println(i + " Odd");
        }
    }

}
