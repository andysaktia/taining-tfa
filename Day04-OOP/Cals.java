import java.util.Scanner;

public class Cals {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println("pilih operator: 1[+], 2[-], 3[/], 4[*]");
        int c = read.nextInt();
        switch (c) {
            case 1:

                Calculator add = new AddCal(a, b);
                System.out.println(add.toString());
                break;
            case 2:

                Calculator min = new MinCal(a, b);
                System.out.println(min.toString());
                break;
            case 3:

                Calculator bagi = new BagiCal(a, b);
                System.out.println(bagi.toString());
                break;
            case 4:

                Calculator kali = new KaliCal(a, b);
                System.out.println(kali.toString());
                break;

            default:
                break;
        }
    }

}

abstract class Calculator {
    abstract int result();

    public String toString() {
        return "hasil penjumlahan: " + result();
    };

}

class AddCal extends Calculator {
    int a;
    int b;

    public AddCal(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int result() {
        return a + b;
    }

}

class MinCal extends Calculator {
    int a;
    int b;

    public MinCal(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int result() {
        return a - b;
    }

}

class BagiCal extends Calculator {
    int a;
    int b;

    public BagiCal(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int result() {
        return a / b;
    }

}

class KaliCal extends Calculator {
    int a;
    int b;

    public KaliCal(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int result() {
        return a * b;
    }

}