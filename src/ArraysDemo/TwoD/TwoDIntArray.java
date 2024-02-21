package ArraysDemo.TwoD;

public class TwoDIntArray {

    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] = 23;
        a[0][1] = 33;
        a[0][2] = 43;

        a[1][0] = 27;
        a[1][1] = 38;
        a[1][2] = 49;

        a[2][0] = 17;
        a[2][1] = 18;
        a[2][2] = 19;

        a[3][0] = 57;
        a[3][1] = 68;
        a[3][2] = 79;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);


        for (int i=0;i<row ;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
