import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        {
            int Int = 88888;
            double Double = 8.9797;
            long Long = 180319971435L;
            char Char = 'K';
            short Short = 12;
            float Float = 8.97f;
            byte Byte = 01;
            boolean Boolean = false;
            String String = "Name";

            System.out.println(Int);
            System.out.println(Double);
            System.out.println(Long);
            System.out.println(Char);
            System.out.println(Short);
            System.out.println(Float);
            System.out.println(Byte);
            System.out.println(Boolean);
            System.out.println(String);
        }
        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        {
            int a = 16;
            int b = 4;
            double c = 2.56;
            double d = 4.27;

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));

            System.out.printf("d + c = %.2f\n", (d + c));
            System.out.printf("d - c = %.2f\n", (d - c));
            System.out.printf("d * c = %.2f\n", (d * c));
            System.out.printf("d / c = %.2f\n", (d / c));
            System.out.println("d % c = " + (d % c));
        }

    }
}
