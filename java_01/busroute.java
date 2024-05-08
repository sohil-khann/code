import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coords = new int[n];
        for (int i = 0; i < n; i++) {
            coords[i] = scanner.nextInt();
        }

      
        int[] diffs = new int[n * (n - 1) / 2];
        int i = 0;
        for (int j = 0; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                diffs[i++] = Math.abs(coords[j] - coords[k]);
            }
        }

     
        int minDiff = diffs[0];
        int minDiffCount = 0;
        for (int diff : diffs) {
            if (diff == minDiff) {
                minDiffCount++;
            } else if (diff < minDiff) {
                minDiff = diff;
                minDiffCount += 1;
            }
        }

    
        System.out.println(minDiff + " " + minDiffCount);
    }
}