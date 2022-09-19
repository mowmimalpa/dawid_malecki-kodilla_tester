import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int ilosc_liczb = 5000, i;
        double liczba, suma = 0, min, max;
        System.out.println("Program losuje " + ilosc_liczb + "liczb "
                + "całkowitych od 0 do 30,");
        System.out.println("a następnie znajduje najmniejszą i największą");
        Random r = new Random();
        min = Math.round(30 * (r.nextDouble()));
        System.out.println();
        System.out.print("Wylosowano liczby: " + min + ", ");
        max = min;
        for (i = 1; i <= ilosc_liczb - 1; i++) {
            liczba = Math.round(30 * (r.nextDouble()));
            System.out.print(liczba + ", ");
            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;
        }
        System.out.println();
        System.out.println("największa liczba to " + max + ",");
        System.out.println("najmniejsza liczba to " + min + ",");

    }
}