package lab5.FileManager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String input1 = "src/src/input1.txt";
        String input2 = "src/src/input2.txt";
        String output = "src/src/output.txt";

        AdvancedFileManager fileManager = new AdvancedFileManager();
        fileManager.customize(input1, input2, output);

        String content = "Hello World!";
        fileManager.write("src/src/test.txt", content);
        fileManager.read("src/src/test.txt");
    }
}
