import java.util.Scanner;

public class pcph {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        char[][] cake = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                cake[i][j] = line.charAt(j);
            }
        }

        int happiness = calculateHappiness(cake);
        System.out.println(happiness);
    }

    private static int calculateHappiness(char[][] cake) {
        int n = cake.length;
        int happiness = 0;

        // Count chocolates in each row and column
        int[] chocolatesInRow = new int[n];
        int[] chocolatesInColumn = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cake[i][j] == 'C') {
                    chocolatesInRow[i]++;
                    chocolatesInColumn[j]++;
                }
            }
        }

        // Calculate happiness by counting pairs
        for (int i = 0; i < n; i++) {
            happiness += (chocolatesInRow[i] * (chocolatesInRow[i] - 1)) / 2; // Rows
            happiness += (chocolatesInColumn[i] * (chocolatesInColumn[i] - 1)) / 2; // Columns
        }

        return happiness;
    }
}
