public class LargestNumber {

    public static void main(String[] args) {

        int[] arr = { 5, 8, 2, 10, 3 };

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

        }

        System.out.println("Largest number is: " + largest);

    }
}