import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifference(arr, k);
        System.out.println(count);
    }

    public static int countPairsWithDifference(int[] arr, int k) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : arr) {
            numbers.add(num);
        }

        int count = 0;
        for (int num : arr) {
            if (numbers.contains(num + k)) {
                count++;
            }
        }

        return count;
    }
}