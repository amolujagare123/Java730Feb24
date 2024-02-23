package StringDemo;

public class SplitDemo3 {

    public static void main(String[] args) {

        String str = "Hey Baby you are so lovely";
        String[] stArr = str.split(" ");//{Hey , Baby, you, are, so, lovely }
        // print only the words that ends  with 'y'

        for (int i=0;i< stArr.length;i++) // i = 0 / hey
        {
            String currStr = stArr[i];
            int l = currStr.length();

            if(currStr.charAt(l-1) == 'y' ) // check whether the last char of the word is y or not
               System.out.println(stArr[i]);
        }
    }
}
