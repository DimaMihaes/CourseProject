package lesson8homework;

public class CopyArray {
    public static void main(String[] args) {
        int firstArray[] = new int[]{3, 4, 6, 3, 1, 2};
        int secondArray[] = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        System.out.println("First array: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(" " + firstArray[i]);
        }
        System.out.println("\n Second array: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(" " + secondArray[i]);
        }


    }
}
