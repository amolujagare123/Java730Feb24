package ArraysDemo;

public class ArrayStringAnother {

    public static void main(String[] args) {


        String[] stArr = {"Amol", "Amit", "Priya", "Rahul", "Deepika",
                "Suresh", "Neha", "Vikram", "Anjali", "Rajesh"};
/*
        for (int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);*/

        for(String str : stArr )
            System.out.println(str);


    }
}
