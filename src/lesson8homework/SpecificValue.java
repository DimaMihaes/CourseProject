package lesson8homework;

public class SpecificValue {
    public static void main(String[] args) {
        int array[] = new int[]{3, 7, 56, 22, 2, 54, 12, 23};
        int specificNum = 22;
        boolean f = false;

        for (int i : array) {
            if (i == specificNum) {
                f = true;
                break;

            }
        }
        if (f)
            System.out.println(specificNum + " - Specific number is found.");
        else
            System.out.println(specificNum + " Specific number is not found.");

    }
}
