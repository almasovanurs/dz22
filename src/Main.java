import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("English Alphabets.txt");
        fileWriter.write("alphabets: \n Aa\n Bb\n Cc\n Dd\n Ee\n Ff\n Gg\n Hh\n Ii\n Jj\n Kk\n Ll\n Mm\n Nn\n Oo\n ...");
        fileWriter.write("numbers: \n 0\n 1\n 2\n 3\n 4\n 5\n 6\n 7\n 8\n 9\n 10");
        fileWriter.close();

        FileReader fileReader = new FileReader("English Alphabets.txt");
        Scanner scanner = new Scanner(fileReader);
        int i = 0;
        while (scanner.hasNextLine()){
            System.out.println(i + " * " + scanner.nextLine());
            i++;
        }fileReader.close();


    }
}