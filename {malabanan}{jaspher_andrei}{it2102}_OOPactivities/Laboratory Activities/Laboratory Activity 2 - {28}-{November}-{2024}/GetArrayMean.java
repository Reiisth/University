import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int ctr = 0; ctr < n; ctr++) {
            System.out.print("Enter number: ");
            arr[ctr] = input.nextInt();
        }

        float mean = getArrayMean(arr);
        System.out.println("Mean of array is: " + mean);
    }

    public static float getArrayMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (float) sum / arr.length;
    }
}
