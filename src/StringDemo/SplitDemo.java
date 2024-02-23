package StringDemo;

public class SplitDemo {

    public static void main(String[] args) {

        String str = "We cut bamboo stick";
        String[] stArr = str.split("b");

        for (int i=0;i< stArr.length;i++)
        {
            System.out.println(stArr[i]);
        }
    }
}
