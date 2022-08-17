import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Loop reverse
        String textLower = text.toLowerCase();
        char[] arr = textLower.toCharArray();
        String reverse = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse += arr[i];
        }
        if (textLower == reverse) {
            System.out.println("Text reverse same");
        } else {
            System.out.println("Text reverse dif");
        }

        // Cek vokal konsonan

    }
}