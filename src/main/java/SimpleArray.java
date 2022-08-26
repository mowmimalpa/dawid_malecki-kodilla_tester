public class SimpleArray {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5 = 5;
        System.out.println("Moja tablica zawiera 5 liczb");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        int[] tablica = new int[5];



        tablica[0]=1;
        tablica[1]=2;
        tablica[2]=3;
        tablica[3]=4;
        tablica[4]=5;
        int numberOfElements = tablica.length;

        System.out.println(tablica.length);


    }
}