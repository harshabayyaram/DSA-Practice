package week6;

import java.util.Scanner;

public class AreaSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = side*side;
        System.out.println("area is"+area);

        sc.close();
    }
}
