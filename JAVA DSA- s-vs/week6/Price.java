package week6;

import java.util.*;

public class Price {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pen + pencil + eraser;
        float gst = (18* total)/100;

        System.out.println("total is" + total);
        System.out.println("gst is : " + gst);

        sc.close();
        int $ = 24;
        System.out.println($);
    }
}