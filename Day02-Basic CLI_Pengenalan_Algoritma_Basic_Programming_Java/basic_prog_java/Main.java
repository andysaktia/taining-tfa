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
        System.out.println("tL:" + textLower);
        System.out.println("re:" + reverse);
        if (textLower == reverse) {
            System.out.println("Text reverse same");
        } else {
            System.out.println("Text reverse difference");
        }

        // Cek vokal
        int vocal = 0;
        int konsonan = 0;

        for (int n = 0; n < arr.length; n++) {
            if (arr[n] == 'a' || arr[n] == 'i' || arr[n] == 'u' || arr[n] == 'e' || arr[n] == 'o') {
                vocal++;
            } else {
                konsonan++;
            }
        }

        System.out.println("vocal: " + vocal);
        System.out.println("konsonan: " + konsonan);

    }
}