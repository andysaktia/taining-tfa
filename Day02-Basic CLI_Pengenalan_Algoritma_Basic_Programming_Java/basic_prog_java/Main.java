import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int num = scanner.nextInt();

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

        // 1 Cek vokal dan konsonan
        System.out.println("----vokal dan konsonan----");
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

        // 2 cek char x and o
        System.out.println("----x dan o----");
        int sumX = 0;
        int sumO = 0;
        for (int m = 0; m < arr.length; m++) {
            if (arr[m] == 'x') {
                sumX++;
            } else {
                sumO++;
            }
        }
        if (sumX == sumO) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // 3 faktor bilangan
        System.out.println("----faktor bilangan----");
        for (int k = 1; k <= num; k++) {
            if (num % k == 0) {
                System.out.println(k);
            }
        }
        // 4 Bilangan prima
        System.out.println("----bilangan prima----");
        int sisaBagi = 0;
        for (int x = 2; x < num; x++) {
            if (num % 2 == 0) {
                sisaBagi++;
            }
        }
        if (sisaBagi == 0) {
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }

        // 7 Play with asterik
        System.out.println("----play with asterik----");
        int b = 0;
        for (int a = 1; a <= num; a++, b = 0) {
            for (int s = 1; s <= num - a; s++) {
                System.out.print("  ");
            }

            while (b != 2 * a - 1) {
                System.out.print("* ");
                b++;
            }

            System.out.println();
        }
    }
}