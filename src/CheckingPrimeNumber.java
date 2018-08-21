import java.util.Scanner;

public class CheckingPrimeNumber {
    public static void main(String[] args) {
        int number = getNumber();
        if (isPrime(number)) {
            System.out.println("Là số nguyên tố");
        } else {
            System.out.println("Không là số nguyên tố");
        }
    }

    private static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số:");
        return scanner.nextInt();
    }

    private static boolean isPrime(double numnber) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(numnber); i++) {
            if (numnber % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
