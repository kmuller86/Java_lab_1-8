import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj swoje imię");
            String tekst = scan.next();

            System.out.println("Podaj swoje Nazwisko");
            String tekst2 = scan.next();

            System.out.println("Podaj swój wiek");
            int liczba = scan.nextInt();

            System.out.println("Podaj swój numer indeksu");
            int liczba2 = scan.nextInt();

            System.out.println("Imię i Nazwisko: " + tekst + " " + tekst2);
            System.out.println("Wiek: " + liczba);
            System.out.println("Numer indeksu: " + liczba2);
            System.out.printf("Imię i Nazwisko: " + (tekst) + " " + (tekst2) + ", Wiek: " + (liczba) + ", Numer indeksu: " + (liczba2));
            System.out.println();
        }
        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj a");
            int a = scan.nextInt();

            System.out.println("Podaj b");
            int b = scan.nextInt();

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        }
    }
}
