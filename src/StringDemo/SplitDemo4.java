package StringDemo;

public class SplitDemo4 {

    public static void main(String[] args) {

        String str = "tom why are you too late and  so lazy";
        String[] stArr = str.split(" ");
        // print only the words whose second character is 'o'

        for (int i=0;i< stArr.length;i++)
        {

               System.out.println(stArr[i]);
        }
    }
}
