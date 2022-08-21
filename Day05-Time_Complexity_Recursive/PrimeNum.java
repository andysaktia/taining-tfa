import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();

        if (primeNumber(a) == true){
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }
        System.out.println(primeNumber(7));
    }

    static boolean primeNumber(int number) {
            if (number <= 1) {
                return false;
            } else if (number == 2) {
                return true;
            } else if (number % 2 == 0){
                return false;
            }

            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if(number % 1 == 0){
                    return  false;
                }
            }
            return  true;
    }

}
