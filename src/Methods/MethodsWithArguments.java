package Methods;

public class MethodsWithArguments {

    void noArgument()
    {
        System.out.println("no argument");
    }

    void areaCircle(double r)
    {
        System.out.println("r="+r);
        double area = 3.14 * r * r ;
        System.out.println("area="+area);
    }

    void areaRectangle(int l,int b)
    {
        System.out.println("l="+l);
        System.out.println("b="+b);
        int area = l * b ;
        System.out.println("Rectangle area="+area);
    }

    void printDetails(int rno,String name,double percentage)
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("percentage="+percentage);
    }


        void printEvenNumbersFromArray(int[] arr)
        {
            System.out.println("all even numbers from array");
            for (int i=0;i<arr.length;i++)
            {
                if (arr[i]%2==0)
                    System.out.print(arr[i]+"  ");
            }
            System.out.println();
        }

        void printTwoDArray(String[][] stArr)
        {
            for (int i=0;i< stArr.length ; i++) {

                for (int j = 0; j < stArr[0].length; j++)
                {
                    System.out.print(stArr[i][j]+"\t");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        MethodsWithArguments ob = new MethodsWithArguments();

        ob.areaCircle(45);
        ob.areaRectangle(23,67);
        ob.printDetails(45,"Jey",88.98);

        int[] a = {78,12,3,45,1,11,34,67,89,34,67,33};

        ob.printEvenNumbersFromArray(a);

        String[][] st = {
                {"apple", "banana", "orange", "grape", "kiwi"},
                {"carrot", "potato", "lettuce", "tomato", "cucumber"},
                {"dog", "cat", "rabbit", "hamster", "guinea pig"},
                {"red", "blue", "green", "yellow", "purple"}
        };

        ob.printTwoDArray(st);
    }

}
