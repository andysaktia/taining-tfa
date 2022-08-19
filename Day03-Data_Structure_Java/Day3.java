import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day3 {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        /*
         * String text = scanner.nextLine(); int num = scanner.nextInt();
         * 
         */

        // 1 array merge
        // Input: ['kazuya', 'jin', 'lee'], ['kazuya', 'feng']
        // Output: ['kazuya', 'jin', 'lee', 'feng']

        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("kazuya", "jin", "lee"));
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("kazuya", "feng"));

        List<String> listTwoCopy = new ArrayList<>(listTwo);
        listTwoCopy.removeAll(listOne);
        listOne.addAll(listTwoCopy);

        System.out.println(listOne);

        // 2 cek num
        // Input: “76523752”
        // Output: [6, 3]

    }
}