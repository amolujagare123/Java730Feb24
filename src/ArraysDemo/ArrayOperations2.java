package ArraysDemo;

public class ArrayOperations2 {

    public static void main(String[] args) {

        int[] intArray = {12, 34, 56, 78, 45, 23, 89, 67, 98, 21,
                43, 76, 54, 32, 87, 90, 65, 78, 99, 10,
                20, 30, 40, 50, 60};

        // Print values which are multiples of 3 (divisible by 3)
        System.out.println("==>> values which are multiples of 3 ");

       for (int i=0;i<intArray.length;i++)
        {
            if(intArray[i] % 3 ==0  )
                System.out.print(intArray[i]+"\t");
        }
       // System.out.println();
        System.out.println("\n==>> Using for each values which are less than 50");

        for (int x : intArray)
        {
            if(  x % 3 ==0  )
                System.out.print(x +"\t");
        }
    }
}
