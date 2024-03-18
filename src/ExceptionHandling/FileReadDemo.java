package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadDemo {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("D:\\amol1.txt");
        System.out.println("File exists and we read the file successfully");
    }
}
