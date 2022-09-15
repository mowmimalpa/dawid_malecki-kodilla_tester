import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Wprowadź ocenę");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        System.out.println("Wprowadzona ocena to: " + input);

        switch(input) {
               case 1 -> System.out.println("Czemu tak mało? Tylko 1!");
                case 2 -> System.out.println("Troszkę lepiej,ale nadal słabo!");
                case 3,4 -> System.out.println("Nie przyjmuję ani 3,ani 4! Tylko 5!");
case 5 -> System.out.println("No nareszcie!");
}
}
}