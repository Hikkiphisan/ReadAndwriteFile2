import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReadandWriteFile readandWriteFile = new ReadandWriteFile();
       List<Integer> numbers = readandWriteFile.readFile("input.txt");
       int maxValue = ReadandWriteFile.findMaxValue(numbers);
        readandWriteFile.writeFile("input.txt",maxValue);
    }
}