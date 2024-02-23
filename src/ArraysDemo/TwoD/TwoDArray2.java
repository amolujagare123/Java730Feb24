package ArraysDemo.TwoD;

public class TwoDArray2 {

    public static void main(String[] args) {


        int[][] aa = {
                {12,34,56},
                {22,54,86},
                {32,64,96},
                {42,74,16}
        };

        System.out.println("row="+aa.length);
        System.out.println("col="+aa[0].length);

        for (int i=0;i<aa.length;i++)
        {
            for (int j=0;j<aa[0].length;j++)
            {
                System.out.print(aa[i][j]+" ");
            }
            System.out.println();
        }


    }
}
