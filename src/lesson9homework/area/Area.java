package lesson9homework.area;

import java.util.Scanner;

public class Area {
    int length, width;

    Area(int l, int w) {
        length = l;
        width = w;

    }

    public int setDim() {
        int result = length * width;
        return result;
    }

    public void getArea() {
        Scanner a = new Scanner(System.in);
        System.out.println("Insert the length and width : ");
        length = a.nextInt();
        width = a.nextInt();
        System.out.println("Area is :" + setDim());
        a.close();
    }



    }

