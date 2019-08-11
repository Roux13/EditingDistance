import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private void run() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        String str1 = input.readLine();
        String str2 = input.readLine();
        int n = str1.length() + 1;
        int m = str2.length() + 1;
        int[][] editingDistance = new int[n][m];
        for (int initI = 1; initI < n; initI++) {
            editingDistance[initI][0] = initI;
        }
        for (int initJ = 1; initJ < m; initJ++) {
            editingDistance[0][initJ] = initJ;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

            }
        }
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

}
