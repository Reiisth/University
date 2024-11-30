import java.util.Scanner;

class MultiplicationTable {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = input.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i<size; i++){
            for (int j = 0; j<size; j++){
                arr[i][j] = (i+1)*(j+1);
            }
        }

        System.out.println("Multiplication Table:");
        for (int i = 0; i<size; i++){
            for (int j = 0; j<size; j++){
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
        input.close();
    }
}