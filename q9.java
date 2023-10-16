//Java program to calculate  sum of 1D and 2D array using method overloading

class ArrayCalculator {

    int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    int sum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayCalculator A = new ArrayCalculator();
        int arr1D[] = {1, 2, 3, 4, 5};
        int arr2D[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Sum of 1D array: " + A.sum(arr1D));
        System.out.println("Sum of 2D array: " + A.sum(arr2D));
    }
}