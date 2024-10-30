import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ReadandWriteFile {
    public List<Integer> readFile(String pathFile) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Tệp không tìm thấy: " + e.getMessage());
        }

        catch (IOException e) {
            System.out.println("Loi IO");
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public void writeFile(String filepath, int max) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath, true));
            bufferedWriter.write(max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMaxValue(List<Integer> numbers) {
        // Kiểm tra nếu danh sách trống
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Danh sách rỗng, không thể tìm giá trị lớn nhất.");
        }

        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
