package Methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsReturningValue {

    int myMethod()
    {
        int x;
        x=90;
        return x;
    }

    char myCharMethod()
    {
        char x;
        x = 'h';
        return x;
    }

    double myDoubleMethod()
    {
        double x;
        x = 78.98;
        return x;
    }

    boolean checkResult(int marks)
    {
        if(marks<40)
            return false;
        else
                return true;
    }

    String reverseMyString(String ss)
    {
        String temp="";

        for (int i=ss.length()-1;i>=0;i--)
        {
            temp = temp + ss.charAt(i);
        }

        return temp;
    }

    // Given Date in string in "dd-MM-yyyy" format
    // convert it into a string with "MM/dd/yyyy" format

    String convertDateFormat(String myDateStr) throws ParseException // dd-MM-yyyy
    {
        SimpleDateFormat sd1 = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sd1.parse(myDateStr);

        SimpleDateFormat sd2 = new SimpleDateFormat("MM/dd/yyyy");
        String convertedDate = sd2.format(date);

        return  convertedDate;
    }

    int[] getMyArray()
    {
        int[] arr = {12,45,6,7,89,12,45,11};
        return arr;
    }

    String convertDateFormat2(String myDateStr) throws ParseException // dd-MM-yyyy
    {
        SimpleDateFormat sd1 = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sd1.parse(myDateStr);

        SimpleDateFormat sd2 = new SimpleDateFormat("MM/dd/yyyy");
       // String convertedDate = sd2.format(date);

        return  sd2.format(date);
    }

    String[][] getMyTwoDArray()
    {
        String[][] st = {
                {"apple", "banana", "orange", "grape", "kiwi"},
                {"carrot", "potato", "lettuce", "tomato", "cucumber"},
                {"dog", "cat", "rabbit", "hamster", "guinea pig"},
                {"red", "blue", "green", "yellow", "purple"}
        };

        return st;
    }

    public static void main(String[] args) {

        int a;
        a = 10;
        System.out.println(a);

        int b = a;
        System.out.println(b);

        MethodsReturningValue ob = new MethodsReturningValue();
        System.out.println(ob.myMethod());
        int c = ob.myMethod();

        System.out.println(ob.checkResult(68));

        System.out.println(ob.reverseMyString("Prakash"));


        int[] myArr = ob.getMyArray();
        for (int i=0; i<myArr.length ;i++)
        {
            System.out.println(myArr[i]);
        }
        System.out.println("below is my 2 dimensional array");
        String[][] myStrArr = ob.getMyTwoDArray();
        for (int i=0;i<myStrArr.length;i++)
        {
            for (int j=0;j<myStrArr[0].length;j++)
            {
                System.out.print(myStrArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
