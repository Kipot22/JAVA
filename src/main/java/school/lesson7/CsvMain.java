package school.lesson7;

import java.io.*;

public class CsvMain {
    public class AppData{
        String[] header = new String[] {"Value1", "Value2", "Value3"};
        private int[][] data = {{100,200,123},{300,400,500},{600,700,800}};
    };

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            File file = new File("C:\\Users\\Татьяна\\IdeaProjects\\MyJava\\src\\main\\java\\school\\lesson7\\newFile3.csv");

            PrintWriter pw = new PrintWriter(file);
            Object AppData = new Object();
            pw.println(AppData);
            pw.close();

            br = new BufferedReader(new FileReader("C:\\Users\\Татьяна\\IdeaProjects\\MyJava\\src\\main\\java\\school\\lesson7\\newFile3.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }

        }
    }
}