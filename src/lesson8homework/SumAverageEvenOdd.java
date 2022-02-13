package lesson8homework;

public class SumAverageEvenOdd {
    public static void main(String[] args) {
        int even = 0, odd = 0, evenTwo = 0, oddTwo = 0;
        double average, averageTwo, total = 0, totalTwo = 0;

        int arr[] = new int[]{1, 3, 4, 6, 2, 3, 13, 12, 9};
        int arrTwo[][] = new int[][]{{10, 7, 8, 6, 4, 12, 13}, {5, 3, 11, 7, 14, 19, 5}};


        for (int i = 0; i < arr.length; i++) {

            total += arr[i];
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;

        }
        average = total / arr.length;


        System.out.println("Sum of even elements first array:" + even);
        System.out.println("Sum of odd  elements first array: " + odd);
        System.out.println("Average in first array :  " + average);

        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrTwo[i].length; j++) {

                totalTwo += arrTwo[i][j];
                if (arrTwo[i][j] % 2 == 0)
                    evenTwo++;
                else
                    oddTwo++;
            }
        }
        averageTwo = totalTwo / arrTwo.length;

        System.out.println("Sum of even elements in second array: " + evenTwo);
        System.out.println("Sum of odd elements in second array: " + oddTwo);
        System.out.println("Average in second array: " + averageTwo);

    }
}
