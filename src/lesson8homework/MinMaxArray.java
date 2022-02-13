package lesson8homework;

public class MinMaxArray {

    public int max(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {13, 42, 26, 54, 105};
        MinMaxArray m = new MinMaxArray();
        System.out.println("Maximum value in the array is: " + m.max(arr));
        System.out.println("Minimum value in the array is: " + m.min(arr));
    }
}






