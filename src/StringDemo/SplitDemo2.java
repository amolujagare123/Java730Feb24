package StringDemo;

public class SplitDemo2 {

    public static void main(String[] args) {

        String str = "it is not like this for his opinion";
        String[] stArr = str.split("is");

        for (int i=0;i< stArr.length;i++)
        {
            System.out.println(stArr[i]);
        }
    }
}
