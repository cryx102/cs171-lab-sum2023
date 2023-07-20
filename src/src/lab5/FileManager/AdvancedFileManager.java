package lab5.FileManager;

import java.beans.Customizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AdvancedFileManager extends FileManager implements Customizable {
    @Override
    public void customize(String firstInput, String secondInput, String outputName) throws IOException {
        BufferedReader input1Reader = new BufferedReader(new FileReader(firstInput));
        BufferedReader input2Reader = new BufferedReader(new FileReader(secondInput));
        FileWriter outputWriter = new FileWriter(outputName);

        String lineInput1 = null;
        String lineInput2 = null;

        while (((lineInput1 = input1Reader.readLine()) != null && (lineInput2 = input2Reader.readLine()) != null)
                || ((lineInput1 = input1Reader.readLine()) != null)
                || ((lineInput2 = input2Reader.readLine()) != null)) {

            if (lineInput1 != null) {
                outputWriter.write(lineInput1);
                outputWriter.write("\n");
            }
            if (lineInput2 != null) {
                outputWriter.write(lineInput2);
                outputWriter.write("\n");
            }
        }

        input1Reader.close();
        input2Reader.close();
        outputWriter.close();
    }

    @Override
    public void customize(String input1, String input2) throws IOException {
        String output = "src/output.txt";
        this.customize(input1, input2, output);
    }

    @Override
    void read(String input) throws IOException {
        BufferedReader input1Reader = new BufferedReader(new FileReader(input));
        while (input1Reader.readLine() != null) {
            System.out.println(input1Reader.readLine());
        }
    }
    @Override
    void write(String output, String content) throws IOException {
        FileWriter outputWriter = new FileWriter(output);
        outputWriter.write(content);
        outputWriter.write("/n");
        outputWriter.close();
    }
}
