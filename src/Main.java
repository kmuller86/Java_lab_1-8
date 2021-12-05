import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        {
            Scanner scan = new Scanner(System.in);

            System.out.println("Podaj swój wiek");
            int podanyWiek = scan.nextInt();

            if ((podanyWiek) % 2 == 0)
            {
                System.out.println("Wiek podzielny przez 3");
            }
            else
            {
                System.out.println("Wiek nie podzielny przez 3");
            }
            System.out.println();
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

       {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj nr indeksu");
            int numerIndex = scan.nextInt();

            String czyParzysta = ((numerIndex) % 2 == 0) ? "parzysta" : "nieparzysta";
            System.out.println(czyParzysta);
            System.out.println();
       }

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj dowolną liczbe zmiennoprzecinkową w zakresie od 0,1 do 0,99 i sprawdz czy wygrałeś");
            Double przecinekLiczba = scan.nextDouble();

            if ((przecinekLiczba) == 0.88)
            {
                System.out.println("Wygrałeś");
            }
            else
            {
                System.out.println("Przykro mi spróbuj ponownie");
            }
        }
    }
}


