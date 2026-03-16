import java.util.Scanner;

public class OptimizeCodeToCheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        // if isprime remain true till the end of the code then it will be prime number
        boolean isprime = true;

        // if number is less then or equal to 1 are not prime number
        if (num <= 1) {
            isprime = false;
        }

        // check divisibility only upto sqrt(num) because factors repeats after that
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        // If the number is divisible by i then it has more than two factors ~ not prime
        if (isprime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}
