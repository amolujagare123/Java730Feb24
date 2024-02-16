package loops;

public class FibonancciSeries {

    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a+" "+b);

// travers below for loop for 5 times only

//for(int i=1; i<=(n-2) ;i++)
//for(int i=1; i<n-1 ;i++)
        for(int i=3; i<=n ;i++)
        {
            sum = a + b;
            System.out.print(" "+sum);
            a= b;
            b =sum;
        }
    }
}
