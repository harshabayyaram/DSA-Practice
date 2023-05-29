package week6;
import java.util.*;

public class Input {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);

                System.out.println("enter one word value : ");
                String word = sc.next();
                System.out.println("you entered : "+word);

                System.out.println("enter line value : ");
                String line = sc.nextLine();
                System.out.println("you entered : "+line);

                System.out.println("enter number value : ");
                int num = sc.nextInt();
                System.out.println("you entered : "+num);

                System.out.println("enter long value : ");
                long lng = sc.nextLong();
                System.out.println("you entered : "+lng);

                System.out.println("enter float value : ");
                float flt = sc.nextFloat();
                System.out.println("you entered : "+flt);

                System.out.println("enter double value : ");
                double dbl = sc.nextDouble();
                System.out.println("you entered : "+dbl);

                System.out.println("enter boolean value : ");
                boolean bln = sc.nextBoolean();
                System.out.println("you entered : "+bln);

                System.out.println("enter short value : ");
                short shrt = sc.nextShort();
                System.out.println("you entered : "+shrt);
                sc.close();
        }
}