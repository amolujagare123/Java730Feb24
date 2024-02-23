package ArraysDemo.TwoD;

public class StringTwoDAnother {

    public static void main(String[] args) {


        String[][] stArr = {
                {"John", "Doe", "Smith"},
                {"Alice", "Johnson", "Brown"},
                {"Bob", "Williams", "Jones"},
                {"Emily", "Davis", "Miller"}
        };

        for (int i=0;i< stArr.length;i++)
        {
            for (int j=0;j< stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
