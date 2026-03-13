import java.util.Arrays;
import java.util.Scanner;

public class RemoveDublicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a element in index:" + i);
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }

        }

        System.out.println("Array after removing dublicate elements");
        for (int j = 0; j <= i; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}