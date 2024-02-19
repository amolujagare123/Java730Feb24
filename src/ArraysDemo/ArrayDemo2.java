package ArraysDemo;

public class ArrayDemo2 {
    public static void main(String[] args) {

        String[] stArr = new String[10];

        stArr[0] = "Amol";
        stArr[1] = "Amit";
        stArr[2] = "Priya";
        stArr[3] = "Rahul";
        stArr[4] = "Deepika";
        stArr[5] = "Suresh";
        stArr[6] = "Neha";
        stArr[7] = "Vikram";
        stArr[8] = "Anjali";
        stArr[9] = "Rajesh";

      /*  for (int i=0;i< stArr.length ; i++)
            System.out.println(stArr[i]);*/

        for(String str : stArr )
            System.out.println(str);

    }
}
