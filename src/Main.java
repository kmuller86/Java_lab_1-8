import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        {
            Scanner scan = new Scanner(System.in);

            double[] tab = new double[5];
            for (int i=0; i<tab.length; i++)
            {
                System.out.println("Podaj liczbe zmiennoprzecinkową");
                double tmp = scan.nextDouble();
                tab[i] = tmp;
            }

            System.out.println("tab[5] =  " + tab[0] + ", " + tab[1] + ", " + tab[2] + ", " + tab[3] + ", " + tab[4]);
        }
    }
}
