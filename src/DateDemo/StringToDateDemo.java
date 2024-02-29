package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateDemo {

    public static void main(String[] args) throws ParseException {
        String dateStr = "10/04/2019"; // dd/MM/yyyy
        System.out.println("dateStr="+dateStr);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sd.parse(dateStr);
        System.out.println("Date="+date);


        String dateStr0= "23-June-2016" ;
        // dd-MMMM-yyyy
        System.out.println("dateStr0="+dateStr0);
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println("Date0="+date0);


        String dateStr1= "23 | June 16  8:34" ;
        // dd | MMMM yy hh:mm
        System.out.println("dateStr1="+dateStr1);
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println("Date1="+date1);

        String dateStr2= "2016-06-23 | 8:34:23 PM";
        // yyyy-MM-dd | hh:mm:ss
        System.out.println("dateStr1="+dateStr2);
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss aa");
        Date date2 = sd2.parse(dateStr2);
        System.out.println("Date1="+date2);


        String dateStr3= "Thursday 2016/06/23";
        // EEEE yyyy/MM/dd

        String dateStr4= "23-06-2016 | thu | 8:34" ;
        // dd-MM-yyyy | E | hh:mm

        String dateStr5= "8:34:22";
        // hh:mm:ss

    }
}
